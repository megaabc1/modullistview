package com.example.latihanlistview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val list:ArrayList<MyData>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindItems(data : MyData){
            val _textView:TextView = itemView.findViewById(R.id.textview)
            val _textView2:TextView = itemView.findViewById(R.id.textview2)
            val _imageView:ImageView = itemView.findViewById(R.id.imageview)
            _textView.text = data.text
            _textView2.text = data.text2
            _imageView.setImageBitmap(data.image)

            //set the onclick listener for the singlt list item
            itemView.setOnClickListener({
                Log.e("ItemClicked", data.text)
            })
        }
    }
}
