package com.example.noteapp

import java.util.Date

class TodoItemsRepository {
    private val toDoItems: MutableList<TodoItem> = mutableListOf()

    init {
        toDoItems.addAll(listOf(
            TodoItem("1","Task 1", false, Date(), Date()),
            TodoItem("2", "Task 2",true, Date(), Date()),
            TodoItem("3", "Task 3",false, Date(), null),
            TodoItem("4", "Task 4",true, Date(), Date()),
            TodoItem("5", "Task 5",false, Date(), null),
            TodoItem("6", "Task 6",true, Date(), Date()),
            TodoItem("7", "Task 7",false, Date(), null),
            TodoItem("8", "Task 8",true, Date(), Date()),
            TodoItem("9", "Task 9",false, Date(), null),
            TodoItem("10","Task 10",true, Date(), Date()),
            TodoItem("11","Task 11",false, Date(), null),
            TodoItem("12","Task 12",true, Date(), Date()),
            TodoItem("13","Task 13",false, Date(), null),
            TodoItem("14","Task 14",true, Date(), Date()),
            TodoItem("15","Task 15", false, Date(), null),
            TodoItem("16","Task 16", true, Date(), Date()),
            TodoItem("17","Task 17", false, Date(), null),
            TodoItem("18", "Task 18",true, Date(), Date()),
            TodoItem("19", "Task 19", false, Date(), null),
            TodoItem("20",  "Task 20", true, Date(), Date())
        ))
    }

    fun getTodoList(): List<TodoItem> {
        return toDoItems.toList()
    }

    fun addNewTodoItem(newItem: TodoItem) {
        toDoItems.add(newItem)
    }


}