package com.github.fabiosanto.intellijassistant.services

import com.intellij.openapi.project.Project
import com.github.fabiosanto.intellijassistant.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
