package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat While","$19","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$20","hoodie1"),
        Product("Devslopes Hoodie Red","$24","hoodie2"),
        Product("Devslopes Hoodie Black","$23","hoodie3"),
        Product("Devslopes Hoodie Kind Of Black","$200","hoodie4")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black", "$34","shirt1"),
        Product("Devslopes Badge Light Gray", "$99","shirt2"),
        Product("Devslopes Logo Shirt Red", "$990","shirt3"),
        Product("Devslopes Hustle", "$19","shirt4"),
        Product("Kicklips Studio", "$9999","shirt5")
    )
    val digitalGood = listOf<Product>()

    fun getCategory(category: String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}