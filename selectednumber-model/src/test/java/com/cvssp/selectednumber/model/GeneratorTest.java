package com.cvssp.selectednumber.model;

import com.cvssp.selectednumber.model.dao.GeneratorDao;
import com.cvssp.selectednumber.model.domain.Generator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by wgq on 2017/6/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorTest {

    @Autowired
    private GeneratorDao generatorDao;

    @Test
    public void createMaxValueCurrentDnseg() {

        Generator generator = new Generator();
        generator.setDnseg("188");
        generator.setCreatedTime(new Date());
        generator.setMaxValue(200);
        generatorDao.save(generator);


    }

    @Test
    public void QueryMaxValue() {

       /* Long maxValue = generatorDao.getMaxValue("183");*/
        Generator generator = generatorDao.FindGeneratorInfo("183");

        if (generator != null) {

            System.out.println("当前号段的尾号最大序列号-----" + generator.getMaxValue());

        }


    }

}
