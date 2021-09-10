package com.github.hannenijhuis.intellijplatformbelafontetheme.services

import com.intellij.openapi.project.Project
import com.github.hannenijhuis.intellijplatformbelafontetheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
