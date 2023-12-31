package br.edu.utfpr.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.utfpr.affirmations.R
import br.edu.utfpr.affirmations.model.Affirmation

class ItemAdapter (val context : Context, val dataset : List<Affirmation> ) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder( private val view : View ) : RecyclerView.ViewHolder( view ) {
        val textView : TextView = view.findViewById( R.id.item_title )
        val imageView : ImageView = view.findViewById( R.id.item_image )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from( parent.context ).inflate( R.layout.list_element, parent, false )
        return ItemViewHolder( adapterLayout )
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString( item.stringResourceId )
        holder.imageView.setImageResource( item.imageResourceId )
    }


}