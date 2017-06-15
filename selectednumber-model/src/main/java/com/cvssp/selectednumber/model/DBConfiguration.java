package com.cvssp.selectednumber.model;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cvssp.selectednumber.model.dao.BatchDao;
import com.cvssp.selectednumber.model.domain.Batch;

@Configuration
public class DBConfiguration {
	
	@Bean
	public BatchDao batchDao(){
		return new BatchDao(){

			@Override
			public void deleteAllInBatch() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void deleteInBatch(Iterable<Batch> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public List<Batch> findAll() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Batch> findAll(Sort arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Batch> findAll(Iterable<Long> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> List<S> findAll(Example<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> List<S> findAll(Example<S> arg0, Sort arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void flush() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Batch getOne(Long arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> List<S> save(Iterable<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> S saveAndFlush(S arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Page<Batch> findAll(Pageable arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public long count() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void delete(Long arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void delete(Batch arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void delete(Iterable<? extends Batch> arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean exists(Long arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Batch findOne(Long arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> S save(S arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> long count(Example<S> arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public <S extends Batch> boolean exists(Example<S> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public <S extends Batch> Page<S> findAll(Example<S> arg0, Pageable arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <S extends Batch> S findOne(Example<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Batch> findBatchInfo(String dnseg) {
				// TODO Auto-generated method stub
				return null;
			}};
	}
}
