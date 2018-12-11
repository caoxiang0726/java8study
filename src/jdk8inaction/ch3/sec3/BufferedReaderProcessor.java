package jdk8inaction.ch3.sec3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor { 
 String process(BufferedReader b) throws IOException;
}