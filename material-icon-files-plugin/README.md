# Material File Icons Only

Plugin for IntelliJ IDEA and any IDE based on IntelliJ Platform (PyCharm, WebStorm, GoLand, CLion, Rider, DataGrip, etc.) that applies **Material Icon Theme** icons to all project files and folders.

## What it does

- Registers a `FileIconProvider` and a `FileIconPatcher`, so it replaces the icons of **every** file and folder in the project view, editor tabs, and anywhere else the platform renders them.
- Detects expanded/collapsed folders, project content roots, and multi-module projects.
- Different icons for light and dark themes, scaled to 16px so they stay crisp.
- Does **not** install a UI theme or a color scheme.
- Does **not** touch toolbar icons, tool window icons, or any other IDE chrome: only folders and files.

Why this plugin exists: the existing Material Icons plugin for JetBrains did not replace every file icon, and it also changed the toolbar icons — which I didn't like. This one is strictly limited to files and folders.

## Compatibility

- IntelliJ Platform **2025.1** or later (`sinceBuild = 251`).
- Any IDE based on the platform (IDEA, PyCharm, WebStorm, Rider, etc. since 2025.1).
- Only depends on `com.intellij.modules.platform`; no language plugin dependency.

## Build and install

Requires JDK 21. To create the installable archive:

```bash
./gradlew buildPlugin
```

The ZIP is generated in `build/distributions/`. In the IDE, use **Settings → Plugins → ⚙ → Install Plugin from Disk…** and pick that ZIP.

To launch a sandbox IDE with the plugin loaded:

```bash
./gradlew runIde
```

## Project structure

```
src/main/kotlin/com/angelmario/materialicons   Kotlin provider/patcher code
src/main/resources/META-INF                   plugin.xml and plugin icon
assets/material-icons.json                    File → icon mappings (VS Code format)
assets/icons                                  Icon set SVGs
```

## Resources and credits

- The file/folder name and extension mappings, and the SVG artwork, come from [Material Icon Theme](https://github.com/material-extensions/vscode-material-icon-theme) (MIT license).
- The JetBrains platform integration is based on cweijan's original idea; this version adds the `FileIconPatcher`, expanded folders, light theme support, and complete file replacement.

Plugin by **Angel Mario Roque Suárez** · [github.com/Angel-Mario](https://github.com/Angel-Mario) · MIT license (`LICENSE`).
