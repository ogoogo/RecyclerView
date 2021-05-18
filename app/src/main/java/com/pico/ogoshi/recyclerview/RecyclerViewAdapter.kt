package com.pico.ogoshi.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context:Context):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    val items:MutableList<CourseData> = mutableListOf()
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val charaImage:ImageView=view.findViewById(R.id.characterImageView)
        val charaNameTextView:TextView = view.findViewById(R.id.courseNameTextView)
        val detailTextView:TextView = view.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_cource_data_cell,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.charaImage.setImageResource(item.characterImageResorce)
        holder.charaNameTextView.text = item.courseName
        holder.detailTextView.text = item.description
    }
    fun addAll(items:List<CourseData>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}