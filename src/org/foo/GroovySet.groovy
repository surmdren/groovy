// Set
// class Test {
//     static main(args) {
//         Set stringSet = ["apple", "apple", "banana", "banana"]
//         println "size = ${stringSet.size()}"
//         stringSet.each {
//             println it
//         }
//     }
// }

// toSet()
// class Test {
//     static main(args) {
//         def myCollection = ["apple", "apple", "banana", "banana"]
//         println "collection size = ${myCollection.size()}"
//         def mySet = myCollection.toSet()
//         println "set size = ${mySet.size()}"
//     }
// }

// as Set
// class Test {
//     static main(args) {
//         def myCollection = ["apple", "apple", "banana", "banana"]
//         def myFirstSet = myCollection as Set
//         def mySecondSet = ["apple", "apple", "banana", "banana"] as Set
//         println "first set size = ${myFirstSet.size()}"
//         println "second set size = ${mySecondSet.size()}"
//     }
// }

// Groovy Set Operations
// asImmutable()
// class Test {
//     static main(args) {
//         def myCollection = ["apple", "banana", "carrots"].toSet().asImmutable()
//         println "class: ${myCollection.getClass()}"
//         myCollection.add("Grapes")
//         println myCollection
//     }
// }

// asSynchronized()
// class Test {
//     static main(args) {
//         def myCollection = ["apple", "banana", "carrots"].toSet().asSynchronized() 
//         println "class: ${myCollection.getClass()}"
//     }
// }

// each
// class Test {
//     static main(args) {
//         Set mySet = ["apple", "banana", "carrots"]
//         mySet.each { item ->
//             println item
//         }
//     }
// }

// eachWithIndex
// class Test {
//     static main(args) {
//         Set mySet = ["apple", "banana", "carrots"]
//         mySet.eachWithIndex{ item, idx ->
//             println "Index # ${idx} is: ${item}"
//         }
//     }
// }

// findAll
// class Test {
//     static main(args) {
//         Set mySet = ["apple", "banana", "carrots"]
//         println mySet.findAll {it.contains("s")}
//     }
// }

// flatten()
// class Test {
//     static main(args) {
//         Set mySet = [["apple", "banana"], "carrots", ["egg", "guava"]]
//         println mySet
//         println mySet.flatten()
//     }
// }

// grep
// class Test {
//     static main(args) {
//         Set mySet = [10, 20, 0, false, true, '', 'test', [], null, ""]
//         println mySet.grep()
//     }
// }
// class Test {
//     static main(args) {
//         Set mySet = [10, 20, 0, false, true, 'hello', [1, 2], [3, 4], null, "world"]
//         println mySet.grep(Number)
//         println mySet.grep(String)
//         println mySet.grep(Boolean)
//         println mySet.grep(Collection)
//     }
// }
// class Test {
//     static main(args) {
//         Set mySet = ["apple", "banana", "carrots"]
//         println mySet.grep(~/b.+/)
//     }
// }
// class Test {
//     static main(args) {
//         Set mySet = ["apple", "banana", "carrots"]
//         println mySet.grep{it.contains("e")}
//     }
// }

// intersect
// class Test {
//     static main(args) {
//         Set firstSet = [1, 2, 3, 4, 5]
//         Set secondSet = [4, 5, 6, 7, 8]
//         println firstSet.intersect(secondSet)
//     }
// }

// leftShift
// class Test {
//     static main(args) {
//         Set mySet = [1, 2, 3, 4, 5]
//         mySet.leftShift(6)
//         mySet << 7
//         println mySet
//     }
// }

// minus
// class Test {
//     static main(args) {
//         Set mySet = [1, 2, 3, 4, 5]
//         println mySet.minus([4, 5])
//         println mySet - [1, 2]
//     }
// }

// plus
// class Test {
//     static main(args) {
//         Set mySet = [1, 2, 3, 4, 5]
//         println mySet.plus([6, 7])
//         println mySet + [9, 10]
//     }
// }

// split
// class Test {
//     static main(args) {
//         Set mySet = [1000, 2000, 3000, 4000, 5000, 6000]
//         println mySet.split{it> 3000}
//     }
// }