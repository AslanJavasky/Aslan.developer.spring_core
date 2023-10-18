package com.aslanjavasky.mod1_spring_core.lesson2_what_is_applicationContext_for_DI

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
class ApplicationContext {

    companion object {

        private fun BeanTicket() = Ticket()
        private fun BeanBook() = Book()
        private fun BeanOwl() = Owl()
        private fun BeanMagicWand() = MagicWand()
        private fun BeanFrashmanSet()=FreshmanSet(
            BeanBook(),BeanOwl(),BeanMagicWand()
        )
        private fun BeanTripToHogwarts()=TripToHogwarts(
            BeanFrashmanSet(),BeanTicket()
        )
        fun BeanSomeService(name:String)=SomeService(
            BeanTripToHogwarts(),name
        )




    }

}