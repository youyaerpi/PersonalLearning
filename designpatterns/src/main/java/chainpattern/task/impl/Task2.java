package chainpattern.task.impl;

import chainpattern.task.Task;

/**
 * @author xiexiang
 * @date 2019/11/26 6:52 下午
 */


public class Task2 implements Task {
    private Task task;

    public Task2() {
    }

    public Task2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("task2 is run");
        if (task != null) {
            task.run();
        }
    }


}
