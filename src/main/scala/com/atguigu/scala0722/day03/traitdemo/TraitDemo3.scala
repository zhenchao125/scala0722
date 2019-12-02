package com.atguigu.scala0722.day03.traitdemo

/**
  * Author lzc
  * Date 2019/12/2 16:06
  */
object TraitDemo3 {
    def main(args: Array[String]): Unit = {
        val logger = new MyLogger()
        logger.printError()
    }
}

/*trait Logger extends RuntimeException{
    def printError()={
        println(getMessage)
    }
}*/
// 自身类型
// 将来混入Logger 的那些类, 必须先去继承一个类RuntimeException或者RuntimeException的子类
trait Logger {
    //    this: RuntimeException =>
    _: RuntimeException =>
    def printError() = {
        println(getMessage())
    }
}

class MyLogger extends RuntimeException with Logger


/*



 */