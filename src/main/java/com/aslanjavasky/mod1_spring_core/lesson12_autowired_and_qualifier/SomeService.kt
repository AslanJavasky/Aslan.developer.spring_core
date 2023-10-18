package com.aslanjavasky.mod1_spring_core.lesson12_autowired_and_qualifier

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