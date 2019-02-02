package com.course.testng.gourps;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行成功");
    }

    public void teadcher2(){
        System.out.println("GroupsOnClass3中的teacher2运行成功");
    }
}
