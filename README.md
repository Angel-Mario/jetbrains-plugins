# jetbrains-plugins

Colección de plugins que hago para los IDE de JetBrains (IntelliJ IDEA, PyCharm, WebStorm, GoLand, CLion, Rider, DataGrip…). Cada subcarpeta es un plugin independiente, con su propio README, licencia y configuración de Gradle.

## Plugins

| Plugin | Carpeta | Descripción | Compatibilidad |
| --- | --- | --- | --- |
| [Material File Icons Only](material-icon-files-plugin) | `material-icon-files-plugin` | Aplica los iconos de Material Icon Theme a **todos** los archivos y carpetas, sin tocar los iconos del toolbar ni del resto del IDE. | IntelliJ Platform 2025.1+ |
| [Monokai Pro (Filter Ristretto) Colors](monokai-plugin) | `monokai-plugin` | Tema Monokai Pro Filter Ristretto con variantes para la nueva **Islands UI** y clásica, más el esquema de colores del editor. Sin iconos y sin paywall. | IntelliJ Platform 2025.2.3+ (Islands: 2025.3+) |

## Construir un plugin

Cada plugin se compila por separado desde su carpeta (requiere JDK 21):

```powershell
cd material-icon-files-plugin
.\gradlew.bat buildPlugin
```

El ZIP instalable aparece en `build/distributions/`. Instalación: **Settings → Plugins → ⚙ → Install Plugin from Disk…**.

## Autor

**Angel Mario Roque Suárez** · [github.com/Angel-Mario](https://github.com/Angel-Mario)

Licencias: cada plugin incluye la suya en su carpeta (MIT); el resumen raíz está en `LICENSE`.
