package com.wzy.design.pattern.creational.prototype.v1;

import java.io.Serializable;

/**
 * 附件实体类
 * @author: WuZY
 * @time: 2021/05/18
 */
public class Attachment implements Serializable {

    private String name;

    public void download() {
        System.out.println("下载附件,文件名为：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
