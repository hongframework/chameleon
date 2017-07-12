
import com.hframe.dao.HfpmProgramMapper;
import com.hframe.dao.HfusWordStoreMapper;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfpmProgram_Example;
import com.hframe.domain.model.HfusWordStore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhangqh6 on 2015/9/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-config.xml")
public class HfpmProgramMapperTest {

    @Resource
    private HfpmProgramMapper hfpmProgramMapper;

    @Resource
    private HfusWordStoreMapper hfusWordStoreMapper;

    @Test
    public void selectByExample(){
        hfpmProgramMapper.selectByExample(new HfpmProgram_Example());
    }
    @Test
    public void insert(){
        HfpmProgram program = new HfpmProgram();
        program.setHfpmProgramName("test");
        program.setHfpmProgramId(123L);
        program.setHfpmProgramCode("234");
        System.out.println(hfpmProgramMapper.insertSelective(program));
    }

    @Test
    public void insertHfusWordStore(){
        HfusWordStore wordStore = new HfusWordStore();
        wordStore.setEnglishName("profit");
        wordStore.setEnglishShortName("profit");
        wordStore.setChineseChars("收益");
        System.out.println(hfusWordStoreMapper.insertSelective(wordStore));
        System.out.println(wordStore.getHfusWordStoreId());
    }
}
