package day01
import java.io.File

fun solve1(input: List<Int>): Int = input.map { x -> (x / 3) - 2 }.sum()
fun solve2(input: List<Int>): Int = input.map { x -> reduce((x / 3) - 2) }.sum()

fun reduce(x: Int): Int = if (x < 0) 0 else x + reduce((x / 3) - 2)

fun main() {
    val input = File("src/main/java/day01/input1.txt").readLines().map { it.toInt() }

    println(solve1(input)) // 3327415
    println(solve2(input)) // 4988257
}
