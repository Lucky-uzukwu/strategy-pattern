package com.example.strategypattern


// if statement example
fun sortArrayWithIf(array: IntArray, algorithm: SortingAlgorithm): IntArray {
    if (algorithm == SortingAlgorithm.BUBBLE) {
        println("Performing ${SortingAlgorithm.BUBBLE} sort on array with dirty code")
    } else if (algorithm == SortingAlgorithm.SELECTION) {
        println("Performing ${SortingAlgorithm.SELECTION} sort on array with dirty code")
    } else if (algorithm == SortingAlgorithm.INSERTION) {
        println("Performing ${SortingAlgorithm.INSERTION} sort on array with dirty code")
    } else {
        println("Invalid sorting algorithm with dirty code")
    }

    return array
}

fun sortArrayWithSwitch(array: IntArray, algorithm: SortingAlgorithm): IntArray {

    when (algorithm) {
        SortingAlgorithm.BUBBLE -> println("Performing ${SortingAlgorithm.BUBBLE} sort on array with dirty code")
        SortingAlgorithm.SELECTION -> println("Performing ${SortingAlgorithm.SELECTION} sort on array with dirty code")
        SortingAlgorithm.INSERTION -> println("Performing ${SortingAlgorithm.INSERTION} sort on array with dirty code")
        else -> println("Invalid sorting algorithm with dirty code")
    }
    return array
}


enum class SortingAlgorithm {
    BUBBLE,
    SELECTION,
    INSERTION
}
