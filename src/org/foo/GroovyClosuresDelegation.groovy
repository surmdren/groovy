//3. Delegation strategy
//3.2.1. The meaning of this
// class Person {
//     String name
//     int age
//     String toString() { "$name is $age years old" }

//     String dump() {
//         def cl = {
//             String msg = this.toString()               
//             println msg
//             msg
//         }
//         cl()
//     }
// }
// class NestedClosures {
//     void run() {
//         def nestedClosures = {
//             def cl = { owner }                               
//             cl()
//         }
//         assert nestedClosures() == nestedClosures            
//     }
// }

// def p = new NestedClosures()
// def p = new Person(name:'Janice', age:74)
// assert p.dump() == 'Janice is 74 years old'

//3.2.2. Owner of a closure
// class Enclosing {
//     void run() {
//         def whatIsOwnerMethod = { getOwner() }               
//         assert whatIsOwnerMethod() == this                   
//         def whatIsOwner = { owner }                          
//         assert whatIsOwner() == this                         
//     }
// }
// class EnclosedInInnerClass {
//     class Inner {
//         Closure cl = { owner }                               
//     }
//     void run() {
//         def inner = new Inner()
//         assert inner.cl() == inner                           
//     }
// }
// class NestedClosures {
//     void run() {
//         def nestedClosures = {
//             def cl = { owner }                               
//             cl()
//         }
//         assert nestedClosures() == nestedClosures            
//     }
// }
//3.2.3. Delegate of a closure
// class Enclosing {
//     void run() {
//         def cl = { getDelegate() }                          
//         def cl2 = { delegate }                              
//         assert cl() == cl2()                                
//         assert cl() == this                                 
//         def enclosed = {
//             { -> delegate }.call()                          
//         }
//         assert enclosed() == enclosed                       
//     }
//3.2.4. Delegation strategy
// class Person {
//     String name
//     def pretty = { "My name is $name" }             
//     String toString() {
//         pretty()
//     }
// }
// class Thing {
//     String name                                     
// }

// def p = new Person(name: 'Sarah')
// def t = new Thing(name: 'Teapot')

// assert p.toString() == 'My name is Sarah'           
// p.pretty.delegate = t                               
// assert p.toString() == 'My name is Sarah'
// p.pretty.resolveStrategy = Closure.DELEGATE_FIRST
// assert p.toString() == 'My name is Teapot'
class Person {
    String name
    int age
    def fetchAge = { age }
}
class Thing {
    String name
}

def p = new Person(name:'Jessica', age:42)
def t = new Thing(name:'Printer')
def cl = p.fetchAge
cl.delegate = p
assert cl() == 42
cl.delegate = t
assert cl() == 42
cl.resolveStrategy = Closure.DELEGATE_ONLY
cl.delegate = p
assert cl() == 42
cl.delegate = t
try {
    cl()
    assert false
} catch (MissingPropertyException ex) {
    // "age" is not defined on the delegate
}