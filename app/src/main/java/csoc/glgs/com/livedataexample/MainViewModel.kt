package csoc.glgs.com.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * 作    者：MingMeng
 * 创建日期：2020/10/15
 * 描    述：
 */
class MainViewModel:ViewModel() {
    private val mutableLiveData : MutableLiveData<String> = MutableLiveData()
    fun getMutableLiveData(): MutableLiveData<String>{
        return mutableLiveData
    }
}