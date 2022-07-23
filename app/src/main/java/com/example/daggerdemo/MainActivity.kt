package com.example.daggerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        DaggerSamrtPhoneComponent.create().inject(this)

        (application as SmartPhoneAplications).samrtPhoneComponent.inject(this)
        smartPhone.makeACallWithRecording()

//        DaggerSamrtPhoneComponent.create().getSmartPhone()
//            .makeACallWithRecording()

//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ProvaiderService()),
//            MemoryCard()
//        )
//            .makeACallWithRecording()
    }
}