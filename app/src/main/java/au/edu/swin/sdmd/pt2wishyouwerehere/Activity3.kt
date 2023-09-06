package au.edu.swin.sdmd.pt2wishyouwerehere

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.ComponentActivity

class Activity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)

        val location = intent.getParcelableExtra<Location>("location")


        location?.let{
            val vLocation = findViewById<TextView>(R.id.location)
            vLocation.text = it.name

            val vCity = findViewById<TextView>(R.id.city)
            vCity.text = it.city

            val vDate = findViewById<TextView>(R.id.date)
            vDate.text = it.date

            val rBar = findViewById<RatingBar>(R.id.rating3)
            rBar.rating = it.rating

        }
    }
}
