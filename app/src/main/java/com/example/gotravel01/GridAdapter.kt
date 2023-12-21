package com.example.gotravel01

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

internal class GridAdapter(

    //initialize interestList and context
    private val interestList: List<gridViewItem>,
    private val context: Context
) :
    BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var interestsText: TextView
    private lateinit var interestsImage: ImageView

    //initialize default methods
    override fun getCount(): Int {
        return interestList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    // in below function we are getting individual item of grid view.
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        // layoutInflater instantiates a new View
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        //convertView reuses a given view.
        //hence, this checks if convertView is null or not.
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.grid_item, null)
        }

        interestsImage = convertView!!.findViewById(R.id.img_interest)
        interestsText = convertView!!.findViewById(R.id.text_interest)
        //set image from drawable as interestsImage
        interestsImage.setImageResource(interestList.get(position).img)
        // set text
        interestsText.setText(interestList.get(position).title)
        return convertView
    }
}
