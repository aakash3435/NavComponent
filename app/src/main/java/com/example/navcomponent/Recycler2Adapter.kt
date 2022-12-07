package com.example.navcomponent

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navcomponent.databinding.ItemBinding




class Recycler2Adapter(): RecyclerView.Adapter<Recycler2Adapter.myViewHolder>() {
    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        return myViewHolder(LayoutInflater.from(parent.context).inflate(com.example.navcomponent.R.layout.item_second,parent,false))
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 5
    }
}

