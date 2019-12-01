import java.io.File

fun main(args: Array<String>) {
    val input = File("src/day01/input1.txt").readLines().map { it.toInt() }

    println(input.map { x -> (x / 3) - 2 }.sum()) // 3327415
    println(input.map { x -> reduce((x / 3) - 2) }.sum()) // 4988257
}

fun reduce(x: Int): Int = if (x < 0) 0 else x + reduce((x / 3) - 2)