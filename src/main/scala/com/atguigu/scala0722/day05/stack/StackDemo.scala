package com.atguigu.scala0722.day05.stack

/**
  * Author lzc
  * Date 2019/12/4 9:51
  */
object StackDemo {
    def main(args: Array[String]): Unit = {
        // stack FILO
        /*val stack: mutable.Stack[Int] = mutable.Stack(10, 20, 30)
        stack.push(40)
        stack.push(50)
        stack.push(60)
        stack.push(70)
//        println(stack.pop())
        println(stack)*/
        
        
        val stack = new java.util.Stack[Int]()
        stack.push(10)
        stack.push(20)
        stack.push(30)
        println(stack.pop())
        println(stack.peek())
        println(stack)
        
    }
}
