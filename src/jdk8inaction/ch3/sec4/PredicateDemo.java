package jdk8inaction.ch3.sec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static <T> List<T> myfilter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Predicate<String> noneEmptyStr = (String s) -> !s.isEmpty();
        List<String> list = Arrays.asList("a", "b", "", " ", "e");
//        List<String> list2 = myfilter(list, noneEmptyStr);
        List<String> list2 = myfilter(list, (String s) -> !s.isEmpty());//lambda 是 Predicate test方法的实现！！
        System.out.println(list2+",size="+list2.size());//[a, b,  , e],size=4
    }
}
