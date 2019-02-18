package com.enumdemo;

public enum SeasonEnum {
    SPRING,SUMMER,FALL,WINTER;

    public static void main(String[] args) {
        SeasonEnum[] values = SeasonEnum.values();//没有code属性
        for (SeasonEnum value : values) {
            System.out.println(value.ordinal()+value.name());
        }

    }
}