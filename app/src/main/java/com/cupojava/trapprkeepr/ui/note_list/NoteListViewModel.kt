package com.cupojava.trapprkeepr.ui.note_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cupojava.trapprkeepr.databinding.ActivityMainBinding

class NoteListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Trappr Keepr Vault"
    }
    val text: LiveData<String> = _text
}