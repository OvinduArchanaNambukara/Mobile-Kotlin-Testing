package com.austi.android.application2

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val args = SecondFragmentArgs.fromBundle(it)
            var findX: FindX = FindX()
            view.findViewById<TextView>(R.id.formular).text =
                "Formula ${args.xx}(X^2) ${if (args.x >= 0.toString()) ("+" + args.x) else args.x}(X) ${if (args.c >= 0.toString()) ("+" + args.c) else args.c}"
            val result: String =
                findX.calculateX(args.xx.toDouble(), args.x.toDouble(), args.c.toDouble())
            view.findViewById<TextView>(R.id.textview_second).text = result
        }

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    private fun createAddress(xx: String, x: String, c: String): String {
        return "$xx $x $c";
    }
}