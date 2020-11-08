package com.example.testexamen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testexamen.base.BaseViewHolder
import com.example.testexamen.models.Libros
import kotlinx.android.synthetic.main.libros_rom.view.*
import java.lang.IllegalArgumentException
import java.security.AccessControlContext

class  RecyclerAdapter(
    val  context: Context,
    val listaLibros: List<Libros>
): RecyclerView.Adapter<BaseViewHolder<*>>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return LibrosViewHolder(LayoutInflater.from(context).inflate(R.layout.libros_rom, parent, false))
    }

    override fun getItemCount(): Int = listaLibros.size

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is LibrosViewHolder -> holder.bind(listaLibros[position],position)
            else -> throw IllegalArgumentException("Olvide pasar el viewHolder al bind")
        }
    }

    inner class LibrosViewHolder(itemView: View): BaseViewHolder<Libros>(itemView){
        override fun bind(item: Libros, position: Int) {
            Glide.with(context).load(item.image).into(itemView.img_libro)
            itemView.txt_libro.text = item.title
        }
    }
}