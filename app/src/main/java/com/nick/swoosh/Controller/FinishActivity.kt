package com.nick.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nick.swoosh.EXTRA_LEAGUE
import com.nick.swoosh.EXTRA_SKILL
import com.nick.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking $league $skill near you ..."
    }
}