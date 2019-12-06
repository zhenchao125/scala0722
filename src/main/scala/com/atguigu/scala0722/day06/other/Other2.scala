package com.atguigu.scala0722.day06.other

object Other2 {
    def main(args: Array[String]): Unit = {
        val my = new My
        my.unary_+
        +my
        -my
        !my
        ~my
        
        val a: Option[Int] = Some(1)
        
        
        a match {
            case Some(num) => println(num)
            case None =>
        }
        
        
        //----
        def sqrt(d: Double)=
            if(d >= 0) Right(math.sqrt(d))
            else Left("你传的值无法计算平方根")
        
        val either: Either[String, Double] = sqrt(-9)
        /*if (either.isRight) {
            println(either.right.get)
        }*/
        
        either match {
            case Right(res) => println(res)
            case Left(err) => println(err)
        }
        
    }
    
    
    
}
class My{
    def unary_+ = {
        println("my....")
    }
    def unary_- = {
        println("my -....")
    }
    def unary_! = {
        println("my !....")
    }
    def unary_~ = {
        println("my ~....")
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
    
3种运算符:
    前置运算符:
        +1 -1 !true
        
    def unary_~ = {
        println("my ~....")
    }
        
    中置运算符
        1 + 2
        a foo 3
    后置运算符
        5!
        a toString
        
Any
AnyRef
AnyVal

Nothing
Option  值, 可能有, 也可能没有
    Some
    None
    
Either 得到的值有两种可能, 要么是对的, 要么是错
    Right
    Left
    

    
 */