package com.aslanjavasky.mod1_spring_core.lesson7_custom_names_for_beans

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
class SomeService(
    val tripToHogwarts:TripToHogwarts,
    val studentName:String=""

) {
    fun doTrip(){
        println("$studentName went to school")
    }
}