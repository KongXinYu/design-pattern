package com.wzy.design.pattern.creational.prototype.v1;

import java.io.*;

/**
 * @author: WuZY
 * @time: 2021/05/18
 */
public class WeeklyLog implements Cloneable, Serializable {

    private Attachment attachment;

    private String name;

    private String date;

    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /// 浅拷贝
//    @Override
//    public WeeklyLog clone() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//            return (WeeklyLog) obj;
//        } catch (CloneNotSupportedException e) {
//            System.out.println("不支持复制！");
//        }
//        return null;
//    }

    /**
     *   使用序列化技术实现深拷贝
      */
    protected WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = null;
        try (
                // 将对象读取到流中
                ByteArrayOutputStream bao = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bao);
                ){
            oos.writeObject(this);

            // 将对象从流中读取出来
            ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
        return (WeeklyLog) ois.readObject();
    }
}
