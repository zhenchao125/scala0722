package com.atguigu.scala0722.day04.homework

/**
  * Author lzc
  * Date 2019/12/3 8:27
  */
object Homework1 {
    def main(args: Array[String]): Unit = {
        val card = new Card("♥")
        println(card.isRed)
    }
}

// 2. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，并实现一个函数,检查某张牌的花色是否为红色

class Card(val color: String){
    
    lazy val isRed = if(color == "♦" || color == "♥")  true else false
    
    override def toString: String = s"花色: $color"
}