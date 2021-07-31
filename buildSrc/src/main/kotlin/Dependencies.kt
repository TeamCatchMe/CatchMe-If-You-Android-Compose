object Dependencies {
    val COMPOSE = listOf(
        "androidx.compose.ui:ui:${Versions.COMPOSE}",
        "androidx.compose.material:material:${Versions.COMPOSE}",
        "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}",
        "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}",
        "androidx.compose.animation:animation:${Versions.COMPOSE}",
        "androidx.compose.compiler:compiler:${Versions.COMPOSE}",
        "androidx.compose.foundation:foundation:${Versions.COMPOSE}",
        "androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE}",
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.COMPOSE_LIFECYCLE}",
        "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}",
        "androidx.hilt:hilt-navigation-compose:${Versions.COMPOSE_HILT_NAVIGATION}",
    )
    const val ANDROIDX_CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
    const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val HILT_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
}