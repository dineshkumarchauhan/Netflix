plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.daggerHilt)
    alias(libs.plugins.devtoolsKsp)
    alias (libs.plugins.kotlinParcelize)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.neatflix.demo"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.neatflix.demo"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
//    buildFeatures {
//        compose = true
//    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }
//    composeCompiler {
//        enableStrongSkippingMode = true
//    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.hilt.common)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.navigation)

    implementation(libs.splashscreen)
    implementation(libs.systemuicontroller)
    implementation (libs.navigation)
    implementation (libs.datastore)

    implementation (libs.pagingRuntime)
    implementation (libs.pagingCompose)
    implementation (libs.coilCompose)

    implementation (libs.roomRuntime)
    ksp (libs.roomCompiler)
    implementation (libs.roomKtx)

    implementation (libs.retrofit2)
    implementation (libs.retrofit2ConverterGson)

    implementation (libs.workRuntime)
    implementation (libs.runtimeLivedata)
    implementation (libs.accompanistPermissions)
    implementation (libs.hiltWork)
    implementation (libs.composeMaterial)
    implementation (libs.landscapisCoil)


    implementation (libs.timber)
    implementation (libs.stetho)
    implementation (libs.stethoOkhttp)
    implementation (libs.lottieCompose)

    implementation (libs.destinationsCore)
    ksp (libs.destinationsKsp)

    implementation(platform(libs.okhttpBom))
    implementation(libs.okhttp)
    implementation(libs.okhttpInterceptor)

    implementation (libs.materialIconsExtended)
    implementation (libs.constraintlayout)
}