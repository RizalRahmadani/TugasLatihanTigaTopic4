package com.example.tugaslatihantigatopic4ch3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_hasil_hitung_umur.*


class HasilHitungUmurFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil_hitung_umur, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getUser = arguments?.getString("UserHome")
        var getUmur = arguments?.getString("dataTahunLahir")

        txtNameHasil.text = "Halo, $getUser"
        txtUmurKamu.text = "Umur kamu\n$getUmur tahun"

    }

}