package blabla

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class HelloTask : DefaultTask() {
    @TaskAction
    fun sayHello() {
        println("hello from the hello task")
    }
}
