package com.aslanjavasky.mod1_spring_core.lesson11_di

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
data class MagicWand (
    var core:String=""
){
    @PostConstruct
    fun setCoreAfterInit(){
        this.core="Dragon heart"
    }

}
