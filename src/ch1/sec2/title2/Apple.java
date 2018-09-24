package ch1.sec2.title2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public  class Apple {
    private int weight = 0;
    private String color = "";

    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (apple.getWeight() > 150) {//仅仅只有这一行代码不一样
                result.add(apple);
            }
        }
        return result;
    }
    /**
     * 修改1
     */


    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }
    /*public interface Predicate<T>{//写出来是为了清晰（平常只要从java.util.function导入就可以了）
        boolean test(T t);
    }*/
    public static  List<Apple> filterApples2(List<Apple> inventory,
                             Predicate<Apple> p) {
        //谓词（predicate）
        //在数学上常常用来代表一个类似函数的东西，它接受一个参数值，并返回true或false。
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}