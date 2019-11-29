package com.atguigu.scala0722.day01.fun

/**
  * Author lzc
  * Date 2019/11/29 16:55
  */
object FunDmo2 {
    def main(args: Array[String]): Unit = {
        println(isPrime(7))
        println(isPrime(17))
        println(isPrime(85048501))
        
        
    }
    
    
    
    def isPrime(n: Int): Boolean = {
        for (i <- 2 until n) {
            if (n % i == 0) return false
        }
        true
    }
}
