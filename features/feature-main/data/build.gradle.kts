plugins {
    // Library
    id(libs.plugins.agp.library.get().pluginId)

    // Kapt
    id("kotlin-kapt")

    // Kotlin
    id(libs.plugins.kotlin.gradle.get().pluginId)

}

android {
    compileSdk = config.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = config.versions.minSdk.get().toInt()
        targetSdk = config.versions.targetSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = options.versions.kotlinJvmTargetOptions.get()
    }
}

dependencies {
    implementation(project(":core"))
    api(project(":features:feature-main:domain"))


    // Room
    api(libs.bundles.room)
    kapt(libs.room.compiler)
}