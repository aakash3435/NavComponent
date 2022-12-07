package com.example.navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navcomponent.databinding.FragmentNesterRecyclerviewBinding


class NesterRecyclerviewFragment : Fragment() {

lateinit var binding : FragmentNesterRecyclerviewBinding
 var list:ArrayList<Model> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentNesterRecyclerviewBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.add(Model("d","d"))
        list.add(Model("d","d"))
        list.add(Model("d","d"))
        list.add(Model("d","d"))
        list.add(Model("d","d"))
        list.add(Model("d","d"))
        list.add(Model("d","d"))
        var adapter = Reccycler1Adapter(requireContext(),list)
        binding.recCycler1.adapter= adapter
    }

}