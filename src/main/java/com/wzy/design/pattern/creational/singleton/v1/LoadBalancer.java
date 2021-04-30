package com.wzy.design.pattern.creational.singleton.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: 负载均衡器的设计与实现
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class LoadBalancer {
    /** 私有静态成员变量，存储的唯一实例 */
    private static LoadBalancer instance = null;
    /** 服务器集合  */
    private List serverList = null;
    /**
     * 私有构造函数
     */
    private LoadBalancer(){
        serverList = new ArrayList();
    }

    /**
     * 公有静态成员方法，返回唯一实例
     */
    public static LoadBalancer getInstance() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    /**
     * 增加服务器
     */
    public void addServer(String server) {
        serverList.add(server);
    }

    /**
     * 删除服务器
     * @param server
     */
    public void removeServer(String server) {
        serverList.remove(server);
    }

    /**
     * 使用Random类随机获取服务器
     * @return
     */
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}
