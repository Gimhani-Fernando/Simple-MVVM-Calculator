package com.example.se_2019_023_assignment_01.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.se_2019_023_assignment_01.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var view = inflater.inflate(R.layout.fragment_main, container, false)

        var message = view.findViewById<TextView>(R.id.message)

        viewModel.result.observe(viewLifecycleOwner, Observer {
            message.text = it.toString()
        })

        var number1 = view.findViewById<EditText>(R.id.number1)
        var number2 = view.findViewById<EditText>(R.id.number2)

        var addButton = view.findViewById<Button>(R.id.addButton)
        var subtractButton = view.findViewById<Button>(R.id.subtractButton)
        var multiplyButton = view.findViewById<Button>(R.id.multiplyButton)
        var divideButton = view.findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener{
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                viewModel.add(num1, num2)
            } else {
                // Handle invalid input : display an error message
            }
        }

        subtractButton.setOnClickListener{
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                viewModel.subtract(num1, num2)
            } else {
                // Handle invalid input : display an error message
            }
        }

        multiplyButton.setOnClickListener{
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                viewModel.multiply(num1, num2)
            } else {
                // Handle invalid input : display an error message
            }
        }

        divideButton.setOnClickListener{
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                viewModel.divide(num1, num2)
            } else {
                // Handle invalid input : display an error message
            }
        }

        return view
    }

}