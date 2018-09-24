package ch2.sec4.runnable;

import ch1.sec2.title2.Apple;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("hello world")).start();
    }
}
