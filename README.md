# Gradle/Kotlin custom task example

A simple example of a custom gradle task created in the `buildSrc` module, 
using the Kotlin DSL for the build script.

The trick to get this working, that I couldn't find anywhere online, is this 
in `buildSrc/build.gradle.kts`:

```kotlin
plugins {
    `embedded-kotlin`
}

repositories {
    mavenCentral()
}
```

Run the task with:

```shell
> ./gradlew sayHello
```