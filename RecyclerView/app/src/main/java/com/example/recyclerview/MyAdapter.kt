package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs: List<Song>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate your item layout and create a ViewHolder instance
        val inflater = LayoutInflater.from(parent.context) // take xml and convert into java object
        val view = inflater.inflate(R.layout.item_view, parent, false)  // hold the view
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Bind data to the ViewHolder
        holder.listTitle.text = songs[position].title // set the title
        holder.listDescription.text = songs[position].description // set the description
        var color  = "#cccccc" // default color
        when (position % 5) {
            0 -> color = "#FF5733" // Red
            1 -> color = "#33FF57" // Green
            2 -> color = "#3357FF" // Blue
            3 -> color = "#F1C40F" // Yellow
            4 -> color = "#9B59B6" // Purple
        }
        holder.container.setBackgroundColor(Color.parseColor(color))

    }

    override fun getItemCount(): Int {
        // Return the total number of items
       return  songs.size
    }


    //Nested class because viewholder will not work without adapter
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //we have stored the refrences
        var listTitle = itemView.findViewById<TextView>(R.id.textTitle)
        var listDescription = itemView.findViewById<TextView>(R.id.textDescription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }

}


