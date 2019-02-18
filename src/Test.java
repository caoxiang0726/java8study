import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String requestURIurl = "/task/mySubmit/666";
        String md5Url = requestURIurl.substring(0, requestURIurl.lastIndexOf("/"));
        System.out.println(md5Url);

        for (int i = 0; i < 100000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int[] a = new int[1000 * 1000];
                    System.out.println("aa");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }


    }
}
