package com.cupojava.trapprkeepr.models

import com.cupojava.trapprkeepr.R

class NoteHandler {
    val noteList = HashMap<Note, String>()
    val categoricalList = HashMap<Category, String>()
    var homenotes = arrayOf("Birthday","Anniversary","Wedding","Game Night","Study","Running Errands","Vacation","Picnic","Road trip","Board Meeting","House Warming","WorkOut")

    init {
        initializeLists()

    }


    private fun initializeLists() {

        var note = Note(Category(category_name = "off-topic","1st hello!"), title="Party")
        categoricalList.set(note.category, note.title)
        noteList.set(note,note.title)

        note = Note(Category(category_name = "school", title = "Java Group Notes"), title = "Enjoying your life")
        categoricalList.set(note.category, note.title)
        noteList.set(note,note.title)

        note = Note(Category(category_name = "dev", title = "Work expectations"), title = "Working on yourself", "1. Do work\t2.Do more work.")
        categoricalList.set(note.category, note.title)
        noteList.set(note,note.title)
    }


}