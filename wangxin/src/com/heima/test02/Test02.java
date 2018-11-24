package com.heima.test02;

import java.util.Arrays;

//二。
//        ①定义方法filter
//        要求如下：
//        形参：int [] arr，int  in
//        返回值类型：int []
//        实现：遍历arr，将数组中包含参数in的元素存入另一个int数组中并返回
//        PS：返回的数组长度需要用代码获取
//        ②在main方法中完成以下要求：
//        定义一个int数组arr，数组元素有：12,12,13,23,33,35,32，33，23,12，35
//        调用filter方法传入arr数组和12，输出返回的int数组中所有元素
public class Test02 {
    public static void main(String[] args) {
        int arr[]={12,12,13,23,33,35,32,33,23,12,35};
        int[] result=filter(arr,12);
        System.out.println(Arrays.toString(result));
    }
    public static int[] filter(int[] arr,int in){
        int count=0;
        //判断要返回的新数组中有几个元素
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==in){
                count++;
            }
        }
        //将数组中包含参数in的元素存入另一个int数组中
        int[] newArray=new int[count];
        for (int i = 0,j=0; i < arr.length; i++) {
            if (arr[i]==in){
                newArray[j]=arr[i];
                j++;
            }
        }
        return newArray;
    }
}
