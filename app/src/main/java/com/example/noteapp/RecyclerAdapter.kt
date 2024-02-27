package com.example.noteapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.databinding.CellTodoBinding

class RecyclerAdapter():RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val adapterList = mutableListOf<TodoItem>()

    inner class ViewHolder(private var binding: CellTodoBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(item: TodoItem){
            binding.apply {
                btnChecked.setImageResource(if (item.done) R.drawable.done else R.drawable.not_yet)
                todoText.setText(item.desc)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        return ViewHolder(CellTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return adapterList.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.onBind(adapterList[position])
    }
    fun updateList(newList: List<TodoItem>) {
        adapterList.clear()
        adapterList.addAll(newList)
        notifyDataSetChanged()
    }
}
