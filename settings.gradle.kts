pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()

        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("tim-berta")
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "GeekMusic"
include(":app", ":common", ":core", ":feature-main")
enableFeaturePreview("VERSION_CATALOGS")