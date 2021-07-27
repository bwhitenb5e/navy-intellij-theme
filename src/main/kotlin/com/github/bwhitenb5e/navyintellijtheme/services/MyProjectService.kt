package com.github.bwhitenb5e.navyintellijtheme.services

import com.github.bwhitenb5e.navyintellijtheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
