package jdk8inaction.ch3.sec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessFile {

    public static String getline() throws IOException {
        /**
         * try-with-resources statement try后面跟了一个括号，括号里面声明的资源无需close
         */
        //data.txt中有3行，内容分别为a,b,c
        try (BufferedReader br =
                     new BufferedReader(new FileReader("D:\\data.txt"))) {
            return br.readLine();
        }
    }
    public static String getlineUseLambda(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("D:\\data.txt"))) {
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String getline = getline();//a
        String oneLine = getlineUseLambda((BufferedReader br) -> br.readLine());//a
        String twoLines = getlineUseLambda((BufferedReader br) -> br.readLine() + br.readLine());//ab
    }
}
