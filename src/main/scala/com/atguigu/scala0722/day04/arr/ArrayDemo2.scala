package com.atguigu.scala0722.day04.arr

/**
  * Author lzc
  * Date 2019/12/3 9:15
  */
object ArrayDemo2 {
    def main(args: Array[String]): Unit = {
        var arr1 = Array(30, 50, 70, 60, 10, 20)
        
        // :+ 向那些不可变集合追加元素的操作
//        val arr2 = arr1 :+ 100   // arr.:+(100)
        
        // :+  =  复合运算符
//        arr1 :+= 100
        println(arr1.mkString(","))
        
        // 向数组的头部添加
//        val arr2 = arr1.+:(100)
//        val arr2 = arr1 +: 100     // 100.+:(arr1)
//        val arr2 = 100 +: arr1     // arr1.+:(100)
        arr1 +:= 100
        println(arr1.mkString(", "))
    }
}

/*

运算符的结合性约定:
     2 + 3  left->right  左结合
     
     val a = 10 右结合
     
     如何一个运算符以 :结尾, 则这个运算符就是右结合
 
    
    
 */