package au.edu.swin.sdmd.pt2wishyouwerehere

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import au.edu.swin.sdmd.pt2wishyouwerehere.ui.theme.PT2wishyouwerehereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)

        val tasBridge = Location("Tasman Bridge", "Hobart, Tasmania", "27/8/23", 2.5F)
        val hobartDocks = Location("Hobart Docks", "Hobart, Tasmania", "13/6/23", 2F)
        val mountWellington = Location("Mt. Wellington / Kunyanyi", "Hobart, Tasmania", "27/8/23", 4.5F)
        val portArthur = Location("Port Arthur", "Hobart, Tasmania", "15/8/20", 4F)

        imageView1.setOnClickListener{
            val intent = Intent(this, Activity1::class.java)
            //parcelable goes here
            intent.putExtra("location", tasBridge)
            startActivity(intent)
        }

        imageView2.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("location", hobartDocks)
            startActivity(intent)
        }

        imageView3.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra("location", mountWellington)
            startActivity(intent)
        }

        imageView4.setOnClickListener{
            val intent = Intent(this, Activity4::class.java)
            intent.putExtra("location", portArthur)
            startActivity(intent)
        }
    }
}