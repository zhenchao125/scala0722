package com.atguigu.scala0722.day06.other

/**
  * Author lzc
  * Date 2019/12/6 13:53
  */
object Other1 {
    var a :Double = 1
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 7, 6, 40, 30)
        foo()
        
        arr1.foreach(x => {
            if (x <= 20) return
            println(x)
        })
        
        println("xxxx")
        foo()
        
        def f2() = {
        
        }
        
        
        ff1(f2 _)
        ff1(f1 _)
        
    }
    
    def f1() = {
    
    }
    def ff1(f: () => Unit)={
    
    }
    
    
    def foo(): Int = {
        return 10
    }
}

/*
_ 用法的总结:
    1. 导包的通配符
    2. var类型的属性的默认值
            var a : Int = _
    3. 集合类型的展开  (可变传数组   arr:_*)
    4. 匿名函数参数的占位符
            reduce(_ + _)
    5. 元组的索引前缀  _1  _2
    6. 模式匹配的通配符
        case _ =>
    7. 部分应用函数
    8. 传递函数
        告诉编译, 我是在传递函数而不是在调用
    9. 异常类型
        case _ =>

类型的推导:
    1. 有return的时候, 返回值类型不能推
    2. 递归的时候, 返回值类型不能推
    3. 类的属性使用默认值的时候不能推
    4. 当推的类型和预期类型不一致的不能推
    
前置运算符:

*/