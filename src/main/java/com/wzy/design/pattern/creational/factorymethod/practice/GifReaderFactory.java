package com.wzy.design.pattern.creational.factorymethod.practice;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class GifReaderFactory implements ReaderFactory {
    @Override
    public PictureReader getReader() {
        return new GifReader();
    }
}
