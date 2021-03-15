package com.zcdev.blooddonation.Adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zcdev.blooddonation.R
import com.zcdev.blooddonation.SplachActivity
import com.zcdev.blooddonation.modele.User

class BloodDonnerAdapter(var donnerListe:ArrayList<User>):RecyclerView.Adapter<BloodDonnerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int):ViewHolder {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.viewcell, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return donnerListe.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      // var lst=donnerListe.get(position)
    //    holder.user=lst
           holder.name.text=donnerListe[position].fullName
        //holder.username.text=donnerListe[position].username
        holder.bloodtype.text=donnerListe[position].blood
        holder.distance.text=donnerListe[position].dis
        //Picasso.with(holder.itemView.context).load(image[position].url).into(holder.image)

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var user:User?=null
        var name=itemView.findViewById<TextView>(R.id.fullName)
        var username=itemView.findViewById<TextView>(R.id.txtusername)
        var distance=itemView.findViewById<TextView>(R.id.distance)
        var bloodtype=itemView.findViewById<TextView>(R.id.blood)
        var image:ImageView=itemView.findViewById(R.id.imgProfil) as ImageView

        init {
            itemView.setOnClickListener(object:View.OnClickListener{
                override fun onClick(v: View?) {
                    itemView!!.context.startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:0792930900")))

                }

            })
        }

    }


}



