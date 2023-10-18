package com.aslanjavasky.mod1_spring_core.lesson2_what_is_applicationContext_for_DI;

/**
 * @author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */
public class MainClass {
    public static void main(String[] args) {

        var service=
                ApplicationContext.Companion.BeanSomeService("Harry Potter");
        service.doTrip();




    }
}
