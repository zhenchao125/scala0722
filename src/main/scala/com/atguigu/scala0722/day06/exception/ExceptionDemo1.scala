package com.atguigu.scala0722.day06.exception

import java.io.FileNotFoundException


/**
  * Author lzc
  * Date 2019/12/6 9:41
  */
object ExceptionDemo1 {
    def main(args: Array[String]): Unit = {
        //IO/net
        try {
            Thread.sleep(1000)
        } catch {
            case e: FileNotFoundException =>
            case e: RuntimeException =>
            case _ =>
        } finally {
        
        }
        
        
    }
    
//    @throws(classOf[FileNotFoundException])
    @throws[FileNotFoundException]
    def foo() = {
        throw new RuntimeException
    }
    
    
}

/*

异常:
1.  抛出异常
        虚拟机抛
        主动抛 throw new ....

2.  处理异常
      捕捉异常
        try{
        }
      声明异常类型
            throws

异常分类:
    运行时类型
            可处理, 也可不处理
    受检异常
-----
在scala中, 所有的异常都不用必须处理


*/