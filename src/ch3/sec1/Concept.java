package ch3.sec1;

/**
 * 可以把Lambda表达式理解为简洁地表示可传递的匿名函数的一种方式：它没有名称，但它
 * 有参数列表、函数主体、返回类型，可能还有一个可以抛出的异常列表。这个定义够大的，让我
 * 们慢慢道来。
 *  匿名——我们说匿名，是因为它不像普通的方法那样有一个明确的名称：写得少而想
 * 得多！
 *  函数——我们说它是函数，是因为Lambda函数不像方法那样属于某个特定的类。但和方
 * 法一样，Lambda有参数列表、函数主体、返回类型，还可能有可以抛出的异常列表。
 *  传递——Lambda表达式可以作为参数传递给方法或存储在变量中。
 *  简洁——无需像匿名类那样写很多模板代码。
 */
public class Concept {
    /**
     * (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
     *  Lambda表达式:
     *  由 参数    (Apple a1, Apple a2)
     *     箭头   ->  （把参数列表与Lambda主体分隔开）
     *     主体  a1.getWeight().compareTo(a2.getWeight()
     *     三部分构成。
     *
     *     Lambda没有return语句，因为已经隐含了return
     *     注意Lambda表达式可以包含多行语句，这里是两行  -> { 多行语句}
     *
     *     (parameters) -> expression
     *     (parameters) -> { statements; }
     */
}
