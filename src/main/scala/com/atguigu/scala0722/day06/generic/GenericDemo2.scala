package com.atguigu.scala0722.day06.generic

object GenericDemo2 {
    def main(args: Array[String]): Unit = {
        val a : A = new B
        
//        val arr1:Array[A] = Array[A](new B)
        
        /*val list1: List[A] = List[B](new B)
        
        val lis2: List[B] = List[A](new A)*/
    }
}

class A
class B extends A

class C[+T, -A](t: T){
    
    //方法参数位置是逆变点, 返回值是位置协变点
    def foo(a: A, f: T => A): T = {
        t
    }
}
/*

B是A的子类, B的集合并不属于A的集合类型

泛型:
    不变
        默认都是不变的
    协变
        子类的集合对象和赋值父类的集合类型
        [+T]
    逆变
        父类型的集合对象赋值子类型集合类型
        [-T]
     
   
*/