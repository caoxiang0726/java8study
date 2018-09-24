package stream;

import util.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static util.Dish.menu;

/**
 * 5.4 归约(类似聚合函数)
 */
public class Reducing{

    public static void main(String...args){

        /**
         * int sum = 0;
         * for (int x : numbers) {
         *  sum += x;
         * }
          */
        List<Integer> numbers = Arrays.asList(3,4,5,1,2);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);//0是初始值
        int chengfa = numbers.stream().reduce(1, (a, b) -> a * b);//乘法
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int calories = menu.stream()
                           .map(Dish::getCalories)
                           .reduce(0, Integer::sum);
        System.out.println("Number of calories:" + calories);

        int count = menu.stream().map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        long count1 = menu.stream().count();
        System.out.println("nemu count:"+count+",count1:"+count1);
        /**
         * map和reduce的连接通常称为map-reduce模式，因Google用它来进行网络搜索而出名，
         * 因为它很容易并行化。
         * 而迭代式求和例子要更新共享变量sum，这不是那么容易并行化的。
         */


        /**
         * 流操作：无状态和有状态
         * 你已经看到了很多的流操作。乍一看流操作简直是灵丹妙药，而且只要在从集合生成流的
         * 时候把Stream换成parallelStream就可以实现并行。
         *
         *
         * 1诸如map或filter等操作会从输入流中获取每一个元素，并在输出流中得到0或1个结果。
         * 这些操作一般都是无状态的：它们没有内部状态（假设用户提供的Lambda或方法引用没有内
         * 部可变状态）。
         * 2但诸如reduce、sum、max等操作需要内部状态来累积结果。在上面的情况下，内部状态
         * 很小。在我们的例子里就是一个int或double。不管流中有多少元素要处理，内部状态都是
         * 有界的。
         * 3相反，诸如sort或distinct等操作一开始都和filter和map差不多——都是接受一个
         * 流，再生成一个流（中间操作），但有一个关键的区别。从流中排序和删除重复项时都需要知
         * 道先前的历史。例如，排序要求所有元素都放入缓冲区后才能给输出流加入一个项目，这一操
         * 作的存储要求是无界的。要是流比较大或是无限的，就可能会有问题（把质数流倒序会做什么
         * 呢？它应当返回最大的质数，但数学告诉我们它不存在）。我们把这些操作叫作有状态操作。
         */

    }
}