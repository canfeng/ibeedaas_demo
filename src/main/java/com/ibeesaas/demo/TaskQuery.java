package com.ibeesaas.demo;

import com.ibeesaas.demo.util.TaskUtil;

public class TaskQuery {
    public static void main(String[] args) throws InterruptedException {
        String taskNo = "03fbed9bc2b34f468238f8508117304e1505814555786"; //需要查询信息的taskNo
        String response = TaskUtil.queryTask(taskNo);
        System.out.println(response);
    }
}
