package com.ecjtu.timer.task;


import java.util.Timer;
import java.util.TimerTask;

/**
 * {@link Timer#schedule(TimerTask, long)}定义:一个定时器，可以执行多个定时任务。
 * 内置了一个定时任务队列,按照delay实践排序。
 * 简单定时任务
 *
 * @author xiexiang
 * @date 2019/11/29 11:55 上午
 */
public class SimpleTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("哈哈哈");

            }
        }, 6000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("llll");
            }
        }, 5000);
    }
}
