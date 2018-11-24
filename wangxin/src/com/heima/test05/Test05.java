package com.heima.test05;
//第三题

//2. 定义Test类：在main()方法中，按以下要求编写代码:
//
//    1） 分别实例化三个Person对象，三个对象分别为："小秋" ,1.72, 72、"小红" ,1.58, 44、"小白" ,1.80, 55;
//
//    2） 创建一个ArrayList集合，这个集合里面存储的是Person类型，分别将上面的三个Person对象添加到集合中
//
//3）遍历这个集合，将集合中姓名为小白的对象，体重增加10kg，
// 然后调用这个对象的showBMI方法展示这个对象的属性和体质指数.

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        Person p1=new Person("小秋" ,1.72, 72);
        Person p2=new Person("小红" ,1.58, 44);
        Person p3=new Person("小白" ,1.80, 55);

        ArrayList<Person> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName()=="小白"){
                int newWeight=list.get(i).getWeight()+10;
                list.get(i).setWeight(newWeight);
                list.get(i).showBMI();
            }
        }
    }
}
