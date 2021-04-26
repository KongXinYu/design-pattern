package com.wzy.design.pattern.creational.simplefactory.practice;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class GraphFactory {

    public static Graph getGraphTool(String type) throws UnSupportedShapeException {
        Graph graph = null;
        if ("circular".equalsIgnoreCase(type)) {
            graph = new Circular();
        } else if ("rectangle".equalsIgnoreCase(type)) {
            graph = new Rectangle();
        } else if ("triangle".equalsIgnoreCase(type)) {
            graph = new Triangle();
        } else {
            throw new UnSupportedShapeException();
        }

        return graph;
    }

}
