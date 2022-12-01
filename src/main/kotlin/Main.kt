
fun main() {
    val nList = mutableListOf(9, 33, 1, 94, 54)
   // println(nList)

    val nString = nList.toString()
   // println(nString)

    val nStr = nString is String
   // println(nStr)

    nList.forEach{i -> println(i)}


}