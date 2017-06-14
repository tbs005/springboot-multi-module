package com.cvssp.selectednumber.service;

import com.cvssp.selectednumber.model.dao.GeneratorDao;
import com.cvssp.selectednumber.model.domain.Generator;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wgq on 2017/6/14.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorNumberTest {


   /* @Autowired
    GeneratorService generatorService;*/

    @Autowired
    GeneratorDao generatorDao;


    @org.junit.Test
    public void QueryMaxValue() {

       /* Long maxValue = generatorDao.getMaxValue("183");*/
        Generator generator = generatorDao.FindGeneratorInfo("183");

        if (generator != null) {

            System.out.println("当前号段的尾号最大序列号-----" + generator.getMaxValue());

        }


    }



    @org.junit.Test
    public void synchronizedBatchCountToGenerator() {

        String dnseg = "183";

        //boolean exist =   generatorService.isExistNumber(dnseg);


        //boolean sysnsuccess = generatorService.syschronBatchCount(dnseg);

       /* if (sysnsuccess) {
            Generator generator = generatorDao.FindGeneratorInfo(dnseg);
            List<String> list = generatorService.batchGeneratorNumber("183", generator.getMaxValue());

            for (String str : list) {

                System.out.println("**************" + str);
            }


        }*/


    }
}



