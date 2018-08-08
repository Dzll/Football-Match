package com.dzulkarnain_inc.footballmatch

import android.net.Uri

object TheSportDBApi {
    fun getPastEvent(Event: String?): String{
        return BuildConfig.BASE_URL+"api/v1/json/${BuildConfig.TSDB_API_KEY}"+"/eventspastleague.php?id="+ Event
    }

    fun getNextEvent(Event: String?): String{
        return BuildConfig.BASE_URL+"api/v1/json/${BuildConfig.TSDB_API_KEY}"+"/eventsnextleague.php?id="+ Event
    }
}