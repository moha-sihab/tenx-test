package org.example

fun main(){
    val threshold = 38
    val lowerLimit = 50
    val dataColorRGB = DataColorRGB2()
    val colorfulColor : MutableList<ItemRGB> = mutableListOf()
    val blackWhiteColor : MutableList<ItemRGB> = mutableListOf()
    var conclusion : String = ""

    dataColorRGB.itemRGB.forEach { itemRGB ->
        val rangeData = RangeData(itemRGB.colorRange)
        if(rangeData < threshold){
            blackWhiteColor.add(itemRGB)
        }
        else
        {
            val sorted = itemRGB.colorRange.sorted()
            if(sorted[2] <= lowerLimit)
            {
                blackWhiteColor.add(itemRGB)
            }
            else{
                colorfulColor.add(itemRGB)
            }
        }
    }

    if(colorfulColor.size > blackWhiteColor.size){
        val percentage = (colorfulColor.size / dataColorRGB.itemRGB.size) * 100
        conclusion = "colorful, percentage $percentage %"
    }else{
        val percentage = (blackWhiteColor.size / dataColorRGB.itemRGB.size) * 100
        conclusion = "black n white, percentage $percentage %"
    }

    println("==============================")
    println("======RESULT===========")
    println("==============================")
    println(conclusion)

}

fun DataColorRGB2() : ColorRGB {
    val colorRGB = ColorRGB(
        itemRGB = listOf(
            ItemRGB(listOf(87,76,63)),
            ItemRGB(listOf(67,76,73)),
            ItemRGB(listOf(99,105,93)),
            ItemRGB(listOf(178,173,169)),
            ItemRGB(listOf(48,35,46)),

            ItemRGB(listOf(22,20,18)),
            ItemRGB(listOf(10,40,50)),
            ItemRGB(listOf(67,76,73)),
            ItemRGB(listOf(173,166,167)),
            ItemRGB(listOf(87,76,63)),

            ItemRGB(listOf(10,40,50)),
            ItemRGB(listOf(99,105,93)),
            ItemRGB(listOf(178,173,169)),
            ItemRGB(listOf(67,76,73)),
            ItemRGB(listOf(22,20,18)),

            ItemRGB(listOf(22,20,18)),
            ItemRGB(listOf(87,76,63)),
            ItemRGB(listOf(140,132,139)),
            ItemRGB(listOf(87,76,63)),
            ItemRGB(listOf(99,105,93)),

            ItemRGB(listOf(99,105,93)),
            ItemRGB(listOf(87, 76, 63)),
            ItemRGB(listOf(67, 76, 73)),
            ItemRGB(listOf(173,166,167)),
            ItemRGB(listOf(48,35,46)),
        )
    )

    return colorRGB
}