package com.example.noteapp

import java.util.Date

data class TodoItem(
    val id: String,
    var desc: String,
    val done: Boolean,
    val date: Date,
    val editDate: Date? = null
)
