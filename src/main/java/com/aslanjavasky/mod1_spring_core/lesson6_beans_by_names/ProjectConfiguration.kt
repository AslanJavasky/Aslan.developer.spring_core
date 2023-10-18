package com.aslanjavasky.mod1_spring_core.lesson6_beans_by_names

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */


@Configuration
open class ProjectConfiguration {

    @Bean
    @Primary
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

    @Bean
    @Primary
    open fun SychikOwl()=Owl(name="Sychik")

    @Bean
    open fun ArrowOwl()=Owl(name="Arrow")


}