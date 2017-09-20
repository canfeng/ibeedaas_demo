package com.ibeesaas.demo;

import com.ibeesaas.demo.util.Config;
import com.ibeesaas.demo.util.JsonUtils;
import com.ibeesaas.demo.util.TaskUtil;

import java.util.LinkedHashMap;
import java.util.Map;


public class TaskSubmit
{
    public static void main( String[] args )
    {
        //本demo以淘宝账号密码登录方式为示例，其他数据类型的登录方式，请自行阅读api文档。
        String taskType = Config.TYPE_BLACK;

        Map<String, Object> pMap = new LinkedHashMap<String, Object>();
        pMap.put("sync", 1);
        pMap.put("idCardNo", "140624199305193014");
        pMap.put("name", "史治国");
        pMap.put("phoneNo", "15011018136");
        Map<String, Object> pBody = new LinkedHashMap<String, Object>();
        pBody.put("data", pMap);
        pBody.put("callbackUrl", ""); //callbackUrl根据实际情况填写，如果想通过查询方式获取结果，此处可设为""
        String bodyJson = JsonUtils.objectToJson(pBody);

        String response = TaskUtil.submitTask(taskType, bodyJson);
        System.out.println(response);
    }
}
