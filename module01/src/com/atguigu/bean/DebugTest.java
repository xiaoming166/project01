package com.atguigu.bean;

import java.util.HashMap;

public class DebugTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","atguigu");
        map.put("age","13");
        map.put("hobby","pingpong");
        map.put("school","tsinghua");
        map.remove("hobby");

        System.out.println(map);
    }
}
