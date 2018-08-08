package com.dzulkarnain_inc.footballmatch

import com.google.gson.annotations.SerializedName

data class Event(
     @SerializedName("idEvent")
     var idEvent: String? = null,

     @SerializedName("dateEvent")
     var dateEvent: String? = null,

     @SerializedName("strEvent")
     var strEvent: String? = null
)