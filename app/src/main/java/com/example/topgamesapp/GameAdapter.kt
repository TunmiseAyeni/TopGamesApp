package com.example.topgamesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(private val gamesList:ArrayList<GameModel>):RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    inner class ViewHolder(gameView: View):RecyclerView.ViewHolder(gameView){
        var gameImage : ImageView
        var gameText: TextView

        //initializing the widgets
        init {
            gameImage = gameView.findViewById(R.id.cardViewImg)
            gameText = gameView.findViewById(R.id.cardViewText)


            gameView.setOnClickListener(){
                //When clicked, it shows the adapter position in the itemList and returns the name
                Toast.makeText(gameView.context, "This is ${gamesList[adapterPosition].cardText}", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_items, parent, false)
        return ViewHolder(view)



    }

    override fun getItemCount(): Int {
      return  gamesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Binding the arrays and layouts together
        var game = gamesList[position]
        holder.gameImage.setImageResource(game.cardImage)
        holder.gameText.text = game.cardText
    }
}