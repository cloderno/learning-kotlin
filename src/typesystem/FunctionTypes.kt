package typesystem

import kotlin.math.pow


val func: (Double) -> Double = {
    x -> x.pow(2.0)
}

fun getCurve(
    surface: (Double, Double) -> Int,
    x: Double
): (Double) -> Int {
    return { y -> surface(x,y) }
}

val surface = { x: Double, y: Double ->
    (x + y).toInt()
}

// val calc example:
// add, sum, sub, mult
const val predefinedNumber = 10

fun compute(
    op: (Int, Int) -> Double,
    y: Int
): (Int) -> Double {
    return { x -> op(x,y) }
}

val addition: (Int, Int) -> Double = { x, y -> (x + y).toDouble() }
val divide: (Int, Int) -> Double = { x, y -> (x / y).toDouble() }
val subtract: (Int, Int) -> Double = { x, y -> (x - y).toDouble() }
val multiply: (Int, Int) -> Double = { x, y -> (x * y).toDouble() }

fun main() {
    val addition5 = compute(addition, predefinedNumber)
    println(addition5(5))

    val multiply2 = compute(multiply, predefinedNumber)
    println(multiply2(5))
}
