package jdk8inaction.stream;

import jdk8inaction.util.Dish;

import java.util.Arrays;
import java.util.List;

import static jdk8inaction.util.Dish.menu;
import static java.util.stream.Collectors.toList;

/**
 * 5.1 筛选和切片
 */
public class Filtering {

    public static void main(String... args) {

        // Filtering with predicate
        List<Dish> vegetarianMenu =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(toList());

        vegetarianMenu.forEach(System.out::println);
        System.out.println("---------------");

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
//                .distinct()
                .forEach(System.out::println);
        System.out.println("---------------");

        // Truncating a jdk8inaction.stream
        List<Dish> dishesLimit3 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
//                        .limit(3)
                        .collect(toList());

        dishesLimit3.forEach(System.out::println);
        System.out.println("---------------");

        // Skipping elements 当前流中的前2条去除
        List<Dish> dishesSkip2 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .skip(2)
                        .collect(toList());

        dishesSkip2.forEach(System.out::println);
        System.out.println("---------------");
    }
}