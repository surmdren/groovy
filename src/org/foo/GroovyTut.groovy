class GroovyTut {

    static void main(String[] args) {
        println('Hello World!')

        int x = 7
        println(x)

        // Groovy-Loops
        for (int y = 0; y <= 5; y ++) {
            println(y)
        }

        0.upto(5) { println "$it" };

        5.times { println "$it" }

        0.step(7, 2) { println "$it" }

        // Groovy-List
        def list = ['Guru99', 'is', 'Best', 'for', 'Groovy']
        println(list)
        list.add('Learning')
        println(list.contains('is'))

        // Groovy-Maps
        def map = [fName:'Jen', lName:'Cruise', sex:'F']
        map.each { println "$it.key" }
        for (entry in map) {
            println "$entry.key"
        }
        map.each { key, val ->
            println "$key = $val"
        }
        map.eachWithIndex { entry, index ->
            def indent = ((index == 0 || index % 2 == 0) ? '   ' : '')
            println "$index Hex Code: $entry.key = Color Name: $entry.value"
        }

        // Groovy-closures
        // def myClosure = {
        //     println 'My First Closure'
        // }
        // myClosure()

        def m
        def myClosure = {
            a,b,c->
            m = a+b+c
            println m
        }
        myClosure(1,2,3)

        def sum = "The sum of 2 and 3 equals ${2 + 3}"
        assert sum.toString() == 'The sum of 2 and 3 equals 5'

        // @Field List awe = [1, 2, 3]
        // def awesum() { awe.sum() }
        // assert awesum() == 6
    }

}
