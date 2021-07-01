package com.wzy.design.pattern.structural.adapter.v1;

/**
 * <p>
 *     抽象成绩操作类: 目标接口
 * </p>
 *
 * @author WuZhenYu
 * @since 2021/6/30 0030
 */
public interface ScoreOperation {

    /**
     * 成绩排序
     * @param array
     * @return
     */
    public int[] sort(int[] array);

    /**
     * 成绩查找
     * @param array
     * @param key
     * @return
     */
    public int search(int array[], int key);

}
