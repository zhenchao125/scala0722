package com.atguigu.scala0722.day03.test

/**
  * Author lzc
  * Date 2019/12/2 16:31
  */
object TestDemo {
    def main(args: Array[String]): Unit = {
        type aaaaaaaa = A
        val a = new aaaaaaaa
        println(a.getClass.getSimpleName)
        
        //        val a:A = new B
        //        a.asInstanceOf[B].foo()
        //
        //        println(a.getClass.getName)
        //        println(a.getClass.getSimpleName)
        
        //        println(b.isInstanceOf[B])
        //        println(b.isInstanceOf[A])
        //        println(b.isInstanceOf[AnyRef])
        //        println(b.isInstanceOf[Any])
        //        println(b.isInstanceOf[Object])
        
        // 获取字节码   A.class  A.class
        //        val aC: Class[A] = classOf[A]  // java: A.class
        //        println(aC.getSimpleName)
    }
}

class A{

}

class B extends A {
    def foo() = {
    
    }
}
