package com.cvssp.selectednumber.model;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cvssp.selectednumber.model.dao.BatchDao;

public class BatchDaoTest {

	@Autowired
	BatchDao batchDao;
	
	@Test
	public void test() {
		batchDao.count();
	}

    @SpringBootApplication
    static class TestConfiguration {
    }
}
