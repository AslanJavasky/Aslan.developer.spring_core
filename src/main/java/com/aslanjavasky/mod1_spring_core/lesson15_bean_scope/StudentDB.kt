package com.aslanjavasky.mod1_spring_core.lesson15_bean_scope

import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
@Repository
class StudentDB {

    fun saveStudent(){
        println("Student is saved in the database!")
    }
}