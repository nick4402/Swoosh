package com.nick.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nick.swoosh.EXTRA_LEAGUE
import com.nick.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMenClicked(view:View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomenClicked(vide:View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view:View) {
        menBtn.isChecked = false
        womenBtn.isChecked = false
        selectedLeague = "co-ed"
    }


    fun nextClick(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_LONG).show()
        }
    }


}