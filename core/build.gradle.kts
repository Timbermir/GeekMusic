plugins {
    // Android Library
    id(libs.plugins.agp.library.get().pluginId)

    // Kotlin
    id(libs.plugins.kotlin.gradle.get().pluginId)

    // Kapt
    id("kotlin-kapt")

    // Navigation SafeArgs
    id(libs.plugins.navigation.safeArgs.get().pluginId)
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
        getByName(config.versions.releaseBuildType.get()) {
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    api(project(":common"))


    // OkHttp
    api(libs.bundles.okHttp)

    // Retrofit
    api(libs.bundles.retrofit)

    // Paging 3
    api(libs.paging.paging)
}