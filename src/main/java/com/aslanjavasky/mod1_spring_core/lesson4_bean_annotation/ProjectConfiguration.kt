package com.aslanjavasky.mod1_spring_core.lesson4_bean_annotation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */


@Configuration
open class ProjectConfiguration {

    @Bean
    open fun HistoryOfMagic() =
        Book(
            "History of Magic",
            "Bathilda Bagshot"
        )

    @Bean
    open fun Potions() =
        Book(
            "Advanced Potions Course",
            "Libatius Borag"
        )


    @Bean
    open fun HedwigOwl()=Owl(name="Hedwig")


}