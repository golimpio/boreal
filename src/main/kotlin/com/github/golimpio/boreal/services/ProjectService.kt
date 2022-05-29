package com.github.golimpio.boreal.services

import com.intellij.openapi.project.Project
import com.github.golimpio.boreal.BorealBundle

class ProjectService(project: Project) {

    init {
        println(BorealBundle.message("projectService", project.name))
    }
}
