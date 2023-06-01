package com.example.strategypattern

interface SortingStrategy {
    fun sort(array: IntArray)
}

class BubbleSortStrategy : SortingStrategy {
    override fun sort(array: IntArray) {
        println("Performing ${SortingAlgorithm.BUBBLE} sort on array with clean code")
    }
}

class SelectionSortStrategy : SortingStrategy {
    override fun sort(array: IntArray) {
        println("Performing ${SortingAlgorithm.SELECTION} sort on array with clean code")
    }
}

class InsertionSortStrategy : SortingStrategy {
    override fun sort(array: IntArray) {
        println("Performing ${SortingAlgorithm.INSERTION} sort on array with clean code")
    }
}

class SortContext(private val strategy: SortingStrategy) {
    fun sortArray(array: IntArray) {
        strategy.sort(array)
    }
}
