package com.cupojava.trapprkeepr.ui.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cupojava.trapprkeepr.databinding.FragmentComposeNoteBinding
import com.cupojava.trapprkeepr.models.NoteHandler

class ComposeNoteFragment : Fragment() {

    private var _binding: FragmentComposeNoteBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeNoteViewModel =
            ViewModelProvider(this).get(ComposeNoteViewModel::class.java)

        _binding = FragmentComposeNoteBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val noteHandler = NoteHandler()

        val spinner = view.findViewById<Spinner>(com.cupojava.trapprkeepr.R.id.note_category_selector)

        spinner.adapter = ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_dropdown_item, noteHandler.noteList.values.toList())

        val textView = view.findViewById<TextView>(com.cupojava.trapprkeepr.R.id.note_content)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}