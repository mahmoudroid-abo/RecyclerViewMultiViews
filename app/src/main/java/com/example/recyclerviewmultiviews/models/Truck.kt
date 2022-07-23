package com.example.recyclerviewmultiviews.models

import android.graphics.drawable.Drawable

data class Truck(
    var truckid: Int,
    var truckimage: Drawable?,
    var truckreleaseDate: String,
    var trucktype: String,
    var truckmaxSpeed: Int,
    var truckmodelName: String,
    var truckweight: Int
) : Vehicle(
    truckid,
    truckimage,
    truckreleaseDate,
    trucktype,
    truckmaxSpeed,
    truckmodelName,
    truckweight,
)
