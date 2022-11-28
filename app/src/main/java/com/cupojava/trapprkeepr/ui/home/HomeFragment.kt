package com.cupojava.trapprkeepr.ui.home

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cupojava.trapprkeepr.Birthday
import com.cupojava.trapprkeepr.CreateNoteActivity
import com.cupojava.trapprkeepr.databinding.BirthdayMainBinding
import com.cupojava.trapprkeepr.databinding.FragmentHomeBinding
import com.cupojava.trapprkeepr.models.NoteHandler
import com.cupojava.trapprkeepr.ui.note_list.NoteListFragment
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //var homeHandler = NoteHandler()
        var homenotes = arrayOf("Birthday","Anniversary","Wedding","Game Night","Study","Running Errands","Vacation","Picnic","Road trip","Board Meeting","House Warming","WorkOut")

        var listNotes = view.findViewById<ListView>(com.cupojava.trapprkeepr.R.id.listNotes)
        binding.listNotes.isClickable = true
        binding.listNotes.adapter = ArrayAdapter(requireContext(), R.layout.simple_list_item_1, homenotes)

        binding.listNotes.setOnItemClickListener { parent, view, position, id ->

           val titlee= homenotes[position]
            val activityIntent = Intent(requireContext(),Birthday::class.java)
            Toast.makeText(requireContext(),"Item Clicked ",Toast.LENGTH_SHORT).show()
            activityIntent.putExtra("x",titlee)
            startActivity(activityIntent)
        }
        


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



