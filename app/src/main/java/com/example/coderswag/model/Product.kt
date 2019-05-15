package com.example.coderswag.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Product(val title: String, val price: String, val image: String, val detail: String) : Parcelable