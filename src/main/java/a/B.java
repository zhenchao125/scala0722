package a;

/**
 * @Author lzc
 * @Date 2019/12/2 10:49
 */
public class B {
    public static void main(String[] args) {
        CC cc = new CC();
        AA aa = cc;
        /*System.out.println(cc.a);
        System.out.println(cc.getA());*/

//        System.out.println(cc.a);
//        System.out.println(cc.getA());
        System.out.println(cc.getA());
        System.out.println(aa.getA());

        System.out.println(cc.a);
        System.out.println(aa.a);
    }
}


class AA {
    public int a = 10;

    public int getA() {
        return this.a;
    }
}

class CC extends AA {
    public int a = 20;

    /*public int getA() {
        return this.a;
    }*/
}
