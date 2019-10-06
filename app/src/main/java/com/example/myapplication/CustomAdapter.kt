package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ui.main.Employee

class CustomAdapter(val context: Context,val list: List<Employee>): RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val view = layoutInflater.inflate(R.layout.list_item, parent, false)

        return CustomViewHolder(view)
    }




    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
       holder.TvId.text = list[position].ID.toString()
       holder.TvName.text = list[position].Title
       holder.TvAge.text = list[position].DueDate
       holder.TvSalary.text = list[position].Completed.toString()
    }
}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

lateinit var TvId:TextView
lateinit var TvName:TextView
lateinit var TvAge:TextView
lateinit var TvSalary:TextView
    init {
        TvId=itemView.findViewById(R.id.tv_id)
        TvName=itemView.findViewById(R.id.tv_name)
        TvAge=itemView.findViewById(R.id.tv_age)
        TvSalary=itemView.findViewById(R.id.tv_salary)
    }

}
