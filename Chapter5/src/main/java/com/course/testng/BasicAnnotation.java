package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {


    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例  1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforMethod 这是在测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 这是在测试方法之后运行");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("beforClass 这是在类运行之前");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在类运行之后");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 测试套件");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 测试套件");
    }

    @Test
    public void test1(){
        System.out.printf("Thread id is : %s%n",Thread.currentThread().getId());
    }
}
