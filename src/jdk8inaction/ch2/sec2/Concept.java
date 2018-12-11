package jdk8inaction.ch2.sec2;

import jdk8inaction.ch1.sec2.title2.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.2 行为参数化
 */
public class Concept {
    /**
     * 你需要一种比添加很多参数更好的方法来应对变化的需求。让
     * 我们后退一步来看看更高层次的抽象。一种可能的解决方案是对你的选择标准建模：你考虑的
     * 是苹果，需要根据Apple的某些属性（比如它是绿色的吗？重量超过150克吗？）来返回一个
     * boolean值。我们把它称为谓词（即一个返回boolean值的函数）。让我们定义一个接口来对选
     * 择标准建模：
     *
     * public interface ApplePredicate{
     *  boolean test (Apple apple);
     * }
     *
     * 现在你就可以用ApplePredicate的多个实现代表不同的选择标准了，
     * 你刚做的这些和“策略设计模式”①相关，
     * 它让你定义一族算法，把它们封装起来（称为“策略”），然后在运行时选择一个算法。
     */


    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    /**
     *
     *
     * public class AppleRedAndHeavyPredicate implements ApplePredicate{
     *  public boolean test(Apple apple){
     *  return "red".equals(apple.getColor())
     *  && apple.getWeight() > 150;
     *  }
     * }
     * 中的：
     *
     *
     * return "red".equals(apple.getColor())
     *  && apple.getWeight() > 150;
     *
     *  这一段能不能作为参数传递呢？
     */
}
