package com.hframework.listener;

import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.common.frame.ServiceFactory;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.file.FileUtils;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.container.bean.Entity;
import com.hframework.generator.web.container.bean.EntityAttr;
import com.hframework.generator.web.sql.HfModelService;
import com.hframework.generator.web.sql.SqlGeneratorUtil;
import com.hframework.generator.web.sql.reverse.SQLParseUtil;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 将hframe项目的配置生成hframe.sql文件
 * sql_file_path=D\://my_workspace/hframe-trunk/hframe-core/src/main/resources/hframe/sql/hframe.sql
 * Created by zhangquanhong on 2016/6/13.
 */
@Component
public class DatabaseInitializeListener implements ApplicationContextAware, ServletContextAware {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseInitializeListener.class);

    @Autowired //优先加载ServiceFactory
    private ServiceFactory serviceFactory;
    @Resource
    private CommonDataService commonDataService;

    public void contextDestroyed(ServletContextEvent event) {
    }

    public void setApplicationContext(ApplicationContext webappcontext) throws BeansException {
        String companyCode = "hframework";
        String programCode = "chameleon";
        String programName = "chameleon";
        String moduleCode = "hframe";
        String moduleName = "hframe";
        try {

            String dbSqlPath = SqlGeneratorUtil.createSqlFile(companyCode, programCode);
            HfModelContainer baseModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(dbSqlPath, companyCode, programName, moduleCode, moduleName);

            String configSqlPath = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "/sql/chameleon_ddl.sql";
            HfModelContainer sqlFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(configSqlPath, companyCode, programName, moduleCode, moduleName);

            HfModelContainer[] resultModelContainers =
                    HfModelContainerUtil.mergerModelContainer(baseModelContainer, sqlFileModelContainer);
            if(!resultModelContainers[0].getEntityMap().isEmpty()) {
                HfModelContainer modify = HfModelContainerUtil.getInstance();
                modify.setEntityAttrMap(new HashMap<String, EntityAttr>());
                modify.setEntityMap(new HashMap<String, Entity>());
                final List<String> result = HfModelContainerUtil.getSql(resultModelContainers[0], modify, false, true);
                commonDataService.executeDBStructChange(result);
                configSqlPath = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "/sql/chameleon_data.sql";
                List<String> sqls = FileUtils.readFileToArray(configSqlPath);
                for (String sql : sqls) {
                    if(StringUtils.isNotBlank(sql) && !(sql.trim().startsWith("/*")&& sql.trim().endsWith("*/"))) {
                        commonDataService.executeDBStructChange(sql);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("database initialize error => " + ExceptionUtils.getFullStackTrace(e));
        }
    }

    public void setServletContext(ServletContext servletContext) {

    }
}
