package com.cvssp.selectednumber.service.Impl;


import com.cvssp.selectednumber.model.dao.BatchDao;
import com.cvssp.selectednumber.model.dao.GeneratorDao;
import com.cvssp.selectednumber.model.dao.NumberDao;
import com.cvssp.selectednumber.model.domain.CvsspNumber;
import com.cvssp.selectednumber.model.domain.Generator;
import com.cvssp.selectednumber.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wgq on 2017/6/14.
 */
@Service
public class GeneratorServiceImpl implements GeneratorService {



    @Autowired
    private GeneratorDao generatorDao;

    @Autowired
    private NumberDao numberDao;

    @Autowired
    private BatchDao batchDao;



    /**
     * 批量生成号码
     * @param dnseg
     * @param maxValue
     * @return
     */
    @Override
    public List<String> batchGeneratorNumber(String dnseg, Integer maxValue) {

        Generator generator = generatorDao.FindGeneratorInfo(dnseg);

        Integer index = generator.getCurrentCount();

        List<String> NumberList = new ArrayList<String>();

        for( int i = index+1;i<=maxValue;i++){

            StringBuffer sb = new StringBuffer(dnseg);

            String baseCode = generatorBaseCode(String.valueOf(i));

            sb.append(baseCode).append(i);

            NumberList.add(sb.toString());

        }

        generator.setCurrentCount(maxValue);
        generatorDao.save(generator);

        return NumberList;
    }

    /**
     * 同步某号段当前批次需生成的号码数量到号码生成器
     *
     * @param dnseg
     * @return
     */
    @Override
    public boolean syschronBatchCount(String dnseg) {

       if (null == dnseg || "".equals(dnseg)) return false;

        try {
            Integer batchCount = batchDao.findBatchInfo(dnseg).get(0).getCount();
            Generator generator = new Generator();
            generator.setDnseg(dnseg);
            generator.setMaxValue(batchCount);
            generatorDao.save(generator);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }



    }


    /**
     * 生成baseCode
     * @param index
     * @return
     */
    private   String generatorBaseCode(String  index){

        int numberlen = index.length();
        int baselen = 6-numberlen;

        char[] ch = new char[baselen];
        for (int i=0;i<ch.length;i++){
            ch[i] = '0';
        }
        String str = String.valueOf(ch);
        return  str;

    }

    /**
     * 判断是否有号码记录
     * @param dnseg
     * @return
     */
    public boolean isExistNumber(String dnseg){

        try {
            List<CvsspNumber> numberList =numberDao.findNumberStateless(dnseg);

            if(numberList.size()>0){

                return  true;

            }else{

                return  false;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  true;
    }
}
