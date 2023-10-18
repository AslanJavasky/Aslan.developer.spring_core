package com.aslanjavasky.mod1_spring_core.lesson11_di

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
@author Aslan Javasky, Java/Kotlin developer, Telegram messanger:@Aslan_Javasky
 */


@Configuration
open class ProjectConfiguration {

    @Bean(name = ["MH"])
    @Primary
    open fun HistoryOfMagic() =
        Book(
            "History of Magic",
            "Bathilda Bagshot"
        )

    @Bean(name = ["P"])
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

    @Bean("Harry")
    @Primary
    open fun WandOfHarry() = MagicWand(
        core = "phoenix feather"
    )

    @Bean("Ron")
    open fun WandOfRonald() = MagicWand(
        core = "unicorn hair"
    )

    @Bean
    open fun FreshmanSet()= FreshmanSet(
        Potions(), HedwigOwl(), WandOfHarry()
    )

    @Bean
    open fun Ticket() = Ticket("Hogwarts")

    @Bean
    open fun TripToHogwartsBean(
        freshmanSet: FreshmanSet, ticket: Ticket
    ) = TripToHogwarts(
        freshmanSet, ticket
    )

}