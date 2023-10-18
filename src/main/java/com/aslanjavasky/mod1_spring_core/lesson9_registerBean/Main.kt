package com.aslanjavasky.mod1_spring_core.lesson9_registerBean

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.function.Supplier

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
fun main() {

    val wizardList = mutableListOf<Wizard>()

    wizardList.add(Wizard("Harry Potter", "Gryffindor"))
    wizardList.add(Wizard("Hermione Granger", "Gryffindor"))
    wizardList.add(Wizard("Ron Weasley", "Gryffindor"))
    wizardList.add(Wizard("Draco Malfoy", "Slytherin"))
    wizardList.add(Wizard("Severus Snape", "Slytherin"))
    wizardList.add(Wizard("Luna Lovegood", "Ravenclaw"))
    wizardList.add(Wizard("Cedric Diggory", "Hufflepuff"))
    wizardList.add(Wizard("Bellatrix Lestrange", "Slytherin"))
    wizardList.add(Wizard("Neville Longbottom", "Gryffindor"))
    wizardList.add(Wizard("Sirius Black", "Gryffindor"))

    val wizardSuppliers=wizardList.filter { it.house=="Gryffindor" }
        .associate { it.name to Supplier{it} }

    val context = AnnotationConfigApplicationContext()
    wizardSuppliers.forEach {name, supplier ->
       context.registerBean(name, Wizard::class.java, supplier)
    }
    context.refresh()

    val harry=context.getBean("Harry Potter", Wizard::class.java)
    val ron=context.getBean("Ron Weasley", Wizard::class.java)

    println(ron)
}