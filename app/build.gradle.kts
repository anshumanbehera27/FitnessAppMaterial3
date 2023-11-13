


plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.fitpro"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fitpro"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = "19"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

//    def composeBom = platform("androidx.compose:compose-bom:2023.10.01")
//    implementation composeBom
//            androidTestImplementation composeBom

            // Choose one of the following:
            // Material Design 3
    implementation ("androidx.compose.material3:material3")


    // or skip Material Design and build directly on top of foundational components
    implementation ("androidx.compose.foundation:foundation")
    // or only import the main APIs for the underlying toolkit systems,
    // such as input and measurement/layout
    implementation ("androidx.compose.ui:ui")

    // Android Studio Preview support
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.foundation:foundation-layout-android:1.5.4")
    debugImplementation ("androidx.compose.ui:ui-tooling")

    // UI Tests
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")

    // Optional - Included automatically by material, only add when you need
    // the icons but not the material library (e.g. when using Material3 or a
    // custom design system based on Foundation)
    implementation ("androidx.compose.material:material-icons-core")
    // Optional - Add full set of material icons
    implementation ("androidx.compose.material:material-icons-extended")
    // Optional - Add window size utils
    implementation ("androidx.compose.material3:material3-window-size-class")

    // Optional - Integration with activities
    implementation ("androidx.activity:activity-compose:1.7.2")

    implementation ("androidx.compose.ui:ui:1.1.0-alpha01")
    implementation ("androidx.compose.foundation:foundation:1.1.0-alpha01")
    //implementation ("androidx.compose.material3:material:1.1.0-alpha01")
    implementation ("androidx.compose.ui:ui-tooling:1.1.0-alpha01")

    implementation("androidx.navigation:navigation-compose:2.7.4")


    // Other dependencies
    implementation ("androidx.appcompat:appcompat:1.4.0")
    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-alpha01")
    implementation ("com.google.android.material:material:1.5.0")
    implementation("androidx.compose.material3:material3:1.1.2")
    implementation("androidx.compose.material3:material3-window-size-class:1.1.2")
    implementation("androidx.compose.runtime:runtime:1.5.4")


}
