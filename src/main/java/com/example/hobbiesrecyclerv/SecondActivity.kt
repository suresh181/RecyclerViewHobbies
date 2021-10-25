package com.example.hobbiesrecyclerv


import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Safe Call   ?.
        // Safe Call with let  ?.let {  }

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle.getString(SyncStateContract.Constants._ID)
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
            txvUserMessage.text = msg
        }
    }
}