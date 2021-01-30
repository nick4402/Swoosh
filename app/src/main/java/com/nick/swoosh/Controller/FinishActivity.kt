package com.nick.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nick.swoosh.EXTRA_LEAGUE
import com.nick.swoosh.EXTRA_PLAYER
import com.nick.swoosh.EXTRA_SKILL
import com.nick.swoosh.Model.Player
import com.nick.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

        searchLeagueTxt.text = "Looking ${player.league} ${player.skill} league near you ..."

    }
}