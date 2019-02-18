package com.enumdemo;

/**
 *      public static final int SEASON_SPRING = 1;
 *     public static final int SEASON_SUMMER = 2;
 *     public static final int SEASON_FALL = 3;
 *     public static final int SEASON_WINTER = 4;
 *
 *     1. 类型不安全。若一个方法中要求传入季节这个参数，用常量的话，形参就是int类型，开发者传入任意类型的int类型值就行，
 *     但是如果是枚举类型的话，就只能传入枚举类中包含的对象。
 * 　　2. 没有命名空间。开发者要在命名的时候以SEASON_开头，这样另外一个开发者再看这段代码的时候，才知道这四个常量分别代表季节。
 */
public enum SeasonEnum2 {
    SPRING(1),SUMMER(2),FALL(3),WINTER(4);

    private int code;

    SeasonEnum2(int code){
        this.code = code;
    }


    public static void main(String[] args) {
        System.out.println(SeasonEnum2.SPRING.code);//1
    }
}
