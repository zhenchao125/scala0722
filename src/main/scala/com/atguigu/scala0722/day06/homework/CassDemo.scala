package com.atguigu.scala0722.day06.homework

/**
  * Author lzc
  * Date 2019/12/6 9:18
  */
object CassDemo {
    def main(args: Array[String]): Unit = {
        val book1 = Book("葵花宝典", 100)
        val book2 = Book("九阴真经", 200)
        
        val bundle1 = Bundle(30, book1, book2)
        val bundle2 = Bundle(20, book1, book2, bundle1)
        println(totalMoney(book1))
        println(totalMoney(book2))
        println(totalMoney(bundle1))
        println(totalMoney(bundle2))
    }
    
    def totalMoney(product: Product): Double = {
        product match {
            case Book(bookName, price) => price
            /*case Bundle(discount, product@_*) =>
                var sum: Double = -discount
                product.foreach(p => {
                    sum += totalMoney(p)
                })
                sum*/
            case Bundle(discount, product@_*) =>
                /*product.foldLeft(-discount)((last, product) => {
                    last + totalMoney(product)
                })*/
//                product.foldLeft(-discount)(_ + totalMoney(_))
//                product./:(-discount)(_ + totalMoney(_))
                (-discount /: product)(_ + totalMoney(_))
        }
    }
    
}

sealed abstract class Product

case class Book(bookName: String, price: Double) extends Product

case class Bundle(discount: Double, product: Product*) extends Product

/*
去商店买书, 多本shu可以打折, 捆绑销售
1. ....
2. 如果买两本以上, -50

根据买的东西不同, 应付的总金额

 */