package a;

/**
 * @Author lzc
 * @Date 2019/11/29 10:43
 */
public class A {



    public static void main(String ... args) {
        int a = 10;

        new Runnable(){
            @Override
            public void run() {
                System.out.println(a);
            }
        }.run();
//        a = 20;

    }



}
