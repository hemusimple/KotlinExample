package hemanthmusicplayer.com.kotlintestproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import hemanthmusicplayer.com.kotlintestproject.test.User

/**
 * Created by SAFACS on 7/23/2018.
 */
public class SecondActivity : AppCompatActivity() {
    var fname: TextView? = null
    var lname: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        init()
          }

    private fun init() {
        fname = findViewById<TextView>(R.id.fname)
        lname = findViewById(R.id.lname)
        //here  i am getting intent object from MainActivity.
        //And here you  can get the data from serializable object
        //and then you have to cast to that perticuler object that you are passing from MainActivity.
        var name = intent.getSerializableExtra("obj") as? User
        fname?.text=name?.firstname
        lname?.text=name?.lastName
        Toast.makeText(this@SecondActivity, "firstname:${name?.firstname}and lastname:${name?.lastName}", Toast.LENGTH_LONG).show()
    }
}