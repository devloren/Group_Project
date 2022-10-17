package com.cupojava.trapprkeepr.ui.note_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Note List"
    }
    val text: LiveData<String> = _text
}