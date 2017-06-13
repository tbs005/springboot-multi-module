package com.cvssp.selectednumber.model;

import com.cvssp.selectednumber.model.dao.BatchDao;
import com.cvssp.selectednumber.model.domain.Batch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by wgq on 2017/6/13.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchTest {

    @Autowired
    private BatchDao batchDao;


   /* @Test
    public void selectedBatchSuccess(){

        Batch batch = batchDao.findBatchByDnsegByIdDesc("183");

        System.out.println(batch.getCount());


    }*/

    @Test
    public void saveBatch(){

        Batch batch =  new Batch();
        batch.setCount(10);
        batch.setDnseg("183");
        batch.setCreatedTime(new Date());

        batchDao.save(batch);
    }


}
