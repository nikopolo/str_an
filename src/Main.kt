
fun main() {
    var from = "E2"
    var where = "E4"
    var count = 1
    var lineToSend = "$from-$where;$count"
    println(lineToSend)
    from = "D2"
    where = "D3"
    count++
    lineToSend = "$from-$where;$count"
    println(lineToSend)
}