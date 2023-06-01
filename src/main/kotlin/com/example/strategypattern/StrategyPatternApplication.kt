package com.example.strategypattern

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StrategyPatternApplication

fun main(args: Array<String>) {
    runApplication<StrategyPatternApplication>(*args)


    val unsortedArray = intArrayOf(23, 5, 6, -9, 20, 10, 43, 26, -80, 45, 2, 5, 21, 11, 63)

    // dirty code call
    sortArrayWithIf(unsortedArray, SortingAlgorithm.BUBBLE)
    sortArrayWithSwitch(unsortedArray, SortingAlgorithm.INSERTION)

    // Clean code call
    val bubbleSort = BubbleSortStrategy()
    val bubbleSortContext = SortContext(bubbleSort)
    bubbleSortContext.sortArray(unsortedArray)

    val insertionSort = InsertionSortStrategy()
    val insertionSortContext = SortContext(insertionSort)
    insertionSortContext.sortArray(unsortedArray)

}
