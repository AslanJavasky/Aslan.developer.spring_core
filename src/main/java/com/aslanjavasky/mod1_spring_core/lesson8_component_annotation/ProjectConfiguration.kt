package com.aslanjavasky.mod1_spring_core.lesson8_component_annotation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */


@Configuration
@ComponentScan(basePackages = arrayOf("com.aslanjavasky.mod1_spring_core.lesson8_component_annotation"))
open class ProjectConfiguration {

    @Bean(name = arrayOf("MH"))
    @Primary
    open fun HistoryOfMagic() =
        Book(
            "History of Magic",
            "Bathilda Bagshot"
        )

    @Bean(name = arrayOf("P"))
    open fun Potions() =
        Book(
            "Advanced Potions Course",
            "Libatius Borag"
        )


    @Bean(value = arrayOf("OwlOfHarry"))
    open fun HedwigOwl() = Owl(name = "Hedwig")

    @Bean(value = arrayOf("Sychik"))
    @Primary
    open fun SychikOwl() = Owl(name = "Sychik")

    @Bean("Arrow")
    open fun ArrowOwl() = Owl(name = "Arrow")

//    @Bean("Harry")
//    open fun WandOfHarry()=MagicWand(
//        core="phoenix feather"
//    )
//
//    @Bean("Ron")
//    open fun WandOfRonald()=MagicWand(
//        core="unicorn hair"
//    )


}