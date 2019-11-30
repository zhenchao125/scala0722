package com.atguigu.scala0722.day02.controlabs

/**
  * Author lzc
  * Date 2019/11/30 14:58
  */
object ControlAbsDemo2 {
    def main(args: Array[String]): Unit = {
        
        
       /* foo{
            println("aa")
            println("bb")
        }*/
        
        runInThread{
            println(".......xxx......")
        }
        
    }
    
    // 定义一个函数, 可以在一个子线程中执行一段代码
    def runInThread(op : => Unit) = {
        new Thread(){
            override def run(): Unit = {
                println(s"当前线程名字: ${Thread.currentThread().getName}")
                op
            }
        }.start()
    }
    
    /*def foo(action: => Unit) = {
        action
        action
    }*/
}

/*
控制抽象:
    写出来类型与while if.. 这些控制语句出来
    
名调用和值调用



 */
