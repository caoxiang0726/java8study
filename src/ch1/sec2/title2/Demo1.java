package ch1.sec2.title2;

import java.util.ArrayList;
import java.util.List;

import static ch1.sec2.title2.Apple.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple apple = new Apple(180,"green");
        Apple apple2 = new Apple(100,"yellow");
        Apple apple3 = new Apple(170,"red");
        apples.add(apple);
        apples.add(apple2);
        apples.add(apple3);
        /*List<Apple> listApple = filterGreenApples(apples);
        System.out.println(listApple);*/

        System.out.println(filterApples2(apples, Apple::isHeavyApple));
        System.out.println(filterApples2(apples, Apple::isGreenApple));



    }










}
