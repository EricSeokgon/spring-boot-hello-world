package tk.hadeslee;

/**
 * Project: spring-boot-hello-world
 * FileName: Widget
 * Date: 2016-01-20
 * Time: 오후 1:25
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Widget {
    private String type;

    private int length;

    private int height;

    public Widget(String type, int length, int height) {
        this.type = type;
        this.length = length;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
