# jetbrains-plugins

My collection of plugins for JetBrains IDEs (IntelliJ IDEA, PyCharm, WebStorm, GoLand, CLion, Rider, DataGrip…). Each subfolder is a standalone plugin with its own README, license, and Gradle setup.

## Plugins

| Plugin | Folder | Description | Compatibility |
| --- | --- | --- | --- |
| [Material File Icons Only](material-icon-files-plugin) | `material-icon-files-plugin` | Applies Material Icon Theme icons to **all** files and folders, without touching toolbar icons or any other IDE chrome. | IntelliJ Platform 2025.1+ |
| [Monokai Pro (Filter Ristretto) Colors](monokai-plugin) | `monokai-plugin` | Monokai Pro Filter Ristretto theme with variants for the new **Islands UI** and classic, plus the editor color scheme. No icons, no paywall. | IntelliJ Platform 2025.2.3+ (Islands: 2025.3+) |

## Building a plugin

Each plugin is built separately from its folder (requires JDK 21):

```powershell
cd material-icon-files-plugin
.\gradlew.bat buildPlugin
```

The installable ZIP is written to `build/distributions/`. Install it via **Settings → Plugins → ⚙ → Install Plugin from Disk…**.

## Author

**Angel Mario Roque Suárez** · [github.com/Angel-Mario](https://github.com/Angel-Mario)

Licenses: each plugin ships its own license in its folder (MIT); the root summary is in `LICENSE`.
