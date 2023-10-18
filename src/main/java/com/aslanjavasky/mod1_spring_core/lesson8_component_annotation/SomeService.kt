package com.aslanjavasky.mod1_spring_core.lesson8_component_annotation

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