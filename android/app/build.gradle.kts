plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.money_mate"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.money_mate"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    
    flavorDimensions += "default"
    productFlavors {
        create("production") {
            dimension = "default"
            resValue(
                type="string", 
                name="app_name", 
                value="Money Mate Production"
            )
        }
        create("development") {
            dimension = "default"
            // applicationIdSuffix = ".dev"
            resValue(
                type="string", 
                name="app_name", 
                value="Money Mate Development"
            )
        }
    }
}

flutter {
    source = "../.."
}
