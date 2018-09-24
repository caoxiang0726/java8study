package stream;

import util.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static util.Dish.menu;

/**
 * 5.3 查找和匹配
 */
public class Finding{

    public static void main(String[] args) {
        if(isVegetarianFriendlyMenu()){
            System.out.println("Vegetarian friendly");
        }



        System.out.println(isHealthyMenu());

        System.out.println(isHealthyMenu2());

        //Optional<T>类（java.util.Optional）是一个容器类，代表一个值存在或不存在
        //不用返回众所周知容易出问题的null了
        Optional<Dish> dish = findVegetarianDish();
        dish.ifPresent(d -> System.out.println(d.getName()));


        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst(); // 9
        System.out.println("first:"+firstSquareDivisibleByThree);
        /**
         * 你可能会想，为什么会同时有findFirst和findAny呢？答案是并行。
         */

    }

    //至少匹配一个元素
    private static boolean isVegetarianFriendlyMenu(){
        return menu.stream().anyMatch(Dish::isVegetarian);
    }
    //全匹配为ture
    private static boolean isHealthyMenu(){
        return menu.stream().allMatch(d -> d.getCalories() < 1000);
    }
    //全不匹配为true
    private static boolean isHealthyMenu2(){
        return menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }
    //可能会找到一个或0个
    private static Optional<Dish> findVegetarianDish(){
        return menu.stream().filter(Dish::isVegetarian).findAny();
    }
    
}