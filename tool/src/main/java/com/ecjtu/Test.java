package com.ecjtu;


import java.util.ArrayList;
import java.util.List;

/**
 * @author xiexiang
 * @date 2020/3/12 6:40 下午
 */
public class Test {
    public static void main(String[] args) {
        List<Demo> demoList=new ArrayList<>();

        for (int i=0;i<10;i++){
            demoList.add(new Demo(i,"hhhh"));
        }
        List<Demo2> demoList2=new ArrayList<>();
        Demo2 demo2=new Demo2();
        for (Demo demo : demoList) {
            demo2.setId(demo.getId());
            demoList2.add(demo2);
        }
        System.out.println(demoList2.toString());

    }
}
