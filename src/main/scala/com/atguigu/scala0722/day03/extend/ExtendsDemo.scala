package com.atguigu.scala0722.day03.extend

/**
  * Author lzc
  * Date 2019/12/2 10:28
  */
object ExtendsDemo {
    def main(args: Array[String]): Unit = {
        val son: Father = new Son(100)
        println(son.name)
    }
}

class Father(var name: String, val age: Int) {
    
    def getMoney() = {
        println(s"$name, 给钱 100000000w")
    }
    
    def a = {
        println(" f   a")
        1
        
    }
}


class Son(override val age: Int) extends Father("马云", 50) {
//    override var name: String = _
    
    /*override  def a = {
        println("c  a")
        2
    }*/
    override val a = {
        println(" c   a")
        2
    }
    
    // 覆写方法必须添加关键字
    override def getMoney(): Unit = {
    
    }
}

/*
继承:
    extends
    
 方法的覆写:
  1. 必须加override关键字
  2. 其他和java一致
    
 属性的覆写:
    1. 必须加override关键字
    2. val 只能覆写val的和没有形参def
    2. var只能覆写抽象的var
 */