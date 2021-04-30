package com.wzy.design.pattern.creational.singleton.v1;

import org.springframework.aop.scope.ScopedProxyUtils;

import javax.sound.midi.Soundbank;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/29 0029
 */
public class Client {

    public static void main(String[] args) {
        // 创建四个LoadBalancer对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();

        // 判断服务器负载均衡器是否相同
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服务负载均衡器具有唯一性！");
        }

        // 增加服务器
        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");

        // 模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server = balancer2.getServer();
            System.out.println("分发请求值服务器：" + server);
        }

    }
}
