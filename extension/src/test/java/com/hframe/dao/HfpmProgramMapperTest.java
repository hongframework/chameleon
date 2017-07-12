package com.hframe.dao;

import com.hframe.domain.model.HfpmProgram_Example;
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

    @Test
    public void selectByExample(){
        hfpmProgramMapper.selectByExample(new HfpmProgram_Example());

    }
}
