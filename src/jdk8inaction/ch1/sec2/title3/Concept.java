package jdk8inaction.ch1.sec2.title3;

import jdk8inaction.ch1.sec2.title2.Apple;

import java.util.ArrayList;
import java.util.List;

import static jdk8inaction.ch1.sec2.title2.Apple.filterApples2;

/**
 * 1.2.3　从传递方法到Lambda
 */
public class Concept {
    /**
     * 把方法作为值来传递显然很有用，但要是为类似于isHeavyApple和isGreenApple这种可
     * 能只用一两次的短方法写一堆定义有点儿烦人
     * 不过Java 8也解决了这个问题，它引入了一套新
     * 记法（匿名函数或Lambda），让你可以写
     */

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple apple = new Apple(180,"green");
        Apple apple2 = new Apple(100,"yellow");
        Apple apple3 = new Apple(170,"red");
        apples.add(apple);
        apples.add(apple2);
        apples.add(apple3);
        /**
         * 所以，你甚至都不需要为只用一次的方法写定义；代码更干净、更清晰，因为你用不着去找
         * 自己到底传递了什么代码。
         */
        System.out.println(filterApples2(apples,(Apple a) -> "green".equals(a.getColor())));

        System.out.println(filterApples2(apples,(Apple a)-> a.getWeight()>150));

        System.out.println(filterApples2(apples,(Apple a)-> a.getWeight()>150 &&  a.getColor().equals("green")));

        /**
         * 本来，Java加上
         * filter和几个相关的东西作为通用库方法就足以让人满意了，比如
         * static <T> Collection<T> filter(Collection<T> c, Predicate<T> p);
         *
         * 这样你甚至都不需要写filterApples2了  ???????
         */

//        filter(apples, (Apple a) -> a.getWeight() > 150 ); //不行


        /**
         * Java 8的设计师几乎可以就此打住了，要是没有多核CPU，可能他们真的就到此为止了。
         * 但是，为了更好地利用并行，Java的设计师没有这么做。Java 8中有一整套新的类集合
         * API——Stream，它有一套函数式程序员熟悉的、类似于filter的操作，比如map、reduce，还
         * 有我们接下来要讨论的在Collections和Streams之间做转换的方法。
         */
    }
}
