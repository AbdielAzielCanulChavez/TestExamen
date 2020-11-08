package com.example.testexamen.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testexamen.R
import com.example.testexamen.RecyclerAdapter
import com.example.testexamen.models.Libros
import kotlinx.android.synthetic.main.fragment_store.*


/**
 * A simple [Fragment] subclass.
 * Use the [StoreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StoreFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setupRecyclerView()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_store, container, false)
        val view = inflater.inflate(R.layout.fragment_store, container, false)
        return view

        //setupRecyclerView()

    }

//    private fun setupRecyclerView() {
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        val listLibros: List<Libros> = listOf(
//            Libros(title = "Primer libro", image = ""),
//            Libros(title = "Segundo libro", image = ""),
//            Libros(title = "Tercer libro", image = ""),
//            Libros(title = "Cuarto libro", image = ""),
//            Libros(title = "Quinto libro", image = "")
//        )
//
//        recyclerView.adapter = RecyclerAdapter(context = this, listaLibros = listLibros)
//    }


}