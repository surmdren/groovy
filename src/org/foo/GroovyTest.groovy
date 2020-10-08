// import groovy.transform.Field\
// import java.util.regex.Matcher
// @Field def lines4 = "a";

// void initVars(String pref){
//     println('init:'+lines4+'  '+pref)      //*3.init:a  b   *7.init:b  c
//     lines4 = pref;  
// }
// println("closure1")    ///1. closure1
// 1.times {
//     println(lines4)    ///2. a
//     initVars('b')      ///3. init:a  b
//     lines4 += 'p1'
//     println(lines4)    ///4. bp1
// }
// println("closure2")    ///5. closure2
// 1.times {
//     println(lines4)    ///6. bp1
//     initVars('c')      ///7. init:b  c
//     println(lines4)    ///8. bp1     Why not c
//     lines4 += 'q1'
//     println(lines4)    ///9. bp1q1   Why not cq1
// }

// import groovy.transform.Field
// @Field List awe = [1, 2, 3]
// @Field String STEP_NAME = getClass().getName()
// println STEP_NAME
// def awesum() { awe.sum() }
// assert awesum() == 6

// String a = 'Hello Single'; 
// String b = "Hello Double"; 
// String c = "'Hello Triple" + "Multiple lines'";

// println(a); 
// println(b); 
// println(c); 

// class User {
//     public final String name
//     public final String id
//     User(String name) { this.name = name}
//     String getName() { "Name: $name" }
// }
// def user = new User('Bob')
// def a = user?.id
// assert a == null
// assert user.name == 'Name: Bob'


// def text = "some text to match"
// def m = text =~ /match/
// assert m instanceof Matcher
// if (!m) {
//     throw new RuntimeException("Oops, text not found!")
// }

// void call test
// void call(Map parameters = [:]) {
//     println "Hello World!"
// }

// def foo() {
//     println "foo called"
// }

// def bar() {
//     println "bar called"
// }

// def woo( a, b ) {
//     println "Woo called with a=$a and b=$b"
// }

// private static main( args ) {
//     if( args ) {
//         "${args.head()}"( *args.tail() )
//     }
// }

// class DownloadCacheUtils {
//     static void main(String[] args) {
//         def foo = 1
//         println foo
//         if (!isEnabled(foo)){
//             println "true"
//         }
//     }
// }
