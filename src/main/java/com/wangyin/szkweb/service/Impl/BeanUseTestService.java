package com.wangyin.szkweb.service.Impl;

import com.wangyin.szkweb.service.BeanUseInterface;
import org.springframework.stereotype.Service;

/**
 * Created by shizhongkai on 2017/11/15.
 */
@Service("beanUseTestService")
public class BeanUseTestService implements BeanUseInterface{


    @Override
    public void testMethod1() {
        System.out.print("BeanUseTestService");
    }
}
