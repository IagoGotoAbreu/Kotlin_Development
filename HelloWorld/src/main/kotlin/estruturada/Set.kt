package estruturada

import kotlin.system.measureNanoTime

fun main() {
    val hashSet = hashSetOf<Int>(1, 2, 3, 4) // HashSet
    val sortedSet = sortedSetOf<Int>(1, 2, 3, 4) // TreeSet
    val linkedSet = linkedSetOf<Int>(1, 2, 3, 4) // Linked HashSet
    val mutableList = mutableListOf<Int>(1, 2, 3, 4) // Linked HashSet

    // ============================== Comportamento ==============================
    hashSet.add(5) // Elemento que não existe
    hashSet.add(3)
    printAllElements(hashSet)
    sortedSet.add(5) // Elemento que não existe
    sortedSet.add(3)
    printAllElements(hashSet)
    linkedSet.add(5) // Elemento que não existe
    linkedSet.add(3)
    printAllElements(hashSet)

    mutableList.add(5)
    mutableList.add(3)
    printAllElements(mutableList)
    // ===============================================================================
    val hashSet2 = hashSetOf("Iago", "Goto", "Abreu") // HashSet
    val sortedSet2 = sortedSetOf("Iago", "Goto", "Abreu") // TreeSet
    val linkedSet2 = linkedSetOf("Iago", "Goto", "Abreu") // Linked HashSet
    hashSet2.add("Teste")
    println(hashSet2.elementAt(2))
    sortedSet2.add("Teste")
    println(sortedSet2.elementAt(3))
    linkedSet2.add("Teste")
    println(linkedSet2.elementAt(3))
    // ============================== Teste Performance ==============================

    val hashSet3 = hashSetOf<Int>() // HashSet
    val sortedSet3 = sortedSetOf<Int>() // TreeSet
    val linkedSet3 = linkedSetOf<Int>() // Linked HashSet

    val timeHashSet = measureNanoTime {
        for (i in 0..10000){
            hashSet3.add(i)
        }
    }
    val timeSortedSet = measureNanoTime {
        for (i in 0..10000){
            sortedSet3.add(i)
        }
    }
    val timeLinkedSet3 = measureNanoTime {
        for (i in 0..10000){
            linkedSet3.add(i)
        }
    }
    println(timeHashSet)
    println(timeSortedSet)
    println(timeLinkedSet3)
}

fun printAllElements(set: Set<Int>){
    println(set.joinToString(", "))
}

fun printAllElements(set: List<Int>){
    println(set.joinToString(", "))
}