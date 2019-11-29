package com.atguigu.scala0722.day01.loop

/**
  * Author lzc
  * Date 2019/11/29 15:22
  */
object ForDemo1 {
    def main(args: Array[String]): Unit = {
        /*val a = "abc"
        for(c <- a){
            println(c)
        }*/
        
        /*for(i <- Array(1, 2,4)){
            println(i)
        }*/
        
        /*for(i <- 1.to(100))  {
            println(i)
        }*/
        /*for (elem <- 1 to (100, 2)) {
            println(elem)
        }*/
        
        /*for (elem <- (1 to 100).reverse) {
            println(elem)
        }*/
        
        /*for(i <- 100 to (1, -1)){
            println(i)
        }*/
        
        /*for(i <- 0 until 100){
            println(i)
        }*/
        
        // 循环守卫
        /*for (i <- 0 to 100 if i % 2 == 0) {
            println(i)
        }
        */
        
        
        for(i <- 1 to 100 by 2){
            println(i)
        }
    }
}

/*
for是一种遍历
 */