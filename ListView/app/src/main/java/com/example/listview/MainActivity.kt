package com.example.listview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var listView: ListView? = null
    //var textView: TextView? = null
    var festivals: Array<String> = arrayOf(
        "Diwali",
        "Holi",
        "Christmas",
        "Eid",
        "Baisakhi",
        "Halloween"
    )

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView) as ListView?
//        textView = findViewById(R.id.textView) as TextView?

        val adapter: ArrayAdapter<*> = ArrayAdapter<Any?>(
            this,
            R.layout.list_item, festivals
        )

        listView!!.adapter = adapter

        listView!!.onItemClickListener =
            OnItemClickListener { adapterView, view, position, l ->

                val value = "Happy " + adapter.getItem(position)

                /* Display the Toast */
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show()
            }
    }
}