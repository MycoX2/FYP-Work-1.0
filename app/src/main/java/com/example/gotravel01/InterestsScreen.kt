package com.example.gotravel01

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList
class InterestsScreen : ComponentActivity() {

    lateinit var courseGRV: GridView
    lateinit var courseList: List<gridViewItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_interests)

        // initializing variables of grid view with their ids.
        courseGRV = findViewById(R.id.interests_grid)
        courseList = ArrayList<gridViewItem>()

        // on below line we are adding data to
        // our course list with image and course name.
        courseList = courseList + gridViewItem("History", R.drawable.coliseum)
        courseList = courseList + gridViewItem("Tourist hotspots", R.drawable.eiffel_tower_color)
        courseList = courseList + gridViewItem("Nature", R.drawable.nature)
        courseList = courseList + gridViewItem("Pop culture", R.drawable.stage)
        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = GridAdapter(courseList = courseList, this@InterestsScreen)

        // on below line we are setting adapter to our grid view.
        courseGRV.adapter = courseAdapter

        // on below line we are adding on item
        // click listener for our grid view.
        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // inside on click method we are simply displaying
            // a toast message with course name.
            Toast.makeText(
                applicationContext, courseList[position].title + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}