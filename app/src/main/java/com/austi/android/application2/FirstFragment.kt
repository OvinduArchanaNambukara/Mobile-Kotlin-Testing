package com.austi.android.application2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.login).setOnClickListener {
            view.findViewById<ProgressBar>(R.id.loading).visibility = View.VISIBLE
            var xx = view.findViewById<EditText>(R.id.xx).text.toString()
            var x = view.findViewById<EditText>(R.id.x).text.toString()
            var c = view.findViewById<EditText>(R.id.c).text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(xx, x, c)
            findNavController().navigate(action)
        }
    }
}