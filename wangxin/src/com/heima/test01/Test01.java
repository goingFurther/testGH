package com.heima.test01;

import java.util.Random;
import java.util.Scanner;

//  一、
//、按要求在main方法中完成以下功能：
//定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的随机数
//提示用户输入2-5之间的一个数字num（num范围包括2和5,不需要代码判断）
//遍历数组arr,筛选出数组中元素是num倍数的数组元素并输出
public class Test01 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(99)+1;
        }
        System.out.println("请输入一个2--5之间的一个数字,包括2和5");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%num==0){
                System.out.println(arr[i]+" ");
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("随机数中没有"+num+"的倍数");
        }

    }
}
