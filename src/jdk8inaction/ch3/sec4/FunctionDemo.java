package jdk8inaction.ch3.sec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
    //Function<T,R>  它接受一个泛型T的对象，并返回一个泛型R的对象
    public static <T, R> List<R> my_map(List<T> list, Function<T, R> f) {//这个方法定义的,看不懂了。。
        List<R> result = new ArrayList<>();
        for (T s : list) {
            result.add(f.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = my_map(
                Arrays.asList("lambdas", "in", "action"),
                (String s) -> s.length()
        );//lambda表达式是 apply方法的实现。
        System.out.println(list);

        /**
         * List<String> colNameList = filedsAfterRm.stream().map(str -> {
         *             String colName = str.getColName();
         *             return colName;
         *         }).collect(Collectors.toList());
         */

        List<Integer> collect = Arrays.asList("abc", "de").stream().map(str -> {
            return str.length();
        }).collect(Collectors.toList());
        System.out.println(collect);


    }
}
