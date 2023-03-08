import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val words = input.nextLine().split(" ")
    val result = longestCommonSubstring(words)
    println(result)
}

fun longestCommonSubstring(words: List<String>): String {
    val first = words[0]
    val n = words.size
    val len = first.length
    var longest = ""

    for (i in 0 until len) {
        for (j in i + 1 .. len) {
            val substring = first.substring(i, j)
            var k = 1
            while (k < n && words[k].contains(substring)) {
                k++
            }
            if (k == n && substring.length > longest.length) {
                longest = substring
            } else if (k == n && substring.length == longest.length) {
                if (substring < longest) {
                    longest = substring
                }
            }
        }
    }

    return longest
}
