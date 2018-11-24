package com.heima.test03;
//三.
//        1、定义“手机类”Phone包含空参构造、满参构造和以下成员变量：
//        名称name（String类型）
//        价格price（double类型）
//        类型type（String类型）
//        生成以上成员变量的set/get方法
//        2、定义测试类Test，完成以下要求：
//        ①定义public static ArrayList<Phone> filter(ArrayList<Phone> list,double price) {...}方法:
//        要求：遍历list集合，将list中价格大于参数price的元素存入到另一个ArrayList<Phone> 中并返回
//        ②在main方法内完成以下要求:
//        a.根据以下内容创建并初始化3个Phone对象
//        {"小米MIX2",2999,"新机皇"}
//        {"Iphone8", 5888,"火爆新机"}
//        {"VIVO X9s",1998,"火爆新机"}
//        b.创建一个ArrayList<Phone> list_phone，将上面的3个Phone对象添加到list_phone中，
//        调用filter方法传入list_phone和2000，根据返回的list集合输出所有元素信息

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        //        a.根据以下内容创建并初始化3个Phone对象
        Phone p1=new Phone("小米MIX2",2999,"新机皇");
        Phone p2=new Phone("Iphone8", 5888,"火爆新机");
        Phone p3=new Phone("VIVO X9s",1998,"火爆新机");
        //        b.创建一个ArrayList<Phone> list_phone，将上面的3个Phone对象添加到list_phone中，
        ArrayList<Phone> list_phone=new ArrayList<>();
        list_phone.add(p1);
        list_phone.add(p2);
        list_phone.add(p3);
        //        调用filter方法传入list_phone和2000，根据返回的list集合输出所有元素信息
        ArrayList<Phone> result=new ArrayList<>();
        result=fitler(list_phone,2000);
        for (int i = 0; i < result.size(); i++) {
            result.get(i).show();
        }
    }
        // ①定义public static ArrayList<Phone> filter(ArrayList<Phone> list,double price) {...}方法:

    public static ArrayList<Phone> fitler(ArrayList<Phone> list,double price){
        // 要求：遍历list集合，将list中价格大于参数price的元素存入到另一个ArrayList<Phone> 中并返回
        ArrayList<Phone> newArrayList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()>price)
                newArrayList.add(list.get(i));
        }
        return newArrayList;
    }
}
