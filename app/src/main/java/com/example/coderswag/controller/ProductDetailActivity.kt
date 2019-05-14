package com.example.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import com.example.coderswag.model.Product
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        product = intent.getParcelableExtra(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image,"drawable",packageName)
        productImage.setImageResource(resourceId)
        productTitle.text = product.title
        productPrice2.text = product.price
    }
}
