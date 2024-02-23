package com.example.noteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Spinner
import androidx.navigation.fragment.findNavController
import com.example.noteapp.databinding.FragmentChangeBinding
import java.util.Date

class ChangeFragment : Fragment() {

    private lateinit var binding: FragmentChangeBinding
    private lateinit var etDescription: EditText
    private lateinit var datePicker: DatePicker
    private lateinit var spinnerPriority: Spinner
    private lateinit var btnSave: Button
    private lateinit var btnCancel: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChangeBinding.inflate(layoutInflater, container, false)

        etDescription = binding.etDescription
        datePicker = binding.datePicker
        spinnerPriority = binding.spinnerPriority
        btnSave = binding.btnSave
        btnCancel = binding.btnCancel

        btnSave.setOnClickListener { onSaveClicked() }
        btnCancel.setOnClickListener { onCancelClicked() }

        return binding.root
    }

    private fun onSaveClicked() {
        val description = etDescription.text.toString()
        val priority = spinnerPriority.selectedItem

        val todoTask = TodoItemsRepository()
        val size = todoTask.getTodoList().size + 1
        TodoItemsRepository().addNewTodoItem(TodoItem(size.toString(), description, false, Date(), null))
        findNavController().navigate(R.id.action_changeFragment_to_listFragment)
    }
    private fun onCancelClicked() {
        findNavController().navigate(R.id.action_changeFragment_to_listFragment)
    }
}