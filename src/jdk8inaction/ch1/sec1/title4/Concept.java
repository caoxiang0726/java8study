package jdk8inaction.ch1.sec1.title4;

/**
 * 1.1.4 并行与共享的可变数据
 */
public class Concept {
    /**
     * 流处理能力时说的“几乎免费的并行”。你需要放弃什么吗？
     *
     * 你的行为必须能够同时对不同的输入安全
     * 地执行。一般情况下这就意味着，你写代码时不能访问共享的可变数据。这些函数有时被称为“纯
     * 函数”或“无副作用函数”或“无状态函数”，
     *
     * 这两个要点（没有共享的可变数据，将方法和函数即代码传递给其他方法的能力）是我们平
     * 常所说的函数式编程范式的基石，
     */
}