package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

class TodoAdapter (
    var todos:List<Todo>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
    inner class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        // Called when the recyclerview needs a new holder
        // inflate the xml file that we created i.e. item_todo
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent,
            false)
        return TodoViewHolder(view)

    }

    override fun getItemCount(): Int {
        //Returns how many items the RV has.
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        // To bind the data to our items
        holder.itemView.apply {
            tvTitle.text = todos[position].title
            cbDone.isChecked = todos[position].isChecked
        }
    }

}