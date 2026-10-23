plugins {
    id("org.jetbrains.intellij.platform") version "2.5.0"
}

group = "com.angelmario"
version = "1.0.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        create("IU", "2025.3")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "252.26830"
        }
        changeNotes = "Monokai Pro Filter Ristretto color theme, without icon replacements."
    }
}
