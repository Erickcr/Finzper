package com.example.finzper

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_inicio.*

class InicioFragment : Fragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_inicio, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btn_gastos.setOnClickListener {
            requireContext().let{
                it.startActivity(Intent(it, NewGastosActivity::class.java))
            }
        }

    }



    companion object {
        fun newInstance(): InicioFragment = InicioFragment()


    }
}