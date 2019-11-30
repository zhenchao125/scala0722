package a;

/**
 * @Author lzc
 * @Date 2019/11/29 10:43
 */
public class A {

    public static int type = 10;
    public static int b = 20;

    public static void main(String ... args) {
        int a, b;
        b = a = 3;
        System.out.println(a = 6);

        add(1, 2, 3);
        add(new int[]{1, 3, 4});


    }

    public static void add(int ... nums){

    }

}
