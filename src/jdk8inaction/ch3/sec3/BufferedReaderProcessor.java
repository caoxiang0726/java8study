package jdk8inaction.ch3.sec3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
    //BufferedReader -> String，抛出IOException异常的接口
    // 函数式接口的签名要和方法保持一致。
    String process(BufferedReader b) throws IOException;
}