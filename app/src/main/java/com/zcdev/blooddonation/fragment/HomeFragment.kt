package com.zcdev.blooddonation.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.zcdev.blooddonation.R
import com.zcdev.blooddonation.modele.User
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import lib.kingja.switchbutton.SwitchMultiButton
import ru.bullyboo.view.CircleSeekBar
import kotlin.math.absoluteValue

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view= inflater.inflate(R.layout.fragment_home, container, false)
        var mSwitchMultiButton = view.findViewById<SwitchMultiButton>(R.id.radiogroup1)
        var value:String="+A"
        var btnFind=view.findViewById<Button>(R.id.btnFind)

        mSwitchMultiButton.setOnSwitchListener (object :SwitchMultiButton.OnSwitchListener{
            override fun onSwitch(position: Int, tabText: String?) {
                if (tabText != null) {
                    value=tabText
                }
                   Toast.makeText(view.context, tabText, Toast.LENGTH_SHORT).show()
            }

        } )
        btnFind.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                var intent= Intent(view.context,ListeDonnerActivity::class.java)
                intent.putExtra("type",value)
                intent.putExtra("distance",seekBar.value.toString())
                startActivity(intent)

            }

        })

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }







}