package com.example.tugaslatihantigatopic4ch3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin.setOnClickListener {
            var dataUser = loginUsername.text.toString()
            var dataPass = loginPasword.text.toString()
            var bund = Bundle()
            bund.putString("dataUser", dataUser)


            if (dataUser.equals("Rizal Rahmadani") && dataPass.equals("123")) {
                Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show()
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment, bund)
            } else {
                Toast.makeText(context, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }

        textRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }

    }




}