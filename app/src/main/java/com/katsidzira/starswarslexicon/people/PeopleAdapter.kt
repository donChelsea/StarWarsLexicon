package com.katsidzira.starswarslexicon.people

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.katsidzira.starswarslexicon.databinding.ListViewPeopleBinding
import com.katsidzira.starswarslexicon.models.People

class PeopleAdapter(private val peopleList: List<People>, private val itemListener: (View) -> Unit): RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListViewPeopleBinding.inflate(inflater)
        return PeopleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.onBind(peopleList[position])
    }

    override fun getItemCount() = peopleList.size

    inner class PeopleViewHolder(private val binding: ListViewPeopleBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(person: People) {
            binding.person = person
            binding.tvPersonName.setOnClickListener {
                itemListener(it)
            }
        }
    }
}

