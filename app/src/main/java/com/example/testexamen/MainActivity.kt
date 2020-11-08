package com.example.testexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testexamen.fragments.LoginFragment
import com.example.testexamen.fragments.StoreFragment
import com.example.testexamen.models.Libros
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_store.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //hilo para poder dejarlo un poco mas de tiempo el splash
        Thread.sleep(2000)

        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()

        val loginFragment = LoginFragment()
        val storeFragment = StoreFragment()

        makeCurrentFragment(storeFragment)
        //escuchador para saber a que fragments movernos
        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.store -> makeCurrentFragment(storeFragment)
                R.id.profile -> makeCurrentFragment(loginFragment)
            }
            true
        }

    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listLibros: List<Libros> = listOf(
            Libros(title = "Primer libro", image = R.mipmap.book_1),
            Libros(title = "Segundo libro", image = R.mipmap.book_2),
            Libros(title = "Tercer libro", image = R.mipmap.book_3),
            Libros(title = "Cuarto libro", image = R.mipmap.book_4),
            Libros(title = "Quinto libro", image = R.mipmap.book_5)
        )

        recyclerView.adapter = RecyclerAdapter(context = this, listaLibros = listLibros)
    }

    //metodo para la navegacion en los fragments
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}