package com.grace.fortune.application

import com.grace.fortune.classes.{Lark, Person,Pizza}

object Application {

  def main (args: Array[String]): Unit = {
    var P = new Pizza
    P.printFilename()

    val a = new Lark
    a.shout

    println("---------------<Person Companion Test>____________________________")
    val p1 = Person(Some("Fred"))
    val p2 = Person(None)

    val p3 = Person(Some("Wilma"), Some(33))
    val p4 = Person(Some("Wilma"), None)

    println(p1)
    println(p2)
    println(p3)
    println(p4)

    println("---------------------</Person Companion Test>_____________________")

  }


}
