package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITALGOODSIMAGE","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat While","$19","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$20","hoodie01"),
        Product("Devslopes Hoodie Red","$24","hoodie02"),
        Product("Devslopes Hoodie Black","$23","hoodie03"),
        Product("Devslopes Hoodie Kind Of Black","$200","hoodie04")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black", "$34","shirt01"),
        Product("Devslopes Badge Light Gray", "$99","shirt02"),
        Product("Devslopes Logo Shirt Red", "$990","shirt03"),
        Product("Devslopes Hustle", "$19","shirt04"),
        Product("Kicklips Studio", "$9999","shirt05")
    )
}