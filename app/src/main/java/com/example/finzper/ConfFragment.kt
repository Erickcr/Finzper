package com.example.finzper

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_conf.*


class ConfFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_conf, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_perfil.setOnClickListener {
            requireContext().let{
                it.startActivity(Intent(it, perfil::class.java))
            }
        }
        btn_categorias.setOnClickListener {
            requireContext().let{
                it.startActivity(Intent(it, categorias::class.java))
            }
        }

    }


    companion object {
        fun newInstance(): ConfFragment = ConfFragment()
    }
}