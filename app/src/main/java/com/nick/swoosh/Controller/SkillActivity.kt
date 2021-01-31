package com.nick.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nick.swoosh.EXTRA_PLAYER
import com.nick.swoosh.Model.Player
import com.nick.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)
        }
    }


    fun onBeginnerClicked(view: View) {
        ballerBnt.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view : View) {
        beginnerBnt.isChecked = false
        player.skill = "baller"
    }
    
        

    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_LONG).show()
        }
    }
}