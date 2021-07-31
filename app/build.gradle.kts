plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Constants.COMPILE_SDK
    buildToolsVersion = Constants.BUILD_TOOLS_VERSION

    defaultConfig {
        applicationId = Constants.APPLICATION_ID
        minSdk = Constants.MIN_SDK
        targetSdk = Constants.TARGET_SDK
        versionCode = Constants.VERSION_CODE
        versionName = Constants.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = Versions.JAVA_VERSION
        targetCompatibility = Versions.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = Versions.JVM_TARGET
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
}

dependencies {
    implementation(Dependencies.ANDROIDX_CORE)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.LIFECYCLE)
    Dependencies.COMPOSE.forEach { implementation(it) }

    implementation(Dependencies.HILT)
    kapt(Dependencies.HILT_COMPILER)
    kapt(Dependencies.HILT_ANDROID_COMPILER)
    implementation(Dependencies.COROUTINES)

    implementation(platform(Dependencies.OKHTTP_BOM))
    Dependencies.OKHTTP.forEach { implementation(it) }
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.COIL)

    testImplementation(Dependencies.JUNIT)
    androidTestImplementation(Dependencies.ANDROID_JUNIT)
    androidTestImplementation(Dependencies.ESPRESSO)
}