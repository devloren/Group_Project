# Trappr Keepr ReadMe (Group 3 Project)
Java Group Project

Hello! These are the codes to make a note taking app.

There are different gradle files for the app formate.

The app folder contains the codes of the different activities of the app.

The AndroidManifest.xml in app->src->main has the code to run the application. Different activities were called in this code to make them visible on the app.

The java/com/cupojava/trapprkeepr folder contains different codes of the different activities that were called in the AndroidManifest.xml 

The MainActivity.kt has the code of the main activity.

The CreateNoteActivity.kt has the code for the create note activity which is called when the user clicks the create note button.

Birthday.kt has the code of the activity to take notes of the events and it is initialized when the user chooses the event they want to take a note on.

The components folder has the code for the nested scrollable host.

The models folder has the TrapperKeeper.kt that has the constructer to define the different components.It also has a NoteHandler class that declares different
categories and names for it which is used in the create note activity.

The ui folder has three different folders in it which are all different activities. 
The Home folder has the code of the HomeView model and the homefragment activity that has the list view of different events lists.
The note folder has the code of the ComposeNoteView and the ComposeoteFragment activity which is use to create a note and save it. The NoteHandler is called in
this activity to create notes.
The note_list folder has the code of the NoteListView and the NoteListFragment that has the list of the notes created.

The res folder in the app/src/main has all the different folders that has the different codes for the xml files and the other files.

The layout folder has the xml files for all the different activities. These xml files are the layouts of the activities to arrange the way they are going to look
on the app.
The drawable has all the different image files used throughout the app.
The menu folder has the xml files of the layout of the main menu.
The navigation folder has the xml file of the main pages layout of the different activities.
<br> <hr> <br>
The goal of the project was to make a ToDo List application that would allow the user to create multiple different ToDo lists and notes to help organize activities
that require multiple steps to complete. The app would also allow you to compose notes in relation to these ToDo Lists or to make generic notes that do not require
a full ToDo list.
<br><br>
The user would open the app to a home page where there would be a list of templates for them to choose from on what kind of ToDo list they would like to make. After
selecting one, it would ask if there are any overencompassing notes that they would like to make. From there, it should send them to the note list where they can view
the notes they have made. There is also a sidebar available at all times to make navigating the app easier.
