# Gradle/Kotlin custom task example

A simple example of a custom gradle task created in the `buildSrc` module, using
the Kotlin DSL for the build script.

The task is created as a class in
`buildSrc/src/main/kotlin/blabla/HelloTask.kt`:

```kotlin
abstract class HelloTask : DefaultTask() {
    @TaskAction
    fun sayHello() {
        println("hello from the hello task")
    }
}
```

Gradle automatically adds compiled classed from `buildSrc` into the classpath of
the build script, so it can be registered in `build.gradle.kts` like this:

```kotlin
import blabla.HelloTask

tasks.register<HelloTask>("sayHello")
```

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

(Thanks to ephemient on Gradle Slack)

Run the task with:

```shell
> ./gradlew sayHello
```
