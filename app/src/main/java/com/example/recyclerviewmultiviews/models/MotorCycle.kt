package com.example.recyclerviewmultiviews.models

import android.graphics.drawable.Drawable

data class MotorCycle(
    var cycleid: Int,
    var cycletype: String,
    var cycleimage: Drawable?,
    var cyclereleaseDate: String,
    var cyclemaxSpeed: Int,
    var cyclemodelName: String,
    var cycleweight: Int,
    var literCapacity: Int,
) : Vehicle(
    cycleid,
    cycleimage,
    cyclereleaseDate,
    cycletype,
    cyclemaxSpeed,
    cyclemodelName,
    cycleweight,
)
