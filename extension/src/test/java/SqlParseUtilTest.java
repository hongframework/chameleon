import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.sql.HfModelService;
import com.hframework.generator.web.sql.reverse.SQLParseUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangqh6 on 2015/10/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-config.xml")
public class SqlParseUtilTest {

    @Test
    public void testBetweenSQL() throws Exception {
        String rootClassPath = Thread.currentThread().getContextClassLoader ().getResource("").getPath();
        System.out.println(rootClassPath);
//        String filePath = rootClassPath + "\\reversesql\\sql.sql";
        String filePath ="/E:/myworkspace/hframe-trunk/hframe-generator-web/target/classes/reversesql/basicdata.sql";

        String programCode = "hframe";
        String programeName = "框架";
        String moduleCode = "hframe";
        String moduleName = "框架";
        HfModelContainer sqlFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                filePath, programCode, programeName, moduleCode, moduleName);

        filePath ="/E:/myworkspace/hframe-trunk/hframe-generator-web/target/classes/reversesql/xfb.sql";

        HfModelContainer dbModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                filePath, programCode, programeName, moduleCode, moduleName);

        HfModelContainer[] resultModelContainers =
                HfModelContainerUtil.mergerModelContainer(dbModelContainer, sqlFileModelContainer);

        SQLParseUtil.getSqlFromHfModelContainer(resultModelContainers[0]);
        SQLParseUtil.getSqlFromHfModelContainer(resultModelContainers[1]);


        resultModelContainers =
                HfModelContainerUtil.mergerEntityToDataSet(resultModelContainers, dbModelContainer);
        System.out.println(resultModelContainers);
    }


    @Test
    public void test() throws Exception {
        String rootClassPath = Thread.currentThread().getContextClassLoader ().getResource("").getPath();
        System.out.println(rootClassPath);
//        String filePath = rootClassPath + "\\reversesql\\sql.sql";
        String filePath ="/D:/my_workspace/hframe-trunk/hframe-generator-web/target/classes/reversesql/sql.sql";

        String programCode = "hframe";
        String programeName = "框架";
        String moduleCode = "hframe";
        String moduleName = "框架";
        HfModelContainer sqlFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                filePath, programCode, programeName, moduleCode, moduleName);


        HfModelContainer dbModelContainer = HfModelService.get().getModelContainerFromDB(
                programCode, programeName, moduleCode, moduleName);

        HfModelContainer[] resultModelContainers =
                HfModelContainerUtil.mergerModelContainer(dbModelContainer, sqlFileModelContainer);

        resultModelContainers =
                HfModelContainerUtil.mergerEntityToDataSet(resultModelContainers,dbModelContainer);
        System.out.println(resultModelContainers);

        HfModelService.get().executeModelInsert(resultModelContainers[0]);
        HfModelService.get().executeModelUpdate(resultModelContainers[1]);

    }




}
