package com.atguigu.scala0722.day04.homework



/**
  * Author lzc
  * Date 2019/12/3 9:02
  */
object Homework4 {
    def main(args: Array[String]): Unit = {
        println(new Rectangle(new Point(10, 0), new Point(0, 10)).area)
        
    }
}
class Point(val x: Int, val y: Int)
/*
5. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)
 */
abstract class Shape{
    def centerPoint: Point
    def area: Double
}

class Rectangle(val leftTop: Point, val rightBottom:Point) extends Shape{
    override def centerPoint: Point = new Point((leftTop.x + rightBottom.x) / 2, (leftTop.y + rightBottom.y) / 2)
    override def area: Double = (leftTop.x - rightBottom.x) * (leftTop.y - rightBottom.y).abs
}

class Circe(center: Point, r: Double) extends Shape{
    override def centerPoint: Point = center
    
    override def area: Double = math.Pi * r * r
}