package com.example.singleactivity


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity


class BFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Enable buttons in App Bar aka Action Bar, when managed from a Fragment (override onCreateOptionsMenu and onOptionsItemSelected)!!!
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar!!.title = "Fragment B"


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }
}
