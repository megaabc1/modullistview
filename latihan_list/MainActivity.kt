package com.example.latihanlistview

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        _recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val items = ArrayList<MyData>()

        //adding some dummy data to the list
        items.add(MyData("Ruby","Ruby is an open source and fully object oriented programming language", BitmapFactory.decodeResource(resources, R.drawable.ruby)))
        items.add(MyData("Rails", "Ruby on Rails is a server side web application development framework written in Ruby language",BitmapFactory.decodeResource(resources, R.drawable.rails)))
        items.add(MyData("Python", "Python is interpreted scripting and object oriented programming language",BitmapFactory.decodeResource(resources, R.drawable.python)))
        items.add(MyData("Javascript","Javascript is an object based scripting language", BitmapFactory.decodeResource(resources, R.drawable.javascript2)))
        items.add(MyData("PHP","PHP is an interpreted language i.e. there's no need for compilation", BitmapFactory.decodeResource(resources, R.drawable.php)))
        //creating our adapter
        val adapter = RecyclerViewAdapter(items)

        //now adding the adapter to recyclerview
        _recyclerView.adapter = adapter
    }
}