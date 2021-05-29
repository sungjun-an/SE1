package com.jeongyoung.sw_reservation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.jeongyoung.sw_reservation.databinding.ActivityReservationBinding

//나의 예약 페이지
class StoreReservationActivity : AppCompatActivity() {

    val binding by lazy { ActivityReservationBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //현재 sharedPreference 이용 어려움 -> 임의 작성
        binding.nameText.text = "변정영"
        binding.numText.text = "3명"

        //가게 상세위치 제공
        //StoreReservationMapActivity -> 상세정보 전용 페이지
        binding.map.setOnClickListener {
            val intent = Intent(this, StoreReservationMapActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}