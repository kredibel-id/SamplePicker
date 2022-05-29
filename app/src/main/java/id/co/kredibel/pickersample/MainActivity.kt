package id.co.kredibel.pickersample

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import io.kredibel.picker.Picker

class MainActivity : AppCompatActivity() {
    var picker = Picker(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgResult = findViewById<ImageView>(R.id.imgResult)
        findViewById<View>(R.id.btnCamera).setOnClickListener {

            /*picker.pickCamera { uri: Uri?, file: File?, bitmap: Bitmap? ->
                imgResult.setImageURI(uri)
            }*/

            picker.pickCamera { uri, file, bitmap ->
                imgResult.setImageURI(uri)
            }

        }
        findViewById<View>(R.id.btnGalery).setOnClickListener {

            picker.pickGallery { uri, file, bitmap ->
                imgResult.setImageURI(uri)
            }

        }
    }
}