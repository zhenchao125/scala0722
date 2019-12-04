package com.atguigu.scala0722.day05.queue

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019/12/4 9:51
  */
object QueueDemo {
    def main(args: Array[String]): Unit = {
        val queue: mutable.Queue[Int] = mutable.Queue(10, 20, 30, 40)
        // 入队 出队   FIFO
        queue.enqueue(50)
        println(queue.dequeue())
        
        println(queue)
    }
}
