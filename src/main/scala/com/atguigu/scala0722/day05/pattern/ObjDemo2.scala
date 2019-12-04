package com.atguigu.scala0722.day05.pattern

/**
  * Author lzc
  * Date 2019/12/4 15:52
  */
object ObjDemo2 {
    def main(args: Array[String]): Unit = {
        val user = new User(10, "李四")
        user match {
            case User(age, name) => println(age,  name)
        }
        
    }
}
object User{
    def unapply(user: User) = Some((user.age, user.name))
}

class User(val age:Int, val name:String)