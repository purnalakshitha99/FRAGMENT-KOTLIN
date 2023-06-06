package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class UserFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnDisplay = view.findViewById<Button>(R.id.btnDisplay)
        val edtName = view.findViewById<EditText>(R.id.edtName)
        btnDisplay.setOnClickListener {
            Toast.makeText(context,"Hello, ${edtName.text.toString()}",Toast.LENGTH_LONG).show()
        }

        return inflater.inflate(R.layout.fragment_user, container, false)
    }



}