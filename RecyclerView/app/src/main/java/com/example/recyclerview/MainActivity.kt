package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songsObjects: MutableList<Song> = mutableListOf() // List of songs
        songsObjects.add(Song("Rock", "John Doe"))
        songsObjects.add(Song("Pop", "Jane Smith"))
        songsObjects.add(Song("Jazz", "Ella Fitzgerald"))
        songsObjects.add(Song("Classical", "Ludwig van Beethoven"))
        songsObjects.add(Song("Hip Hop", "Kendrick Lamar"))
        songsObjects.add(Song("Country", "Johnny Cash"))
        songsObjects.add(Song("Reggae", "Bob Marley"))

        val songList = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.songList) // Find the RecyclerView in the layout
        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)

    }
}

