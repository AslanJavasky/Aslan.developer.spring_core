package com.aslanjavasky.mod1_spring_core.lesson2_what_is_applicationContext_for_DI

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
class SomeService(
    val tripToHogwarts:TripToHogwarts,
    var studentName:String=""

) {
    fun doTrip(){
        println("$studentName went to school")
    }
}