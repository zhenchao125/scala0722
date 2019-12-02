package b;

/**
 * @Author lzc
 * @Date 2019/12/2 14:11
 */
public class B extends A {

    public static void main(String[] args) {
        A a = new A();
        a.foo();
    }

    public void foo1(){
        super.foo();
        foo();
    }

}
