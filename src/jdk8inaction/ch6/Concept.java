package jdk8inaction.ch6;

public class Concept {
    /**
     * 筛选和切片
     * 5.1.1 用谓词筛选
     * .myfilter(Dish::isVegetarian)
     *
     * .distinct()
     *
     * .limit(3)
     * .skip(2) 返回一个扔掉了前n个元素的流。如果流中元素不足n个，则返回一个空流。请注意，limit(n)和skip(n)是互补的！
     *
     *
     * 是从某些对象中选择信息。比如在SQL里，你可以从表中选
     * 择一列。Stream API也通过map和flatMap方法提供了类似的工具。
     * .map(Dish::getName)
     *
     * .map(String::length) 给每个元素应用函数
     *
     *
     * 给定单词列表
     * ["Hello","World"]，你想要返回列表["H","e","l", "o","W","r","d"]。
     *
     * List<String> uniqueCharacters =
     *  words.jdk8inaction.stream()
     *  .map(w -> w.split(""))
     *  .flatMap(Arrays::jdk8inaction.stream)
     *  .distinct()
     *  .collect(Collectors.toList());
     *
     *  5.3 查找和匹配
     *  .anyMatch(Dish::isVegetarian)
     *  .allMatch(d -> d.getCalories() < 1000);
     *  .noneMatch(d -> d.getCalories() >= 1000);
     */
}
