# Gradle custom task example

I've created a custom gradle task in
`buildSrc/src/main/kotlin/com/pablito/HelloTask.kt`, and registered it in
`build.gradle.kts`. According to what I've read gradle should find the
`buildSrc` folder automatically and be able to run the task class when invoked
from the command line, but it's not working for some reason...

Run the task with:

```
> ./gradlew sayHello
```

It doesn't work 😕
