package com.example.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Product

class ProductsAdapter(val context: Context, val products: List<Product>, val itemClick: (Product) -> Unit) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, view: Int): ProductHolder {
        val views = LayoutInflater.from(context).inflate(R.layout.product_list_items,parent,false)
        return ProductHolder(views, itemClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val productName = itemView.findViewById<TextView>(R.id.productName)
        private val productPrice = itemView.findViewById<TextView>(R.id.productPrice2)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }
    }
}