package com.example.recyclerviewmultiviews.models

import android.graphics.drawable.Drawable

data class Bike(
    var bikeId: Int,
    var bikeType: String,
    var img: Drawable?,
    var bikeReleaseDate: String,
    var bikeMaxSpeed: Int,
    var bikeModel: String,
    var bikeWeight: Int
) : Vehicle(
    bikeId,
    img,
    bikeReleaseDate,
    bikeType,
    bikeMaxSpeed,
    bikeModel,
    bikeWeight,
)