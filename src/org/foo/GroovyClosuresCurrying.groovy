// //6.1. Currying
// //6.1.1. Left currying
// def nCopies = { int n, String str -> str*n }    
// def twice = nCopies.curry(2)                    
// assert twice('bla') == 'blabla'                 
// assert twice('bla') == nCopies(2, 'bla')

// //6.1.2. Right currying
// def nCopies = { int n, String str -> str*n }    
// def blah = nCopies.rcurry('bla')                
// assert blah(2) == 'blabla'                      
// assert blah(2) == nCopies(2, 'bla')             

// //6.1.3. Index based currying
// def volume = { double l, double w, double h -> l*w*h }      
// def fixedWidthVolume = volume.ncurry(1, 2d)                 
// assert volume(3d, 2d, 4d) == fixedWidthVolume(3d, 4d)       
// def fixedWidthAndHeight = volume.ncurry(1, 2d, 4d)          
// assert volume(3d, 2d, 4d) == fixedWidthAndHeight(3d)        

// //6.2. Memoization
// def fib
// fib = { long n -> n<2?n:fib(n-1)+fib(n-2) }
// assert fib(15) == 610 // slow!
// fib = { long n -> n<2?n:fib(n-1)+fib(n-2) }.memoize()
// assert fib(25) == 75025 // fast!

//6.3. Composition
def plus2  = { it + 2 }
def times3 = { it * 3 }

def times3plus2 = plus2 << times3
assert times3plus2(3) == 11
assert times3plus2(4) == plus2(times3(4))

def plus2times3 = times3 << plus2
assert plus2times3(3) == 15
assert plus2times3(5) == times3(plus2(5))

// reverse composition
assert times3plus2(3) == (times3 >> plus2)(3)