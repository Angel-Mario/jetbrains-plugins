package com.angelmario.materialicons

import com.intellij.ide.FileIconPatcher
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

/** Replaces platform and language-plugin icons for files and folders in the project view. */
class MaterialFileIconPatcher : FileIconPatcher {
    companion object {
        // Value of the former Iconable.ICON_FLAG_OPEN, retained by the platform tree API.
        private const val ICON_FLAG_OPEN = 0x0004
    }

    override fun patchIcon(icon: Icon, file: VirtualFile, flags: Int, project: Project?): Icon {
        val isRoot = file.isDirectory && project != null && isContentRoot(file, project)
        val iconId = MaterialIconRegistry.resolveIconId(
            fileName = file.name,
            isDirectory = file.isDirectory,
            isExpanded = flags and ICON_FLAG_OPEN != 0,
            isRoot = isRoot,
        ) ?: return icon

        return MaterialIconRegistry.getIcon(iconId) ?: icon
    }

    private fun isContentRoot(file: VirtualFile, project: Project): Boolean {
        return ProjectRootManager.getInstance(project).contentRoots.any { it == file }
    }
}
