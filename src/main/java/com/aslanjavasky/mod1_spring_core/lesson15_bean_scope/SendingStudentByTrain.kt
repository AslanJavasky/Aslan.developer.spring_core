package com.aslanjavasky.mod1_spring_core.lesson15_bean_scope

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Component
@Qualifier("SendByTrain")
class SendingStudentByTrain : Sendable {

    override fun sendStudent(studentName:String) {
        println("$studentName sent to school by train")
    }
}