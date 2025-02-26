package com.pppig236.scoutingappredopit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TableRowAdapter(private var userArrayList: ArrayList<User>) :
    RecyclerView.Adapter<TableRowAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.table_row_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.tvTeam.text = userArrayList[i].name
        viewHolder.tvMatch.text = userArrayList[i].matchNumber
        viewHolder.tvRobotBreakdown.text = userArrayList[i].breakDown
    }

    override fun getItemCount(): Int {
        return userArrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMatch: TextView = itemView.findViewById(R.id.tv_user_match)
        val tvTeam: TextView = itemView.findViewById(R.id.tv_user_team)
        val tvRobotBreakdown: TextView = itemView.findViewById(R.id.tv_user_rbd)
    }
}
