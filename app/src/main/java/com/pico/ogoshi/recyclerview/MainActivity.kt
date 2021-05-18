package com.pico.ogoshi.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData:List<CourseData> = listOf(
        CourseData(R.drawable.bear, "くまコース","熊に襲われたら死んだふりをしよう！"),
        CourseData(R.drawable.chicken, "にわとりコース", "にわとりのとさかは何でできてるんだろう？"),
        CourseData(R.drawable.cow, "うしコース", "うしはモーとなくよ"),
        CourseData(R.drawable.fox, "きつねコース", "晴れなのに雨が降ったらきつねのよめいり！")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       

        val adapter = RecyclerViewAdapter(this)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}