import com.hframework.base.service.CommonDataService;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.generator.web.container.HfModelContainerUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhangqh6 on 2015/9/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class CommonMapperTest {

    @Resource
    private CommonDataService commonDataService;

    @Test
    public void doCreate() throws Exception {
        commonDataService.executeDBStructChange(new HashMap(){{
            put("sql","create table test(id varchar(32), name varchar(32))");
        }});
    }

    @Test
    public void doAlter() throws Exception {
        commonDataService.executeDBStructChange("alter table test add column desc1 varchar(128);");
    }

    @Test
    public void showTables() throws Exception {
        System.out.println(Arrays.toString(commonDataService.showTables().toArray(new String[0])));
    }

    @Test
    public void selectDynamicTableDataSome() throws Exception {
        List list = commonDataService.selectDynamicTableDataSome(new HashMap<String, String>() {{
            put("sql","SELECT hfmd_enum_id,hfmd_enum_value,hfmd_enum_desc,is_default,pri,ext1,ext2,hfmd_enum_class_id,hfmd_enum_class_code,op_id,create_time,del_flag FROM hfmd_enum t WHERE t.hfpm_program_id IN (151031375397) OR hfpm_program_id IS NULL");
        }});

        List<String> hfmd_enum = HfModelContainerUtil.getSql(list, "hfmd_enum", true);
        for (String s : hfmd_enum) {
            System.out.println("sql = > " + s);
        }

    }

    @Test
    public void showCreateTable() throws Exception {
        System.out.println("==>" + commonDataService.showCreateTableSql("test"));
    }


    @Test
    public void testManis_batchInsert() throws Exception {
        long cnt = 0;
        DataSourceContextHolder.setDbInfo("jdbc:mysql://**:3306/firstp2p_test?useUnicode=true", "***", "**");
        while (true) {
            cnt++;
            Thread.sleep(100L);
            commonDataService.executeDBStructChange("INSERT INTO firstp2p_user_log_47\n" +
                    "            (log_info,\n" +
                    "             log_time,\n" +
                    "             log_admin_id,\n" +
                    "             log_user_id,\n" +
                    "             money,\n" +
                    "             score,\n" +
                    "             POINT,\n" +
                    "             quota,\n" +
                    "             lock_money,\n" +
                    "             remaining_money,\n" +
                    "             user_id,\n" +
                    "             related_user_id,\n" +
                    "             related_user_show_name,\n" +
                    "             note,\n" +
                    "             remaining_total_money,\n" +
                    "             is_delete,\n" +
                    "             item_id)\n" +
                    "SELECT\n" +
                    "  log_info,\n" +
                    "  log_time,\n" +
                    "  999,\n" +
                    "  log_user_id,\n" +
                    "  money,\n" +
                    "  score,\n" +
                    "  POINT,\n" +
                    "  quota,\n" +
                    "  lock_money,\n" +
                    "  remaining_money,\n" +
                    "  user_id,\n" +
                    "  related_user_id,\n" +
                    "  related_user_show_name,\n" +
                    "  note,\n" +
                    "  remaining_total_money,\n" +
                    "  is_delete,\n" +
                    "  item_id\n" +
                    "FROM firstp2p_user_log_47\n" +
                    "WHERE id = 19102");

            if (cnt % 10000 == 0) {
                commonDataService.executeDBStructChange("delete from  firstp2p_user_log_47 where log_admin_id = 999");
            }
        }
    }

    @Test
    public void testManis_batchCfg() throws Exception {
        long cnt = 0;
        DataSourceContextHolder.setDbInfo("jdbc:mysql://******:3306/sub?useUnicode=true", "sub", "sub");
        while (true) {
            commonDataService.executeDBStructChange("UPDATE cfg_task_inst SET STATUS =2 WHERE param_value_1 = 23;");
            Thread.sleep(Math.round(30) * 1000L);
            commonDataService.executeDBStructChange("UPDATE cfg_task_inst SET STATUS =1 WHERE param_value_1 = 23;");
            Thread.sleep(Math.round(30) * 1000L);
        }


    }

}
