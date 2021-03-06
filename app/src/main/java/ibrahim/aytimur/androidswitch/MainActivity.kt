package ibrahim.aytimur.androidswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                imageView.setImageResource(R.drawable.aciklamba)
            else
                imageView.setImageResource(R.drawable.kapalilamba)
        }
    }
}
