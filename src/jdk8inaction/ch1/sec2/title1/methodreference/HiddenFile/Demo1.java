package jdk8inaction.ch1.sec2.title1.methodreference.HiddenFile;

import java.io.File;
import java.io.FileFilter;

public class Demo1 {

    public static void main(String[] args) {




    }

    public static void show1(){
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
    }

    public static void show2(){
        //方法引用::语法（即“把这个方法作为值”）将其传给listFiles方法
        new File(".").listFiles(File::isHidden);
    }

}
