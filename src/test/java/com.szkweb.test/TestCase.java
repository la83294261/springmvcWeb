package com.szkweb.test;

import com.wangyin.szkweb.Utils.SpringUtil;
import com.wangyin.szkweb.service.BeanUseInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;

/**
 * Created by shizhongkai on 2017/11/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/*.xml")
public class TestCase {
    @Autowired
    private SpringUtil springUtil;

    @Test
    public void Test111(){
        BeanUseInterface jobInstStore = (BeanUseInterface)springUtil.getBean("beanUseTestService2", BeanUseInterface.class);


        jobInstStore.testMethod1();
    }

}
