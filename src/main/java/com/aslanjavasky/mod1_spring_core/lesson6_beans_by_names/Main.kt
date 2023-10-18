package com.aslanjavasky.mod1_spring_core.lesson6_beans_by_names

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
*/

fun main() {

    val context =
        AnnotationConfigApplicationContext(ProjectConfiguration::class.java)

    val bookHistoryOfMagic = context.getBean("HistoryOfMagic",Book::class.java)
    val bookPotions = context.getBean("Potions",Book::class.java)
    println("The author of book History Of Magic is ${bookHistoryOfMagic.author} and the author of Potions book is ${bookPotions.author} .")


    val owlOfHarry=context.getBean("HedwigOwl",Owl::class.java)
    val owlOfRon=context.getBean("SychikOwl",Owl::class.java)
    val owlOfWeasley=context.getBean("ArrowOwl",Owl::class.java)
    println("The Harry Potter's owl is ${owlOfHarry.name}, the Roanld's owl is ${owlOfRon.name} and the owl of Weasley family is ${owlOfWeasley.name}.")


}
