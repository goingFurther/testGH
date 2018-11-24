package com.heima.test04;

import java.util.Arrays;
import java.util.Random;

//第一题
//1、定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，
// 将数组中小于10的元素替换成0，然后返回修改之后的数组
//
//        在main方法中完成:
//
//                1. 定义一个长度为5的int类型的数组
//
///             2. 随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)，并把数组中的元素打印在控制台
//
///              3. 调用getNewArr方法,在控制台打印返回后的数组中的元素
//        格式如下:
//  [ 1,2,3,4,5,6]
public class Test04 {
    public static void main(String[] args) {
        Random r=new Random();
        int[] arrNum=new int[5];
        for (int i = 0; i < 5; i++) {
            arrNum[i]=r.nextInt(46)+5;
        }
        //System.out.println(Arrays.toString(arrNum));
        printArr(arrNum);
        int[] newArr=getNewArr(arrNum);
        //System.out.println(Arrays.toString(newArr));
        printArr(newArr);
    }
    public static int[] getNewArr(int[] arr){
        //1、定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，
// 将数组中小于10的元素替换成0，然后返回修改之后的数组
//
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<10)
                arr[i]=0;
        }
        return arr;
    }
    public static void printArr(int[] arr){
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1)
                str=str+arr[i]+",";
            else
                str=str+arr[i]+"]";
        }
        System.out.println(str);
    }

}
