package com.wzy.design.pattern.creational.prototype.v1;

import java.io.IOException;

/**
 * @author: WuZY
 * @time: 2021/05/18
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog logPrevious, logNew;
        // 创建原型对象
        logPrevious = new WeeklyLog();
        // 创建附件对象
        Attachment attachment = new Attachment();
        // 将附件添加到周报中
        logPrevious.setAttachment(attachment);
        //调用克隆方法创建克隆对象
        // 浅拷贝
//        logNew = logPrevious.clone();
        // 深拷贝
        logNew = logPrevious.deepClone();

        // 比较周报
        System.out.println("周报是否相同？ " + (logPrevious == logNew));
        // 比较附件
        System.out.println("附件是否相同？ " + (logPrevious.getAttachment() == logNew.getAttachment()));
    }

}
