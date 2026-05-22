import com.android.build.api.dsl.LibraryExtension

plugins {
    id("com.android.library")
}

group = "in.lazymanstudios.uri_to_file"
version = "1.0"

repositories {
    google()
    mavenCentral()
}

extensions.configure<LibraryExtension>("android") {

    namespace = "in.lazymanstudios.uri_to_file"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

