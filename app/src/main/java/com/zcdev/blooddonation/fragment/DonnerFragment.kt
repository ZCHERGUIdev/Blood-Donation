package com.zcdev.blooddonation.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.firestore.FirebaseFirestore
import com.zcdev.blooddonation.R

class DonnerFragment : Fragment() {

    var alertDialog:AlertDialog?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view=inflater.inflate(R.layout.fragment_donner, container, false)
        var v=layoutInflater.inflate(R.layout.registerpage,null)
       alertDialog!!.setView(v)
        return view
    }

}