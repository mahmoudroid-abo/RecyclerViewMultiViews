package com.example.recyclerviewmultiviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewmultiviews.adapter.MainAdapter
import com.example.recyclerviewmultiviews.databinding.ActivityMainBinding
import com.example.recyclerviewmultiviews.models.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private val mainAdapter: MainAdapter by lazy {
        MainAdapter()
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainAdapter.setData(getMockData())
        initRecyclerView()
    }


    private fun initRecyclerView() {
        binding.vehiclesRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val decoration = DividerItemDecoration(
                applicationContext,
                DividerItemDecoration.VERTICAL
            )
            addItemDecoration(decoration)
            adapter = mainAdapter
            Log.d(TAG, mainAdapter.itemCount.toString())
        }
    }

    private fun getMockData(): List<Vehicle> = listOf(
        Car(
            carmodelName = "BMW",
            cartype = "Car",
            carid = 1,
            carmaxSpeed = 90,
            carimage = ContextCompat.getDrawable(this, R.drawable.car1),
            carweight = 1000,
            carreleaseDate = "12-12-2012"
        ),
        Car(
            carmodelName = "BMW",
            cartype = "Car",
            carid = 2,
            carmaxSpeed = 90,
            carimage = ContextCompat.getDrawable(this, R.drawable.car1),
            carweight = 1000,
            carreleaseDate = "12-12-2012"
        ),
        Car(
            carmodelName = "BMW",
            cartype = "Car",
            carid = 3,
            carmaxSpeed = 90,
            carimage = ContextCompat.getDrawable(this, R.drawable.car1),
            carweight = 1000,
            carreleaseDate = "12-12-2012"
        ),
        Car(
            carmodelName = "BMW",
            cartype = "Car",
            carid = 4,
            carmaxSpeed = 90,
            carimage = ContextCompat.getDrawable(this, R.drawable.car1),
            carweight = 1000,
            carreleaseDate = "12-12-2012"
        ),
        Car(
            carmodelName = "BMW",
            cartype = "Car",
            carid = 5,
            carmaxSpeed = 90,
            carimage = ContextCompat.getDrawable(this, R.drawable.car1),
            carweight = 1000,
            carreleaseDate = "12-12-2012"
        ),
        Bike(
            bikeType = "Bike",
            bikeModel = "Trinx",
            bikeId = 6,
            bikeMaxSpeed = 60,
            img = ContextCompat.getDrawable(this, R.drawable.bike),
            bikeWeight = 10,
            bikeReleaseDate = "12-12-2012"
        ),
        Bike(
            bikeType = "Bike",
            bikeModel = "Trinx",
            bikeId = 7,
            bikeMaxSpeed = 60,
            img = ContextCompat.getDrawable(this, R.drawable.bike),
            bikeWeight = 10,
            bikeReleaseDate = "12-12-2012"
        ),
        Bike(
            bikeType = "Bike",
            bikeModel = "Trinx",
            bikeId = 8,
            bikeMaxSpeed = 60,
            img = ContextCompat.getDrawable(this, R.drawable.bike),
            bikeWeight = 10,
            bikeReleaseDate = "12-12-2012"
        ),
        Bike(
            bikeType = "Bike",
            bikeModel = "Trinx",
            bikeId = 9,
            bikeMaxSpeed = 60,
            img = ContextCompat.getDrawable(this, R.drawable.bike),
            bikeWeight = 10,
            bikeReleaseDate = "12-12-2012"
        ),
        Bike(
            bikeType = "Bike",
            bikeModel = "Trinx",
            bikeId = 10,
            bikeMaxSpeed = 60,
            img = ContextCompat.getDrawable(this, R.drawable.bike),
            bikeWeight = 10,
            bikeReleaseDate = "12-12-2012"
        ),
        MotorCycle(
            cycletype = "Motor Cycle",
            cyclemodelName = "Harley",
            cycleid = 11,
            cyclemaxSpeed = 180,
            cycleimage = ContextCompat.getDrawable(this, R.drawable.motor),
            cycleweight = 200,
            cyclereleaseDate = "12-12-2012",
            literCapacity = 80
        ),
        MotorCycle(
            cycletype = "Motor Cycle",
            cyclemodelName = "Harley",
            cycleid = 12,
            cyclemaxSpeed = 180,
            cycleimage = ContextCompat.getDrawable(this, R.drawable.motor),
            cycleweight = 200,
            cyclereleaseDate = "12-12-2012",
            literCapacity = 80
        ),
        MotorCycle(
            cycletype = "Motor Cycle",
            cyclemodelName = "Harley",
            cycleid = 13,
            cyclemaxSpeed = 180,
            cycleimage = ContextCompat.getDrawable(this, R.drawable.motor),
            cycleweight = 200,
            cyclereleaseDate = "12-12-2012",
            literCapacity = 80
        ),
        MotorCycle(
            cycletype = "Motor Cycle",
            cyclemodelName = "Harley",
            cycleid = 14,
            cyclemaxSpeed = 180,
            cycleimage = ContextCompat.getDrawable(this, R.drawable.motor),
            cycleweight = 200,
            cyclereleaseDate = "12-12-2012",
            literCapacity = 80
        ),
        MotorCycle(
            cycletype = "Motor Cycle",
            cyclemodelName = "Harley",
            cycleid = 15,
            cyclemaxSpeed = 180,
            cycleimage = ContextCompat.getDrawable(this, R.drawable.motor),
            cycleweight = 200,
            cyclereleaseDate = "12-12-2012",
            literCapacity = 80
        ),
        Truck(
            trucktype = "Truck",
            truckmodelName = "Harley",
            truckid = 16,
            truckmaxSpeed = 180,
            truckimage  = ContextCompat.getDrawable(this, R.drawable.motor),
            truckweight = 200,
            truckreleaseDate = "12-12-2012",
        ),
        Truck(
            trucktype = "Truck",
            truckmodelName = "Harley",
            truckid = 17,
            truckmaxSpeed = 180,
            truckimage  = ContextCompat.getDrawable(this, R.drawable.motor),
            truckweight = 200,
            truckreleaseDate = "12-12-2012",
        ),
        Truck(
            trucktype = "Truck",
            truckmodelName = "Harley",
            truckid = 18,
            truckmaxSpeed = 180,
            truckimage  = ContextCompat.getDrawable(this, R.drawable.motor),
            truckweight = 200,
            truckreleaseDate = "12-12-2012",
        ),
        Truck(
            trucktype = "Truck",
            truckmodelName = "Harley",
            truckid = 19,
            truckmaxSpeed = 180,
            truckimage  = ContextCompat.getDrawable(this, R.drawable.motor),
            truckweight = 200,
            truckreleaseDate = "12-12-2012",
        ),
        Truck(
            trucktype = "Truck",
            truckmodelName = "Harley",
            truckid = 20,
            truckmaxSpeed = 180,
            truckimage  = ContextCompat.getDrawable(this, R.drawable.motor),
            truckweight = 200,
            truckreleaseDate = "12-12-2012",
        ),
    )
}
