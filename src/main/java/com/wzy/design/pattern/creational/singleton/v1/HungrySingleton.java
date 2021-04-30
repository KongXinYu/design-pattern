package com.wzy.design.pattern.creational.singleton.v1;

/**
 * @description: 饿汉式单例模式
 * @author: WuZY
 * @time: 2021/4/29 0029
 */
public class HungrySingleton {

    private final static HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    private HungrySingleton() {
        if(INSTANCE != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        HungrySingleton o1 = HungrySingleton.getInstance();
        HungrySingleton o2 = HungrySingleton.class.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }


}
