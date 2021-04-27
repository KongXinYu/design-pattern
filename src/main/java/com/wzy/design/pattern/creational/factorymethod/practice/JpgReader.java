package com.wzy.design.pattern.creational.factorymethod.practice;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class JpgReader extends PictureReader {
    @Override
    public void read() {
        System.out.println("读取jpg格式图片......");
    }
}
