package com.nick.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nick.swoosh.EXTRA_LEAGUE
import com.nick.swoosh.EXTRA_PLAYER
import com.nick.swoosh.Model.Player
import com.nick.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    //var selectedLeague = ""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMenClicked(view:View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomenClicked(vide:View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view:View) {
        menBtn.isChecked = false
        womenBtn.isChecked = false
        player.league = "co-ed"
    }


    fun nextClick(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_LONG).show()
        }
    }


}