package com.dzulkarnain_inc.footballmatch

import android.util.Log
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import kotlin.math.log

class MainPresenter(private val view: MainView,
                    private val apiRespository: ApiRespository,
                    private val gson: Gson){

    fun getEventList(Event: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRespository
                    .doRequest(TheSportDBApi.getPastEvent(Event)),
                    EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeamList(data.events)
            }
        }
    }
}