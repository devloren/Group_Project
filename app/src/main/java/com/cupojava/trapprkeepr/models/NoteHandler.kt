package com.cupojava.trapprkeepr.models

class NoteHandler {
    val noteList = HashMap<Note, String>()
    val categoricalList = HashMap<Category, String>()

    init {
        initializeLists()

    }
    private fun initializeLists() {

        var note = Note(Category(category_name = "off-topic","1st hello!"), title="1st hello!")
        categoricalList.set(note.category, note.title)
        noteList.set(note,note.title)

        note = Note(Category(category_name = "school", title = "Java Group Notes"), title = "Java Group Notes")
        categoricalList.set(note.category, note.title)
        noteList.set(note,note.title)

        note = Note(Category(category_name = "dev", title = "Work expectations"), title = "Work expectations", "1. Do work\t2.Do more work.")
        categoricalList.set(note.category, note.title)
        noteList.set(note,note.title)
    }


}