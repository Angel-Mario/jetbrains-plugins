# Material File Icons Only

Plugin para IntelliJ IDEA y cualquier IDE basado en IntelliJ Platform (PyCharm, WebStorm, GoLand, CLion, Rider, DataGrip, etc.) que aplica los iconos de **Material Icon Theme** a todos los archivos y carpetas del proyecto.

## ¿Qué hace?

- Registra un `FileIconProvider` y un `FileIconPatcher`, por lo que sustituye los iconos de **todos** los ficheros y carpetas en la vista de proyecto, pestañas y donde la plataforma los muestre.
- Reconoce carpetas abiertas/cerradas, carpetas raíz del proyecto y proyectos multi-módulo.
- Iconos distintos para tema claro y oscuro, escalados a 16px para verse nítidos.
- **No** instala un tema visual ni un esquema de colores.
- **No** toca los iconos del toolbar, de las tool windows ni del resto del IDE: solo archivadores y archivos.

La razón de este plugin: el plugin existente de Material Icons en JetBrains no sustituía todos los iconos de ficheros y cambiaba los iconos del toolbar, lo que no me gustaba. Este se limita exclusivamente a archivos y carpetas.

## Compatibilidad

- IntelliJ Platform **2025.1** o superior (`sinceBuild = 251`).
- Cualquier IDE basado en la plataforma (desde 2025.1 incluye IDEA, PyCharm, WebStorm, Rider, etc.).
- Solo depende de `com.intellij.modules.platform`, no de funcionalidades de ningún lenguaje.

## Compilar e instalar

Requiere JDK 21. Para crear el archivo instalable:

```bash
./gradlew buildPlugin
```

El ZIP se genera en `build/distributions/`. En el IDE, usa **Settings → Plugins → ⚙ → Install Plugin from Disk…** y selecciona ese ZIP.

Para abrir un IDE sandbox con el plugin cargado:

```bash
./gradlew runIde
```

## Estructura del proyecto

```
src/main/kotlin/com/angelmario/materialicons   Código Kotlin del provider/patcher
src/main/resources/META-INF                   plugin.xml y icono del plugin
assets/material-icons.json                    Asociaciones archivo → icono (formato VS Code)
assets/icons                                  SVGs del icon set
```

## Recursos y créditos

- Las asociaciones de nombres y extensiones, y las ilustraciones SVG provienen de [Material Icon Theme](https://github.com/material-extensions/vscode-material-icon-theme) (licencia MIT).
- La integración con la plataforma JetBrains parte de la idea original de cweijan; esta versión añade el `FileIconPatcher`, carpetas expandidas, soporte de tema claro y reemplazo completo de ficheros.

Plugin de **Angel Mario Roque Suárez** · [github.com/Angel-Mario](https://github.com/Angel-Mario) · Licencia MIT (`LICENSE`).
