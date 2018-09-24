package ch2.sec4.order;

import ch1.sec2.title2.Apple;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple apple = new Apple(180,"green");
        Apple apple2 = new Apple(100,"yellow");
        Apple apple3 = new Apple(170,"red");
        apples.add(apple);
        apples.add(apple2);
        apples.add(apple3);

        apples.sort((Apple a1 ,Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(apples);
    }
}
