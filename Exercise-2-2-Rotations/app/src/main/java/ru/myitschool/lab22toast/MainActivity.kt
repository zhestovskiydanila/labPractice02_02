package ru.myitschool.lab22toast

import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab22toast.databinding.ActivityMainBinding

class MainActivity:AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private var savedInstanceState: Bundle = Bundle()
    private var count:Int = 0

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity CREATED", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity STARTED", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Activity RESUMED", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        if (count % 2 == 0) {
            Toast.makeText(this, "Activity DESTROYED", Toast.LENGTH_LONG).show()
        }
        count++
        onSaveInstanceState(savedInstanceState)
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Activity RESTARTED", Toast.LENGTH_LONG).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Count", count)
    }
}

