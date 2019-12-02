package com.atguigu.scala0722.day03.single

/**
  * Author lzc
  * Date 2019/12/2 16:58
  */
object PointDemo1 {
    def main(args: Array[String]): Unit = {
        println(Point(1, 2))
        println(new Point(1, 2))
        println(Point.apply(1, 2))
    }
}


object Point {
    // 一般用来返回伴生类的对象
    def apply(x: Int, y: Int) = new Point(x, y)
}

class Point(val x: Int, val y: Int)