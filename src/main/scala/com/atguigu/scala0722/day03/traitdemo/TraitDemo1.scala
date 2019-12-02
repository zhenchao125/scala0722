package com.atguigu.scala0722.day03.traitdemo

/**
  * Author lzc
  * Date 2019/12/2 15:30
  */
object TraitDemo1 {
    def main(args: Array[String]): Unit = {
        val usb:MotherBoard = new HuaweiUsb
//        usb.insert
        usb.printBD()
    }
}

trait Usb{
    def insert: Unit
    
    def print() = {
        println("trait usb")
    }
}

trait MotherBoard{
    def printBD(): Unit
}

class HuaweiUsb extends Usb with MotherBoard {
    override def insert: Unit = {
        println("华为usb已经插入...")
    }
    
    override def printBD(): Unit = {
        println("huawei...")
    }
}


/*
trait 特质

java1.8之前:
    java的接口: 常量+抽象方法
    
trait:
    对应着java中的接口, 但是比java的接口的功能更丰富

混入特质
*/