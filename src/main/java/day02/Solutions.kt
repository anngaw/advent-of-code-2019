package day02

import java.io.File
import java.lang.IllegalStateException

fun solve1(input: List<Int>, noun: Int, verb: Int): Int {
    val nums = input.toMutableList().apply { this[1] = noun; this[2] = verb }
    var x = 0
    while (nums[x] != 99) {
        nums[nums[x + 3]] = when {
            nums[x] == 1 -> nums[nums[x + 1]] + nums[nums[x + 2]]
            nums[x] == 2 -> nums[nums[x + 1]] * nums[nums[x + 2]]
            else -> throw RuntimeException("Unexpected opcode ${nums[x]}")
        }
        x += 4
    }
    return nums[0]
}

fun solve2(input: List<Int>, output: Int): Int {
    (0..100).forEach { i ->
        (0..100).forEach { j ->
            if (solve1(input, i, j) == output) {
                return i * 100 + j
            }
        }
    }
    throw IllegalStateException("No input matches.")
}

fun main() {
    val input = File("src/main/java/day02/input1.txt").readText().split(",").map { it.toInt() }
    println(solve1(input, 12, 2)) // 3654868
    println(solve2(input, 19690720)) // 7014
}
