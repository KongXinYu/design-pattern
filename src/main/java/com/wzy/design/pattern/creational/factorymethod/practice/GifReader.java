package com.wzy.design.pattern.creational.factorymethod.practice;

/**
 * @description: gif 图片读取器
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class GifReader extends PictureReader {
    @Override
    public void read() {
        System.out.println("读取gif图片....");
    }
}
