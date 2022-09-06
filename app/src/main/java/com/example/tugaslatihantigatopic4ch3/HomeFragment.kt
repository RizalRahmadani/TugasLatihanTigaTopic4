package com.example.tugaslatihantigatopic4ch3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_hasil_hitung_umur.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //mengambil data username
        var getUser = arguments?.getString("dataUser")
        textNamaHome.text = "Hello, $getUser"

        //mengirim data



        btnHitung.setOnClickListener {
            var tahunLahir = etInputTahunLahir.text.toString().toInt()
            var HitungUmur = 2022 - tahunLahir
            textNamaHome.text = getUser
            var name = textNamaHome.text.toString()
            var bund = Bundle()
            bund.putString("dataTahunLahir", HitungUmur.toString())
            bund.putString("UserHome", name)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_hasilHitungUmurFragment, bund)
        }

        btnIconUser.setOnClickListener{
            textNamaHome.text = getUser
            var name = textNamaHome.text.toString()
            var bund = Bundle()
            bund.putString("UserHome", name)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profileFragment,bund)
        }




    }
}