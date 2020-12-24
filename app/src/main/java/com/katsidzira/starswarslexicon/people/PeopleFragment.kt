package com.katsidzira.starswarslexicon.people

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.katsidzira.starswarslexicon.R
import com.katsidzira.starswarslexicon.databinding.FragmentPeopleBinding

class PeopleFragment : Fragment() {

    private lateinit var binding: FragmentPeopleBinding

    private lateinit var model: PeopleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPeopleBinding.inflate(inflater)

        model = ViewModelProvider(this).get(PeopleViewModel::class.java)

        model.getPeople()

        model.peopleList.observe(viewLifecycleOwner, Observer {
            val listener: (View) -> Unit = {
                findNavController().navigate(R.id.action_peopleFragment_to_peopleDetailFragment)
            }
            val adapter = PeopleAdapter(it, listener)
            binding.rvPeople.adapter = adapter
            adapter.notifyDataSetChanged()
        })
        
        return binding.root
    }

}