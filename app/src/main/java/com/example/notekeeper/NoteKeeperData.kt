package com.example.notekeeper

//this class has all the declaration on a single line, the val decorator
//allows to declare the attributes of the class without a body
//val represents a constant value and var a mutable VARIABLES

class CourseInfo (val courseId: String, val title: String)

class NoteInfo (var course: CourseInfo, var title: String, var text: String)