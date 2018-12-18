package jdk8inaction.ch3.sec4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static <T> void my_forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    public static void main(String[] args) {
        my_forEach(Arrays.asList(1, 2, 3), (Integer i) -> System.out.println(i));////lambda 是 Consumer accept方法的实现！！
        //
        Arrays.asList(1, 2, 3).forEach((Integer i) -> System.out.println(i));

    }
}
