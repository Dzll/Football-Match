package com.dzulkarnain_inc.footballmatch

import java.net.URL

class ApiRespository {
    fun doRequest(url: String): String{
        return URL(url).readText()
    }
}