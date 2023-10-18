package com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */

@Service
class SendingService(
    @Autowired val tripToHogwarts:TripToHogwarts,
    @Autowired val studentName:String,
    @Autowired @Qualifier("SendByCar") val sendable: Sendable,
    @Autowired val repo:StudentDB

) {
    fun sendStudent(){
        sendable.sendStudent(studentName)
        repo.saveStudent()
    }
}