package org.example

fun RangeData(list: List<Int>) : Int {
    var resultRange = 0
    if(list.size == 3){
        val sorted = list.sorted()
        resultRange = sorted[2] - sorted[0]
    }
    return resultRange
}