package com.wzy.design.pattern.creational.prototype.v2;

import java.util.Hashtable;

/**
 * 原型管理器（使用饿汉式单例实现）
 * @author: WuZY
 * @time: 2021/05/18
 */
public class PrototypeManager {
    private Hashtable ht = new Hashtable();
    private static PrototypeManager pm = new PrototypeManager();

    /**
     * 为Hashtable 增加公文对象
     */
    private PrototypeManager(){
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
        ht.put("ppr", new PPR());
    }

    /**
     * 增加新的公文对象
     * @param key
     * @param doc
     */
    public void addOfficailDocument(String key, OfficialDocument doc){
        ht.put(key, doc);
    }

    /**
     * 通过浅克隆获取新的公文对象
     * @param key
     * @return
     */
    public OfficialDocument getOffcialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }

}
