package com.aslanjavasky.mod1_spring_core.lesson15_bean_scope

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */

fun main() {

    val context =
        AnnotationConfigApplicationContext(ProjectConfiguration::class.java)

    val service1=context.getBean(SendingService::class.java)
    val service2=context.getBean(SendingService::class.java)

    println(service1 == service2)

}
