package com.aslanjavasky.mod1_spring_core.lesson13_IoC

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */

@Component
class SendingService(
    @Autowired val tripToHogwarts:TripToHogwarts,
    @Autowired val studentName:String,
    @Autowired @Qualifier("SendByCar") val sendable: Sendable

) {
    fun sendStudent(){
        sendable.sendStudent(studentName)
    }
}