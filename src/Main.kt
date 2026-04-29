
fun main() {
    val userTurn = "D2-D4;0"
    val inputParse = userTurn.split("-", ";")
    val from = inputParse[0]
    println(from)
    val where = inputParse[1]
    println(where)
    val count = inputParse[2]
    println(count)
}