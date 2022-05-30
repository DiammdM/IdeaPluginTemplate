package com.github.diammdm.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.diammdm.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
