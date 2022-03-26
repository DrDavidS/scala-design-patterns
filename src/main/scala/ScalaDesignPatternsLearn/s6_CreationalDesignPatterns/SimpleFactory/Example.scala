package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.SimpleFactory

import ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.SimpleFactory.CircleUtils.getClass

import java.util.Properties

object Example {
  def main(args: Array[String]): Unit = {
    // 记得先创建一个 pi.properties 配置文件
    println(s"The basic area for a circle with radius 2.5 is ${CircleUtils.area(2.5)}")
    println(s"The precise area for a circle with radius 2.5 is ${CircleUtils.area(2.5, isPrecise = true)}")
    println(s"The basic area for a circle with radius 6.78 is ${CircleUtils.area(6.78)}")
    println(s"The precise area for a circle with radius 6.78 is ${CircleUtils.area(6.78, isPrecise = true)}")
  }
}
