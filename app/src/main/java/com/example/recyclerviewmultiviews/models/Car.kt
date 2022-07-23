package com.example.recyclerviewmultiviews.models

import android.graphics.drawable.Drawable

data class Car(
    var carid: Int,
    var carimage: Drawable?,
    var carreleaseDate: String,
    var cartype: String,
    var carmaxSpeed: Int,
    var carmodelName: String,
    var carweight: Int
) : Vehicle(
    carid,
    carimage,
    carreleaseDate,
    cartype,
    carmaxSpeed,
    carmodelName,
    carweight,
)