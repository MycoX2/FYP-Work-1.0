package com.example.gotravel01

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import kotlin.collections.ArrayList
class InterestsScreen : ComponentActivity() {

    lateinit var interestsGrid: GridView
    lateinit var interestsList: List<gridViewItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.choose_interests)
        setContentView(R.layout.example_itinerary)
        /*
        // define interestsGrid and interestsList
        interestsGrid = findViewById(R.id.interests_grid)
        interestsList = ArrayList<gridViewItem>()

        //populate interestsList ArrayList
        interestsList = interestsList + gridViewItem("History", R.drawable.coliseum)
        interestsList = interestsList + gridViewItem("Tourist hotspots", R.drawable.eiffel_tower_color)
        interestsList = interestsList + gridViewItem("Nature", R.drawable.nature)
        interestsList = interestsList + gridViewItem("Pop culture", R.drawable.stage)
        // on below line we are initializing our course adapter
        // and passing course list and context.
        val gridAdapter = GridAdapter(interestList = interestsList, this@InterestsScreen)

        interestsGrid.adapter = gridAdapter

        interestsGrid.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                applicationContext, interestsList[position].title + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }*/
    }
}