package jdk8inaction.ch3.sec5;


/**
 * 类型检查
 */
public class Concept {
    /**
    List<Apple> greenApples =
            myfilter(inventory, a -> "green".equals(a.getColor()));
    Lambda表达式有多个参数，代码可读性的好处就更为明显。例如，你可以这样来创建一个
    Comparator对象：
    Comparator<Apple> c =
            (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    Comparator<Apple> c =
            (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());
    请注意，有时候显式写出类型更易读，有时候去掉它们更易读。没有什么法则说哪种更好；
    对于如何让代码更易读，程序员必须做出自己的选择。
            ——————————
            ① 请注意，当Lambda仅有一个类型需要推断的参数时，参数名称两边的括号也可以省略。
     */
}
