package com.enumdemo;

public enum Friut {
    APPLE(1), ORANGE(2), BANANA(3);
    /**
     * 格式：name(code)
     * 报错：构造函数 cannot apply to int,int是由括号里面的类型决定的
     * 解决：写构造函数
     */
    int code;

    Friut(int code) {
        this.code = code;
    }


    public static void main(String[] args) {
        Friut[] friuts = Friut.values();
        for (Friut friut : friuts) {
            System.out.println(friut.code+friut.name()+friut.ordinal());
        }
        System.out.println(Friut.APPLE);
    }

}
