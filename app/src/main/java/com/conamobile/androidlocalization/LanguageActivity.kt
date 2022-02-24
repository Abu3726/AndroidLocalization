package com.conamobile.androidlocalization

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.*

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val b_english = findViewById<Button>(R.id.b_english)
        val b_russian = findViewById<Button>(R.id.b_russian)
        val b_uzbek = findViewById<Button>(R.id.b_uzbek)



        initViews()
        b_english.setOnClickListener {
//            setLocale("en")

            MyApplication.localManager!!.setNewLocale(this, LocaleManager.LANGUAGE_ENGLISH)
            finish()
        }
        b_russian.setOnClickListener {
//            setLocale("ru")

            MyApplication.localManager!!.setNewLocale(this, LocaleManager.LANGUAGE_RUSSIAN)
            finish()
        }
        b_uzbek.setOnClickListener {
//            setLocale("uz")

            MyApplication.localManager!!.setNewLocale(this, LocaleManager.LANGUAGE_UZBEK)
            finish()
        }
    }

    private fun setLocale(language: String?) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config,
        baseContext.resources.displayMetrics)
        finish()
    }

    private fun initViews() {
        val one = resources.getQuantityString(R.plurals.my_cats, 1,1)
        val few = resources.getQuantityString(R.plurals.my_cats, 2,3)
        val many = resources.getQuantityString(R.plurals.my_cats, 5,10)

        Log.d("@@@one", one)
        Log.d("@@@few", few)
        Log.d("@@@many", many)
    }
}