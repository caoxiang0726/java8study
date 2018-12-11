package jdk8inaction.ch1.sec3;

import jdk8inaction.ch1.sec2.title2.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1.3 流
 */
public class Concept {

    /**
     * 现在
     * 值得注意的是，和Collection API相比，Stream API处理数据的方式非常不同。用集合的话，你得
     * 自己去做迭代的过程。你得用for-each循环一个个去迭代元素，然后再处理元素。我们把这种
     * 数据迭代的方法称为外部迭代。相反，有了Stream API，你根本用不着操心循环的事情。数据处
     * 理完全是在库内部进行的。我们把这种思想叫作内部迭代。
     */

    /**
     * 使用集合的另一个头疼的地方是，想想看，要是你的交易量非常庞大，你要怎么处理这个巨
     * 大的列表呢？单个CPU根本搞不定这么大量的数据，但你很可能已经有了一台多核电脑。理想的
     * 情况下，你可能想让这些CPU内核共同分担处理工作，以缩短处理时间。理论上来说，要是你有
     * 八个核，那并行起来，处理数据的速度应该是单核的八倍
     *
     * 这类操
     * 作常常可以并行化。例如，如图1-6所示，在两个CPU上筛选列表，可以让一个CPU处理列表的
     * 前一半，第二个CPU处理后一半，这称为分支步骤(1)。CPU随后对各自的半个列表做筛选(2)。
     * 最后(3)，一个CPU会把两个结果合并起来
     *
     * Collection主要是为了存储和访问数据，而Stream则主要用
     * 于描述对数据的计算。这里的关键点在于，Stream允许并提倡并行处理一个Stream中的元素。
     * 我们这里还只是说“几乎免费的并行”，让你稍微体验一下，如何
     * 利用Stream和Lambda表达式顺序或并行地从一个列表里筛选比较重的苹果。
     *
     */

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple apple = new Apple(180,"green");
        Apple apple2 = new Apple(100,"yellow");
        Apple apple3 = new Apple(170,"red");
        apples.add(apple);
        apples.add(apple2);
        apples.add(apple3);

        //顺序处理：

        System.out.println(apples.stream().
                filter((Apple a) -> a.getWeight()>150).
                collect(Collectors.toList()));
        //并行处理：
        System.out.println(apples.parallelStream().
                filter((Apple a)-> a.getWeight()>150).collect(Collectors.toList()));

        /**
         * 在加入所有这些新玩意儿改进
         * Java 的时候， Java 8 设计者发现的一个现实问题就是现有的接口也在改进。比如，
         * Collections.sort方法真的应该属于List接口，但却从来没有放在后者里。理想的情况下，
         * 你会希望做list.sort(comparator)，而不是Collections.sort(list, comparator)。
         * 这看起来无关紧要，但是在Java 8之前，你可能会更新一个接口，然后发现你把所有实现它的类
         * 也给更新了——简直是逻辑灾难！
         * 这个问题在Java 8里由默认方法解决了。
         */

        /**
         * 虽然函数式编程中
         * 的函数的主要意思是“把函数作为一等值”，不过它也常常隐含着第二层意思，即“执行时在
         * 元素之间无互动”。
         */

    }


}
