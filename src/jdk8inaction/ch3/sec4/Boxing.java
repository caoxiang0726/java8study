package jdk8inaction.ch3.sec4;

/**
 *  避免自动装箱 与小结
 */
public class Boxing {
    /**
     * 函数式接口带来了一个专门的版本，以便在输入和输出都是原始类型时避免自动装箱的操作
     * DoublePredicate、IntConsumer、LongBinaryOperator、IntFunction
     */


    /** 函数式接口      函数描述符
     * Predicate<T>   T->boolean
     * Consumer<T>    T->void
     * Function<T,R>   T->R IntFunction<R>
     *
     * 等等
     */

    /**
     * 其他的使用案例：
     * 创建对象 () -> new Apple(10) Supplier<Apple>
     * 合并两个值 (int a, int b) -> a * b IntBinaryOperator
     * 比较两个对象 (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()) Comparator<Apple>或其他
     */
}
