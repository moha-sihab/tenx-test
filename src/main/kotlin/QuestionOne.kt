package org.example

fun main() {
    val threshold = 38
    val lowerLimit =50

    val dataColorRGB = DataColorRGB()
    val acceptedColor : MutableList<ItemRGB> = mutableListOf()
    val rejectedColor : MutableList<ItemRGB> = mutableListOf()
    dataColorRGB.itemRGB.forEach { itemRGB ->
        val rangeData = RangeDate(itemRGB.colorRange)
        if(rangeData < threshold){
            rejectedColor.add(itemRGB)
        }
        else
        {
            val sorted = itemRGB.colorRange.sorted()
            if(sorted[2] <= lowerLimit)
            {
                rejectedColor.add(itemRGB)
            }
            else{
                acceptedColor.add(itemRGB)
            }
        }
    }

    println("Accepted Color")
    println(acceptedColor.joinToString { "${it.colorRange} \n" })
    println("======================================")
    println("======================================")
    println("Rejected Color")
    println(rejectedColor.joinToString { "${it.colorRange} \n" })

}

fun RangeDate(list: List<Int>) : Int {
    var resultRange = 0
    if(list.size == 3){
        val sorted = list.sorted()
        resultRange = sorted[2] - sorted[0]
    }
    return resultRange
}

fun DataColorRGB() : ColorRGB {
    val colorRGB = ColorRGB(
        itemRGB = listOf(
            ItemRGB(listOf(34,203,55)),
            ItemRGB(listOf(67,76,73)),
            ItemRGB(listOf(99,105,93)),
            ItemRGB(listOf(178,173,169)),
            ItemRGB(listOf(144,89,54)),

            ItemRGB(listOf(22,20,18)),
            ItemRGB(listOf(10,40,50)),
            ItemRGB(listOf(171,180,211)),
            ItemRGB(listOf(150,150,90)),
            ItemRGB(listOf(50,150,150)),

            ItemRGB(listOf(209,109,107)),
            ItemRGB(listOf(111,117,212)),
            ItemRGB(listOf(214,113,165)),
            ItemRGB(listOf(45,137,212)),
            ItemRGB(listOf(182,240,245)),

            ItemRGB(listOf(199,184,72)),
            ItemRGB(listOf(204,75,193)),
            ItemRGB(listOf(140,132,139)),
            ItemRGB(listOf(87,76,63)),
            ItemRGB(listOf(170,209,167)),

            ItemRGB(listOf(1,90,20)),
            ItemRGB(listOf(174,214,174)),
            ItemRGB(listOf(196,106,112)),
            ItemRGB(listOf(173,166,167)),
            ItemRGB(listOf(48,35,46)),
        )
    )

    return colorRGB
}

data class ColorRGB(
    val itemRGB : List<ItemRGB>
)

data class ItemRGB(
    val colorRange : List<Int>
)