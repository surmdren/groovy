class GroovyClosures {
    static void main (String[] args) {
        println('Hello World!')
        //1. Syntax
        //1.1. Defining a closure & 1.2. Closures as an object & 1.3. Calling a closure
        def listener = { e -> println "Clicked on $e.source" }      
        assert listener instanceof Closure
        Closure callback = { println 'Done!' }                      
        Closure<Boolean> isTextFile = {
            File it -> it.name.endsWith('.txt')                     
        }

        def code = { 123 }
        assert code() == 123

        //2. Parameters
        //2.1. Normal parameters
        def closureWithOneArg = { str -> str.toUpperCase() }
        assert closureWithOneArg('groovy') == 'GROOVY'

        def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
        assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'

        def closureWithTwoArgs = { a,b -> a+b }
        assert closureWithTwoArgs(1,2) == 3

        def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a+b }
        assert closureWithTwoArgsAndExplicitTypes(1,2) == 3

        def closureWithTwoArgsAndOptionalTypes = { a, int b -> a+b }
        assert closureWithTwoArgsAndOptionalTypes(1,2) == 3

        def closureWithTwoArgAndDefaultValue = { int a, int b=2 -> a+b }
        assert closureWithTwoArgAndDefaultValue(1) == 3
        
        //2.2. Implicit parameter
        def greeting = { "Hello, $it!" }
        assert greeting('Patrick') == 'Hello, Patrick!'

        //2.3. Varargs
        def concat1 = { String... args1 -> args1.join('') }
        assert concat1('abc','def') == 'abcdef'
        // def concat2 = { String[] args -> args.join('') }
        // assert concat2('abc', 'def') == 'abcdef'

        // def multiConcat = { int n, String... args ->                
        //     args.join('')*n
        // }
        // assert multiConcat(2, 'abc','def') == 'abcdefabcdef'

        //3. Delegation strategy
        // class Enclosing {
        //     void run() {
        //         def whatIsThisObject = { getThisObject() }          
        //         assert whatIsThisObject() == this                   
        //         def whatIsThis = { this }                           
        //         assert whatIsThis() == this                         
        //     }
        // }
        // class EnclosedInInnerClass {
        //     class Inner {
        //         Closure cl = { this }                               
        //     }
        //     void run() {
        //         def inner = new Inner()
        //         assert inner.cl() == inner                          
        //     }
        // }
        // class NestedClosures {
        //     void run() {
        //         def nestedClosures = {
        //             def cl = { this }                               
        //             cl()
        //         }
        //         assert nestedClosures() == this                     
        //     }
        // }

    }
}