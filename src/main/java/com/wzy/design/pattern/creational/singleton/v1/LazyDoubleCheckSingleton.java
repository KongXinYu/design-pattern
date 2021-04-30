package com.wzy.design.pattern.creational.singleton.v1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: 双重校验锁机制的懒汉单例模式
 * 但是相对于普通的懒汉单例模式，并发效率更高
 * @author: WuZY
 * @time: 2021/4/29 0029
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton(){
        if(instance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //1.分配内存给这个对象
                //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                //2.初始化对象
                    //intra-thread semantics
                    //---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = LazyDoubleCheckSingleton.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);

        LazyDoubleCheckSingleton o1 = LazyDoubleCheckSingleton.getInstance();
        LazyDoubleCheckSingleton o2 = (LazyDoubleCheckSingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }

}
