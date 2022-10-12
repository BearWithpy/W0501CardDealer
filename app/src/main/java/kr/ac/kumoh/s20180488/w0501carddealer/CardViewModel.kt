package kr.ac.kumoh.s20180488.w0501carddealer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

// 시험에 나온다 ViewModel()!!
class CardViewModel : ViewModel(){
    private var _cards = MutableLiveData<IntArray>()

    val cards: LiveData<IntArray>
        get() = _cards

    val random = Random(System.currentTimeMillis())

    fun deal(){
//        var c =  IntArray(5)
//        c[0] = random.nextInt(52)
//        c[1] = random.nextInt(52)
//        c[2] = random.nextInt(52)
//        c[3] = random.nextInt(52)
//        c[4] = random.nextInt(52)

        var c = IntArray(5)
        for (i in c.indices) {
            c[i] = -1
        }
        for (i in c.indices) {
            while(true){
                val randNum = random.nextInt(52)
                if(c.contains(randNum)){
                    continue
                }
                c[i] = randNum
                break
            }

        }


        _cards.value = c
    }

}