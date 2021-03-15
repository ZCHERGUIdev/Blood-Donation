package com.zcdev.blooddonation.fragment

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.zcdev.blooddonation.Adapters.BloodDonnerAdapter
import com.zcdev.blooddonation.R
import com.zcdev.blooddonation.modele.User
import kotlinx.android.synthetic.main.activity_liste_donner.*


class ListeDonnerActivity : AppCompatActivity() {
    var progressDialog:ProgressDialog?=null
  //  var reqCode=3000
    companion object{
        var newInstance=ListeDonnerActivity()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liste_donner)
        bloodDonnerListe.layoutManager=LinearLayoutManager(this)


        var int=intent
        var a:String?=null
        var b:String?=null
       if ( int.extras!=null)
       {
         Toast.makeText(this.baseContext,int.getStringExtra("type") ,Toast.LENGTH_LONG).show()
           a=int.getStringExtra("type")
           b=int.getStringExtra("distance")
           if (a != null && b!=null) {
               addData(a,b)
           }
       }

    }

    private fun addData(a:String, b:String) {

        val donnerList = ArrayList<User>()
        var p1=User("1","Zak Chergui","zcde2020",a,b)
        var p2=User("1","Zakaria Chergui","zcde2020",a,b)
        var p3=User("1","Zakaria Chergui","zcde2020",a,b)
        var p4=User("1","Zakaria Chergui","zcde2020",a,b)
        var p5=User("1","Zakaria Chergui","zcde2020",a,b)
        var p6=User("1","Zakaria Chergui","zcde2020",a,b)
        var p7=User("1","Zakaria Chergui","zcde2020",a,b)
        var p8=User("1","Zakaria Chergui","zcde2020",a,b)
        var p9=User("1","Zakaria Chergui","zcde2020",a,b)
        var p10=User("1","Zakaria Chergui","zcde2020",a,b)
        var p11=User("1","Zakaria Chergui","zcde2020",a,b)
        var p12=User("1","Zakaria Chergui","zcde2020",a,b)
        var p13=User("1","Zakaria Chergui","zcde2020",a,b)
        var p14=User("1","Zakaria Chergui","zcde2020",a,b)
        var p15=User("1","Zakaria Chergui","zcde2020",a,b)
        donnerList.add(p1)
        donnerList.add(p2)
        donnerList.add(p3)
        donnerList.add(p4)
        donnerList.add(p5)
        donnerList.add(p6)
        donnerList.add(p7)
        donnerList.add(p8)
        donnerList.add(p9)
        donnerList.add(p10)
        donnerList.add(p11)
        donnerList.add(p12)
        donnerList.add(p13)
        donnerList.add(p14)
        donnerList.add(p15)


        textblood.text= StringBuffer("ALL Donner ("+donnerList.size.toString()+")")
        bloodDonnerListe.adapter = BloodDonnerAdapter(donnerList)
        bloodDonnerListe.adapter!!.notifyDataSetChanged()
    }


    /* fun getData(){
         Log.i("DATA","fzegrhrr")
         progressDialog!!.show()
         var query = ParseQuery.getQuery<ParseObject>(User::class.java.simpleName)
         query.findInBackground({objs,e->
             if (e==null ){
                 var item= mutableListOf<User>()
                 var img: ParseFile?=null
                 var img2=mutableListOf<ParseFile>()
                 for (i in 0..objs.size-1)
                 {
                     img=objs[i].getParseFile("photos")

                     img2!!.add(img)
                     item.add(toSingleRecords(objs[i]))
                     Log.e("DATA",objs.size.toString())
                 }
                 bloodDonnerListe.adapter = BloodDonnerAdapter(item,img2)
                 bloodDonnerListe.adapter!!.notifyDataSetChanged()
                  progressDialog!!.hide()

             }else{
                 Log.e("DATA",e.message!!)
             }
         })
     }*/





  fun call(){
     var intent =Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
      startActivity(intent)
  }







}