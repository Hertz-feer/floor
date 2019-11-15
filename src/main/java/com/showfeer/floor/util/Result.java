package com.showfeer.floor.util;

public class Result {

    private int style;
    private String msg;

    @Override
    public String toString() {
        return "Result{" +
                "style=" + style +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
