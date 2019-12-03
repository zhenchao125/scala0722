package com.atguigu.scala0722.day04.homework

object Homework3 {
    def main(args: Array[String]): Unit = {
        val lp = new LabeledPoint("black", 100, 200)
        println(lp)
    }
}



class LabeledPoint(val label: String, override val x: Int, override val y: Int) extends Point(x, y){
    override def toString: String = s"x = $x, y = $y, label = $label"
}

/*
4. 设计一个Point类，其x和y坐标可以通过构造器提供。
     提供一个子类 LabeledPoint，其构造器接受一个标签值和x,y坐标,比如:new LabeledPoint(“Black Thursday”,1929,230.07)

 */