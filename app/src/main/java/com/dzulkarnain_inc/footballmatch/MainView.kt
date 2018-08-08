package com.dzulkarnain_inc.footballmatch

interface MainView{
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Event>)
}