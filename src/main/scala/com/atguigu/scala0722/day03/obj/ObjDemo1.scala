package com.atguigu.scala0722.day03.obj

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019/12/2 8:58
  */
object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        val user = new User()
        println(user.age) // 访问属性  getXxx
        println(user.getAge)
        user.name = "zs"  // 修改属性 setXxx
//        user.name_$eq("lisi")  // 等价于上面
        println(user.name)
        
        user.study()
    }
}

class User{
    // 让虚拟机自动赋默认值
    @BeanProperty  // 兼容标准的javabean规范
    var age: Int = _
    @BeanProperty
    var name: String = _
    @BeanProperty
    val sex: String = "男"
    
   /* def getAge():Int =  age
    def setAge(age: Int) = this.age =age*/
    def study() = {
        this.age += 1
        println(this.age)
    }
}


/*
面向对象:
    封装
    
    继承
        方法的覆写
        
        (重载)
    多态
        
        
        编译时类型与运行时类型不一致, 就会有多态
  
属性(成员变量)三种默认值:
    对象   = null
    数值型   = 0
    boolean = false
 
public int getAge(){}
public void setAge(int age){}
 */