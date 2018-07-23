package hemanthmusicplayer.com.kotlintestproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import hemanthmusicplayer.com.kotlintestproject.test.User


class MainActivity : AppCompatActivity() {
    /*
    *
    * Here i am initializing variables.
    *
    * */
    var firstname: EditText? = null
    var lastName: EditText? = null
    var passData: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        setClickListners()
    }

    //This function is for converting xml fields into kotlin object.
    private fun init() {
        firstname = findViewById<EditText>(R.id.firstname)
        lastName = findViewById<EditText>(R.id.lastname)
        passData = findViewById<Button>(R.id.passdata)
    }

    //Here i am setting clicklistner for passdata button.
    private fun setClickListners() {
        passData?.setOnClickListener(listner)
    }

    var listner = object : View.OnClickListener {
        override fun onClick(v: View?) {
            var fname = firstname?.text.toString()//fetching user firstname  from view.
            var lname = lastName?.text.toString()//fetching user lastName  from view.
            passData(User(fname, lname))

        }
    }

//This is an intent will carry my  user object to SectondActivity.
    private fun passData(sample: User) {
        var intentobject = Intent(this@MainActivity, SecondActivity::class.java)
        intentobject.putExtra("obj", sample)//here i am inserting serializable object.
        startActivity(intentobject)
    }
}