package a;

/**
 * @Author lzc
 * @Date 2019/11/29 10:43
 */
public class A {

    static {  //

    }

    { //

    }


    public static void main(String... args) {
        F f = new C();
        f.foo();

    }


}


abstract class F {

    public void foo() {
        System.out.println("f...");
        foo1();
    }

    abstract void foo1();


}

class C extends F {


    public void foo1() {
        System.out.println("foo1");
    }
}
