package jdk8inaction.ch3.sec5;


public class Concept {
    public static void main(String[] args) {
        int port = 8080;//变量必须是隐式最终的
        Runnable r = () -> {
            System.out.println(port);//idea中port被标记为final
        };

    }

}
