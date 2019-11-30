package com.atguigu.scala0722.day02.controlabs

/**
  * Author lzc
  * Date 2019/11/30 16:08
  */
object MyWhile {
    def main(args: Array[String]): Unit = {
        var i = 1
        myWhile(i <= 100) {
            println(i)
            i += 1
        }
    }
    
    def myWhile(condition: => Boolean)(op: => Unit):Unit = {
        if(condition){
            op
            myWhile(condition)(op)
        }
    }
}

/*



*/