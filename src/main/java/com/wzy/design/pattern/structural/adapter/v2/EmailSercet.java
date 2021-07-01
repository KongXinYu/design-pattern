package com.wzy.design.pattern.structural.adapter.v2;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/7/1 0001
 */
public class EmailSercet {

    public String encrypt(String command) {
        System.out.println("模拟邮箱加密..");
        return command;
    }
}
