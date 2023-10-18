package com.aslanjavasky.mod1_spring_core.lesson8_component_annotation

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
*/

fun main() {

    val context =
        AnnotationConfigApplicationContext(ProjectConfiguration::class.java)

    val bookHistoryOfMagic = context.getBean("MH",Book::class.java)
    val bookPotions = context.getBean("P",Book::class.java)
    println("The author of book History Of Magic is ${bookHistoryOfMagic.author} and the author of Potions book is ${bookPotions.author} .")


    val owlOfHarry=context.getBean("OwlOfHarry",Owl::class.java)
    val owlOfRon=context.getBean("Sychik",Owl::class.java)
    val owlOfWeasley=context.getBean("Arrow",Owl::class.java)
    println("The Harry Potter's owl is ${owlOfHarry.name}, the Roanld's owl is ${owlOfRon.name} and the owl of Weasley family is ${owlOfWeasley.name}.")

    val wand=context.getBean(MagicWand::class.java)
    println(wand)



}
