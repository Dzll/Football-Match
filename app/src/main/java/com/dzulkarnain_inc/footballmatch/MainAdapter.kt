package com.dzulkarnain_inc.footballmatch

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.dzulkarnain_inc.footballmatch.R.id.time_Team
import com.dzulkarnain_inc.footballmatch.R.id.versus_Team
import org.jetbrains.anko.*

class MainAdapter(private val events: List<Event>)
    : RecyclerView.Adapter<TeamViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(TeamUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bindItem(events[position])
    }

    override fun getItemCount(): Int = events.size

}

class TeamUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui){
            linearLayout{
                lparams(width = matchParent, height = wrapContent)
                padding = dip(16)
                orientation = LinearLayout.HORIZONTAL

                textView {
                    id = R.id.time_Team
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }

                textView{
                    id = R.id.versus_Team
                    textSize = 16f
                }.lparams{
                    margin = dip(15)
                }

            }
        }
    }
}

class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val timeTeam: TextView = view.find(time_Team)
    private val versusTeam: TextView = view.find(versus_Team)

    fun bindItem(events: Event) {
        timeTeam.text = events.dateEvent
        versusTeam.text = events.strEvent
    }
}