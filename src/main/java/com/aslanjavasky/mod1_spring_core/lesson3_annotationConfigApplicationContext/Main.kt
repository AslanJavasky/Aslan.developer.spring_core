package com.aslanjavasky.mod1_spring_core.lesson3_annotationConfigApplicationContext

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */

fun main() {

    val context =
        AnnotationConfigApplicationContext(ProjectConfiguration::class.java)

    val book = context.getBean(Book::class.java)
    val owl=context.getBean(Owl::class.java)


    println(book.title)
    println(owl)


}
