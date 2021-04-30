package com.wzy.design.pattern.creational.singleton.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class TaskManager {

    private static TaskManager tm = null;
    private TaskManager(){}

    public void displayProcesses() {
        System.out.println("显示进程...");
    }

    public void displayServices() {
        System.out.println("显示服务...");
    }

    public static TaskManager getInstance() {
        if(tm == null) {
            tm = new TaskManager();
        }
        return tm;
    }

}
