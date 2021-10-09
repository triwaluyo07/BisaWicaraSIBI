package com.triwaluyo07.bisawicarasibi.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.triwaluyo07.bisawicarasibi.data.KamusDummy
import com.triwaluyo07.bisawicarasibi.data.KamusEntity

class MainViewModel(app : Application) : AndroidViewModel(app)
{

    fun getListHuruf() : List<KamusEntity> = KamusDummy.generateDummyHuruf()
    fun getListAngka() : List<KamusEntity> = KamusDummy.generateDummyAngka()

}