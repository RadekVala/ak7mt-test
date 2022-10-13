package cz.utb.fai.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cz.utb.fai.demoapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    var count = 0;

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvCount.text = count.toString()


        binding.btnClicker.setOnClickListener {
            count++
            binding.tvCount.text = count.toString()
        }

    }

    override fun onPause() {
        super.onPause()
        Log.v("MYCOOLAPP", "activity Paused with count: " + count)
    }

    override fun onResume() {
        super.onResume()
        Log.v("MYCOOLAPP", "activity Resumed with count: " + count)
    }
}