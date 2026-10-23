# Monokai Pro (Filter Ristretto) Colors

Tema **Monokai Pro (Filter Ristretto)** para IntelliJ IDEA, Rider, PyCharm, WebStorm y cualquier IDE basado en IntelliJ Platform. Es el tema con el que trabajo a diario y lo comparto sin restricciones: **no está detrás de ningún paywall**.

![Monokai Pro (Filter Ristretto)](images/monokai-pro-ristretto-small.png)

## Variantes incluidas

- **Monokai Pro (Filter Ristretto) - Islands**: adapta fondos, pestañas y separaciones a la nueva **Islands UI** de JetBrains.
- **Monokai Pro (Filter Ristretto) - Sin Islands**: conserva el estilo clásico basado en Darcula.

Ambas incluyen el esquema de colores del editor (sintaxis) en **Settings → Editor → Color Scheme → Monokai Pro (Filter Ristretto)**.

## Qué NO hace

- No incluye iconos ni los reemplaza ni cambia su paleta: puedes mantener instalado tu plugin de iconos de archivos y carpetas sin conflictos.
- No instala keymaps, acciones ni otro tipo de extensiones.

## Compatibilidad

- IntelliJ Platform **2025.2.3** o superior (`sinceBuild = 252.26830`).
- Funciona en todos los IDE basados en la plataforma (solo depende de `com.intellij.modules.platform`).
- La variante Islands requiere una build del IDE que incluya la Islands UI (2025.3+).

## Instalar

Requiere JDK 21 para compilar. Genera el plugin:

```powershell
.\gradlew.bat buildPlugin
```

Instala `build/distributions/monokai-pro-ristretto-colors-1.0.0.zip` desde **Settings → Plugins → ⚙ → Install Plugin from Disk…**, y elige la variante que prefieras en **Settings → Appearance & Behavior → Appearance & UI → Theme**.

## Estructura del proyecto

```
src/main/resources/monokai-ristretto.theme.json         Tema Islands
src/main/resources/monokai-ristretto-classic.theme.json Tema clásico (Darcula)
src/main/resources/schemes/ristretto.xml                Esquema de colores del editor
src/main/resources/META-INF/plugin.xml                  Registro del plugin
images                                                  Captura del tema
```

## Créditos

Plugin de **Angel Mario Roque Suárez** · [github.com/Angel-Mario](https://github.com/Angel-Mario).

La paleta y la adaptación a JetBrains se basan en el proyecto comunitario [Subtheme Monokai Pro](https://github.com/espositocode/monokai-pro). Monokai Pro es una marca de sus titulares; esta es una adaptación no oficial de Filter Ristretto, sin afiliación con Subtheme. Licencia MIT (`LICENSE`).
