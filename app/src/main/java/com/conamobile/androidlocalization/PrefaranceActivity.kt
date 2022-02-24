package com.conamobile.androidlocalization

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class PrefaranceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prefarance)
        
//        initViews()

//        initShared()
    }

//    private fun initShared() {
//                val et_email = findViewById<EditText>(R.id.et_email)
//        val b_save = findViewById<Button>(R.id.b_save)
//
//        b_save.setOnClickListener {
//            val prefsManager = PrefsManager.getInstance(this)
//            prefsManager?.saveData("salom","HELLO")
////            prefsManager!!.getData("salom")
//        }
//    }

//    private fun initViews() {
//        val et_email = findViewById<EditText>(R.id.et_email)
//        val b_save = findViewById<Button>(R.id.b_save)
//        val btn_get = findViewById<TextView>(R.id.btn_get)
//
//        b_save.setOnClickListener {
//            val email = et_email.text.toString()
//            saveEmail(email)
//        }
//        btn_get.setOnClickListener {
//            loadEmail()
//
//        }
//
//    }
//
//    private fun saveEmail(email: String?) {
//        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
//        val editor = prefs.edit()
//        editor.putString("email", email)
//        editor.apply()
//    }
//
//    fun loadEmail():String?{
//        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
//        return prefs.getString("email", "pdp@gmail.com")
//    }
//
//    fun removeEmail(){
//        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
//        val editor = prefs.edit()
//        editor.remove("email")
//        editor.apply()
//    }
//
//    fun clearAll(){
//        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
//        val editor = prefs.edit()
//        editor.clear()
//        editor.apply()
//    }

}