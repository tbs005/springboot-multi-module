package com.cvssp.selectednumber.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by wgq on 2017/6/12.
 * <p>
 * 号码生成器
 */

@Entity
@Table(name = "T_GENERATOR")
public class Generator extends DomainImpl {

    /**
     * 号段
     */
    @Column(length = 3)
    private String dnseg;

    /**
     * 当前号段的号码最大值
     */
    private Integer maxValue;


    public String getDnseg() {
        return dnseg;
    }

    public void setDnseg(String dnseg) {
        this.dnseg = dnseg;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
}
