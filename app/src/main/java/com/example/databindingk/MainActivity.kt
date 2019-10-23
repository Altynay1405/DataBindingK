package com.example.databindingk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding layout
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var userModel = UserModel()
        userModel.uName = "Altynay"  //set the value
        userModel.pwd = "123456"
        mainBinding.userModel = userModel
    }
}
