package me.proton.jobforandroid.movie20.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*
import me.proton.jobforandroid.movie20.R
import me.proton.jobforandroid.movie20.models.MovieItemModel


class MainAdapter : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    private var listMovies = emptyList<MovieItemModel>()

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.itm_title.text = listMovies[position].title
        holder.itemView.itm_date.text = listMovies[position].release_date

    }

    override fun getItemCount(): Int {
        return listMovies.size
    }


}