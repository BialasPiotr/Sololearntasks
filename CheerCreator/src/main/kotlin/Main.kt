fun main() {
    print("Enter the number of yards your team moved forward: ")
    val yards = readLine()?.toIntOrNull() ?: 0

    when {
        yards > 10 -> println("High Five")
        yards < 1 -> println("shh")
        else -> {
            val raString = "Ra!".repeat(yards)
            println(raString)
        }
    }
}
