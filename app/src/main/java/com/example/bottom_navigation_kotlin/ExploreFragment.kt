package com.example.bottom_navigation_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ExploreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    companion object {
       @JvmStatic
        fun newInstance() =
            ExploreFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}