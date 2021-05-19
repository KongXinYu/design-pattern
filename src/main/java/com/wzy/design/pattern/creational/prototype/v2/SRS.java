package com.wzy.design.pattern.creational.prototype.v2;

/**
 * 软件需求规格说明书(Software Requirements Specification)类
 * @author: WuZY
 * @time: 2021/05/18
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument  srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (Exception e) {
            System.out.println("不支持复制！");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
