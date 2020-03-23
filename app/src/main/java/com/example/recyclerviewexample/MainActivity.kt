package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // specify an viewAdapter for the dataset
        recycler_view.adapter = MyRecyclerAdapter(generateContact(20))

        // use a linear layout manager
        recycler_view.layoutManager = LinearLayoutManager(this)

        // if you want, you can make the layout of the recyclerview horizontal as follows
        //recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        // Add a divider between rows -- Optional
        //val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        //recycler_view.addItemDecoration(dividerItemDecoration)

        // use this setting to improve performance if you know the size of the RecyclerView is fixed
        //recycler_view.setHasFixedSize(true)

    }

    private fun generateContact(size: Int) : ArrayList<Contact>{

        // A helper function to create specified amount of dummy contact data
        val contacts = ArrayList<Contact>()

        for (i in 0..size){
            val person = Contact("John Doe-$i", i, R.drawable.ic_person_black_24dp)
            contacts.add(person)
        }

        return contacts
    }
}
