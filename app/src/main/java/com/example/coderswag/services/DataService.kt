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
        Product("Devslopes Graphic Beanie","$18","hat1", "Very nice hat. I love it"),
        Product("Devslopes Hat Black","$20","hat2", "Very nice black hat with DevSlope logo"),
        Product("Devslopes Hat While","$19","hat3","Very beautiful white hat with DevSlope logo."),
        Product("Devslopes Hat Gray","$40","hat4","Nice hat with Devslopes logo."),
        Product("Devslopes Graphic Beanie","$18","hat1", "Very nice hat. I love it"),
        Product("Devslopes Hat Black","$20","hat2", "Very nice black hat with DevSlope logo"),
        Product("Devslopes Hat While","$19","hat3","Very beautiful white hat with DevSlope logo."),
        Product("Devslopes Hat Gray","$40","hat4","Nice hat with Devslopes logo."),
        Product("Devslopes Graphic Beanie","$18","hat1", "Very nice hat. I love it"),
        Product("Devslopes Hat Black","$20","hat2", "Very nice black hat with DevSlope logo"),
        Product("Devslopes Hat While","$19","hat3","Very beautiful white hat with DevSlope logo."),
        Product("Devslopes Hat Gray","$40","hat4","Nice hat with Devslopes logo.")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$20","hoodie1","Very nice gray hoodie make you feel so OP"),
        Product("Devslopes Hoodie Red","$24","hoodie2","Very bitch red hoodie make you like a fucking big tomato"),
        Product("Devslopes Hoodie Black","$23","hoodie3","Bitch black hoodie!!!"),
        Product("Devslopes Hoodie Kind Of Black","$200","hoodie4","Bitch kind of black that make you gay!"),
        Product("Devslopes Hoodie Gray","$20","hoodie1","Very nice gray hoodie make you feel so OP"),
        Product("Devslopes Hoodie Red","$24","hoodie2","Very bitch red hoodie make you like a fucking big tomato"),
        Product("Devslopes Hoodie Black","$23","hoodie3","Bitch black hoodie!!!"),
        Product("Devslopes Hoodie Kind Of Black","$200","hoodie4","Bitch kind of black that make you gay!")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black", "$34","shirt1","Very normal black shirt with fucking awesome Devslopes logo"),
        Product("Devslopes Badge Light Gray", "$99","shirt2","Gray shirt with huge detail logo can attack other's eyes"),
        Product("Devslopes Logo Shirt Red", "$990","shirt3","Just normal red shirt with genius Devslopes logo"),
        Product("Devslopes Hustle", "$19","shirt4","Hustle shirt with fucking awesome code"),
        Product("Kicklips Studio", "$9999","shirt5","K J Studio has support this fuking shirt"),
        Product("Devslopes Shirt Black", "$34","shirt1","Very normal black shirt with fucking awesome Devslopes logo"),
        Product("Devslopes Badge Light Gray", "$99","shirt2","Gray shirt with huge detail logo can attack other's eyes"),
        Product("Devslopes Logo Shirt Red", "$990","shirt3","Just normal red shirt with genius Devslopes logo"),
        Product("Devslopes Hustle", "$19","shirt4","Hustle shirt with fucking awesome code"),
        Product("Kicklips Studio", "$9999","shirt5","K J Studio has support this fuking shirt")
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