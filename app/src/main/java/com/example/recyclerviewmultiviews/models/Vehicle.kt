package com.example.recyclerviewmultiviews.models

import android.graphics.drawable.Drawable

open class Vehicle(
    var id: Int,
    var image: Drawable?,
    var releaseDate: String,
    var type: String,
    var maxSpeed: Int,
    var modelName: String,
    var weight: Int
)
