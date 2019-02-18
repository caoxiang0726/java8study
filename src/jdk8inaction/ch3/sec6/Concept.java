package jdk8inaction.ch3.sec6;

/**
 * 3.6 方法引用
 */
public class Concept {
   /* public static void main(String[] args) {
        Runnable r = ()->Thread.currentThread().dumpStack();
        new Thread(r).start();
    }*/

    public static void main(String[] args) {
        String s  = "s";
        Integer.parseInt(s);
    }

}
