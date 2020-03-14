package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

//这是一个注释
public class Customer {
    private Integer id;
    private String name;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Customer cust = new Customer(15,"atguigu");
        System.out.println(cust);
        List<String> list = new ArrayList<>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
        list.add("aa5");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        for (String s : list) {
            System.out.println(s);
        }
        if (list == null) {
            System.out.println("Customer.main");
        }





    }


}
