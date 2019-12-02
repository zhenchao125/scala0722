package com.atguigu.scala0722.day03.pack




/**
  * Author lzc
  * Date 2019/12/2 11:16
  */
object PackDemo {
    def main(args: Array[String]): Unit = {
        import java.util.HashMap
        val map = new HashMap[Int, Int]
        
        foo()
        
    }
}

//class HashMap[T, V]

class A

package abc {
    
    class A
    
}

/*
java:
    包:
        1. 声明包
            package com.atguigu.scala0722.day03.pack
            
        2. 导入包(类)
            import ....Math
            a: 一次导入一个
            b: 通配符导入
                import java.util.*
scala:
    声明包:
        1. 在顶层声明(和java一致)
        2. 包语句
            package 子包{
                    //
            }
            
    导包:
        1. 在顶层使用import来导
            import java.util._  通配符导入
            import java.util.{HashMap => JM}
            
            import java.util.{HashMap, TreeMap} 一次性导入多个类
            import java.util.{HashMap => JM, TreeMap=> TM} 导入的时候给类起别名
            import java.util.{HashMap => _, _} 屏蔽HashMap
            
         2. 在scala中, 任何的地方都可以导包
    
   
     包对象:
        package object pack{
        }
     
     


*/