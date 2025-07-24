package com.example.gridview

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var gridView: GridView? = null

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.grid_view)
        val list = ArrayList<Model?>()

        list.add(Model("DSA", R.drawable.gfg_logo))
        list.add(Model("JAVA", R.drawable.gfg_logo))
        list.add(Model("C++", R.drawable.gfg_logo))
        list.add(Model("Python", R.drawable.gfg_logo))
        list.add(Model("Javascript", R.drawable.gfg_logo))
        list.add(Model("DSA", R.drawable.gfg_logo))

        val adapter = GridViewAdapter(this, list)
        gridView!!.adapter = adapter
    }
}