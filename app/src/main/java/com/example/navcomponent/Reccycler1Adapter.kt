package com.example.navcomponent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.navcomponent.databinding.ItemBinding

class Reccycler1Adapter(var context:Context, var list:ArrayList<Model>): RecyclerView.Adapter<myViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        return myViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var model = list[position]
        holder.binding.itemTv.text = model.name

        var status = model.isExpandable

        if(status){
            holder.binding.expandableLayout.visibility = View.VISIBLE
        }else{
            holder.binding.expandableLayout.visibility = View.GONE
        }

        holder.binding.childRv.adapter = Recycler2Adapter()


        holder.itemView.setOnClickListener{
            model.isExpandable = !model.isExpandable
            notifyItemChanged(position)
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class myViewHolder(itemView: View) : ViewHolder(itemView) {
    val binding = ItemBinding.bind(itemView)

}
