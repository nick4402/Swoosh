package com.nick.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nick.swoosh.EXTRA_LEAGUE
import com.nick.swoosh.EXTRA_SKILL
import com.nick.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }

    fun onBeginnerClicked(view: View) {
        ballerBnt.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view : View) {
        beginnerBnt.isChecked = false
        skill = "baller"
    }
    
        

    fun onFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_LONG).show()
        }
    }
}