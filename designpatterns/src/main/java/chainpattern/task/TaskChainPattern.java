package chainpattern.task;

import chainpattern.task.impl.Task1;
import chainpattern.task.impl.Task2;
import chainpattern.task.impl.Task3;

/**
 * 责任链模式
 * @author xiexiang
 * @date 2019/11/26 6:50 下午
 */
public class TaskChainPattern {

    public  void chainRun(){
        Task task3 = new Task1();
        Task task2 = new Task2(task3);
        Task task1 = new Task3(task2);
        task1.run();
    }
}
