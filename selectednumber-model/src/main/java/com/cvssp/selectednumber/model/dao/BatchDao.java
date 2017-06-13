package com.cvssp.selectednumber.model.dao;

import com.cvssp.selectednumber.model.domain.Batch;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by wgq on 2017/6/13.
 */
public interface BatchDao extends JpaRepository<Batch,Long> {

    // Batch findBatchByDnsegByIdDesc(String dnseg);

}
