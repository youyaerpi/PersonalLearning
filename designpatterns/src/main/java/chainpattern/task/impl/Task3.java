package chainpattern.task.impl;

import chainpattern.task.Task;

/**
 * @author xiexiang
 * @date 2019/11/26 6:52 下午
 */


public class Task3 implements Task {
    private Task task;

    public Task3() {
    }

    public Task3(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("task3 is run");
        if (task != null) {
            task.run();
        }
    }


}
