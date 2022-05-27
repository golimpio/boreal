package com.github.golimpio.boreal.services

import com.intellij.openapi.project.Project
import com.github.golimpio.boreal.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
