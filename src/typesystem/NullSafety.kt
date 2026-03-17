package typesystem

import com.sun.tools.javac.tree.TreeInfo.fullName

val name: String = "Kotlin"
val firstName: String = "Yeldar"
val nullName: String? = null

fun main() {
    showNameLength(nullName)
}

fun showNameLength(name: String?) {
    println(name?.length ?: "name is empty")
}