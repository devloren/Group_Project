package com.cupojava.trapprkeepr.models

class Category(val category_name: String, val title: String)
class Note(var category: Category, var title: String, var note_text: String = "") {
    override fun toString(): String {
        return super.toString()
    }
}