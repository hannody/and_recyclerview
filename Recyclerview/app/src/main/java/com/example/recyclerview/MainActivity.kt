package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_todo.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var todoList =mutableListOf(
        Todo("Visit www.AbuNayla.com", false),
        Todo("Eat A Pizza", true),
        Todo("Call Mom", false),
        Todo("Kick some asses", false),
        Todo("Play some games", false),
        Todo("SLEEP!", false)
        )


        val adapter = TodoAdapter(todoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnTodos.setOnClickListener{
            val title = etTodos.text.toString()


            val todo = Todo(title, false)

            todoList.add(todo)
            adapter.notifyItemChanged(todoList.size -1)

        }
    }
}
