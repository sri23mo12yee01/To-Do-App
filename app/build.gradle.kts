plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.to_docompose"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.to_docompose"
        minSdk = 25
        targetSdk = 34
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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/gradle/incremental.annotation.processors"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.lifecycle.runtime.ktx){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.activity.compose){
        exclude( "com.intellij","annotations")
    }
    implementation(platform(libs.androidx.compose.bom)){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.ui){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.ui.graphics){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.ui.tooling.preview){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.material3){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.room.compiler){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.room.common){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.room.ktx){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.hilt.android.compiler){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.hilt.android){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.datastore.preferences){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.navigation.compose){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.hilt.compiler){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.annotations){
        exclude( "com.intellij","annotations")
    }
    implementation(libs.androidx.compose.material)
    testImplementation(libs.junit){
        exclude( "com.intellij","annotations")
    }
    androidTestImplementation(libs.androidx.junit){
        exclude( "com.intellij","annotations")
    }
    androidTestImplementation(libs.androidx.espresso.core){
        exclude( "com.intellij","annotations")
    }
    androidTestImplementation(libs.androidx.ui.test.junit4){
        exclude( "com.intellij","annotations")
    }
    debugImplementation(libs.androidx.ui.tooling){
        exclude( "com.intellij","annotations")
    }
    debugImplementation(libs.androidx.ui.test.manifest){
        exclude( "com.intellij","annotations")
    }
}