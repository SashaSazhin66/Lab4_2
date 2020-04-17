package com.work.lab4_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)

        if (view is RecyclerView) {
            with(view) {
                layoutManager =  LinearLayoutManager(context)
                adapter = MyItemRecyclerViewAdapter(
                    listOf("Google", "Facebook", "Twitter", "Xda-developer"),
                    context as OnListFragmentInteractionListener)
            }
        }
        return view
    }

    interface OnListFragmentInteractionListener {
        fun onListFragmentInteraction(item: String)
    }
}
