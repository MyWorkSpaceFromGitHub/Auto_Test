package com.course.testng.gourps;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组测试11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组测试22222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组测试333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组测试44444");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void AfterGroupOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }
}
