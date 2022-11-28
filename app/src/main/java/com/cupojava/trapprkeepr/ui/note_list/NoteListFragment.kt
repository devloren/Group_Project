package com.cupojava.trapprkeepr.ui.note_list

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cupojava.trapprkeepr.databinding.FragmentNoteListBinding
import com.cupojava.trapprkeepr.models.Category
import com.cupojava.trapprkeepr.models.NoteHandler
import kotlinx.android.synthetic.main.fragment_note_list.*


class NoteListFragment : Fragment() {

    private var _binding: FragmentNoteListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNoteListBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var nh = NoteHandler()
        val listShow = ArrayAdapter<String>(requireContext(), R.layout.simple_spinner_dropdown_item, nh.categoricalList.values.toList())


        listONotes.adapter = listShow

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}