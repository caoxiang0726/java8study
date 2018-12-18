package jdk8inaction.ch4.sec1.title0;

import jdk8inaction.util.Dish;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * 因为集合是数据结构，所以它的主要目的是以特定的时间/空间复杂度存储和访问元
 * 素（如ArrayList 与 LinkedList）。但流的目的在于表达计算，比如你前面见到的
 * myfilter、sorted和map。集合讲的是数据，流讲的是计算
 */

/**
 * 只能遍历一次
 * 也就是foreach方法只能调用一次
 */
public class StreamBasic {

    public static void main(String...args){
        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);

//        Map<Dish.Type, List<Dish>> dishesByType =
//                Dish.menu.jdk8inaction.stream().collect(groupingBy(Dish::getType));//分类
        /**
         * {FISH=[prawns, salmon],
         *  OTHER=[french fries, rice, season fruit, pizza],
         *  MEAT=[pork, beef, chicken]}
         */

    }



    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
        return dishes.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
    }

    /**
     * 你会发现，有好几种优化利用了流的延迟性质。第一，尽管很多菜的热量都高于300卡路里，
     * 但只选出了前三个！这是因为limit操作和一种称为短路的技巧，我们会在下一章中解释。第二，
     * 尽管filter和map是两个独立的操作，但它们合并到同一次遍历中了（我们把这种技术叫作循环
     * 合并）。
     */
}