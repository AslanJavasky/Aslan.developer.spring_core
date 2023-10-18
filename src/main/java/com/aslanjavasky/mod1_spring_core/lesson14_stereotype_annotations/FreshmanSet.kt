package com.aslanjavasky.mod1_spring_core.lesson14_stereotype_annotations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

//constructor injection
@Component
data class FreshmanSet(
    @Autowired @Qualifier("P") val book: Book,
    @Autowired @Qualifier("Sychik") val owl: Owl,
    @Autowired @Qualifier("Harry") val magicWand: MagicWand
)

//setter injection
//@Component
//class FreshmanSet{
//    lateinit var book: Book
//    lateinit var  owl: Owl
//    lateinit var  magicWand: MagicWand
//
//    @Autowired
//    fun setBook(book: Book){
//        this.book=book
//    }
//
//    @Autowired
//    fun setOwl(owl: Owl){
//        this.owl=owl
//    }
//
//    @Autowired
//    fun setMagicWand(magicWand: MagicWand){
//        this.magicWand=magicWand
//    }
//
//}

//field injection
//@Component
//class FreshmanSet{
//    @Autowired
//    lateinit var book: Book
//    @Autowired
//    lateinit var  owl: Owl
//    @Autowired
//    lateinit var  magicWand: MagicWand
//}
