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
            System.out.println("friut.ordinal():"+friut.ordinal()
                    +",friut.code:"+friut.code
                    +",friut.name():"+friut.name());
            /**
             * friut.ordinal():0,friut.code:1,friut.name():APPLE
             * friut.ordinal():1,friut.code:2,friut.name():ORANGE
             * friut.ordinal():2,friut.code:3,friut.name():BANANA
             */

        }
        System.out.println(Friut.APPLE);//APPLE
        System.out.println(Friut.APPLE.code);//1
        /**
         * valueOf()方法会把一个String类型的名称转变为枚举项,也就是枚举项中查找出字面值与该参数相等的枚举项
         */
//        System.out.println(Friut.valueOf("apple1"));//No enum constant com.enumdemo.Friut.apple1
        System.out.println(Friut.valueOf("APPLE"));//APPLE
        System.out.println(Friut.valueOf("APPLE").code);//1   和前面一样，那valueof()感觉没什么用

    }

}
