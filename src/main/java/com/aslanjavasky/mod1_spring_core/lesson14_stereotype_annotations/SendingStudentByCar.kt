package com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Component
@Qualifier("SendByCar")
class SendingStudentByCar:Sendable {

    override fun sendStudent(studentName: String) {
        println("$studentName sent to school by car")
    }
}