package com.example.topgamesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- Creating the recyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)




        //2 - Data Source
        var gameSource: ArrayList<GameModel> = ArrayList()

        var game1 = GameModel("Angry Birds", R.drawable.angrybirds)
        var game2 = GameModel("Subway Surfers", R.drawable.subway_surfers)
        var game3 = GameModel("Chess", R.drawable.chess)
        var game4 = GameModel("Rip Off", R.drawable.rip_off)
        var game5 = GameModel("Monopoly Go", R.drawable.monopoly_go)
        var game6 = GameModel("Temple Run", R.drawable.temple_run)
        var game7 = GameModel("Cut The Rope", R.drawable.cut_the_rope)


        gameSource.add(game1)
        gameSource.add(game2)
        gameSource.add(game3)
        gameSource.add(game4)
        gameSource.add(game5)
        gameSource.add(game6)
        gameSource.add(game7)


            //3 - Creating the Adapter
        val adapter = GameAdapter(gameSource)
        recyclerView.adapter = adapter
    }
}
