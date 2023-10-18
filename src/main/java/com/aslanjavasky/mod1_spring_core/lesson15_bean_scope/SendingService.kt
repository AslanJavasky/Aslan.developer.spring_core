package com.aslanjavasky.mod1_spring_core.lesson15_bean_scope

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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

    init {
        println("The SendingService is created!")
    }

}