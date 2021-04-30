package com.wzy.design.pattern.creational.singleton.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/29 0029
 */
public class StaticInnerClassSingleton {

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton;
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
