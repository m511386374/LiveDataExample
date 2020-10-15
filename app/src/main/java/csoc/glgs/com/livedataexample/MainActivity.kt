package csoc.glgs.com.livedataexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModle: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModle = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModle.getMutableLiveData().observe(this, Observer {
            tv_1.text = it
        })
        tv_1.setOnClickListener{
            mainViewModle.getMutableLiveData().value ="LiveDataExample"
        }
    }

}
