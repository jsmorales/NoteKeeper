package com.example.notekeeper

class DataManager {
    val  courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    //this initialize the functions called inside
    //this runs as part of an instance creation
    //can access to a primary constructor parameters
    init {
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android Programming With Intents")
        courses[course.courseId] = course
        course = CourseInfo("android_async", "Android async programming and services")
        courses[course.courseId] = course
        //this is another way to pass parameters over a function
        course = CourseInfo(title = "Java Fundamentals", courseId = "java_lang")
        courses[course.courseId] = course
    }
}