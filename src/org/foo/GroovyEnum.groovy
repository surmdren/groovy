// Groovy Declare Enum
enum MyColors{
  BLUE, RED, WHITE
}
println MyColors.values()

enum MyCoin{
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25)
    MyCoin(int value) {
        this.centValue = value
    }
    private final int centValue
    int getCentValue() {
        centValue
    }
    public String toString() {
        return name() + " = " + centValue
    }
}
println MyCoin.values()

// Groovy String to Enum
enum MyDays{
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6)
    MyDays(int value) {
        this.value = value
    }
    private final int value
    int getValue() {
        value
    }
}
String dayAsString = 'WEDNESDAY'
MyDays dayAsEnum = dayAsString as MyDays
println dayAsEnum
println dayAsEnum.value

// Groovy Loop Through Enum Values
enum MyShape{
    CIRCLE(0), TRIANGLE(3), SQUARE(4), PENTAGON(5)
    MyShape(int sides) {
        this.sides = sides
    }
    private final int sides
    int getSides() {
        sides
    }
}
for (sh in MyShape.values()) {
    println sh.name()
}

// Groovy Enum Next And Previous
enum MyFood {
    APPLE, BANANA, CARROT 
}
MyFood f = MyFood.APPLE
println "Food is ${f}"
println "Food is ${f.next()}"

enum MyFood {
    APPLE, BANANA, CARROT 
}
MyFood f = MyFood.APPLE
println "Food is ${f}"
println "Food is ${f.next()}"
println "Food is ${f.next().next()}"
println "Food is ${f.next().next().next()}"
println "Food is ${f.next().next().next().next()}"

// Groovy Enum MIN_VALUE and MAX_VALUE
// enum MyFriends {
//     ANDRE, BRENT, CAROL, DIANE, EULER 
// }
// println "Min value is: " + MyFriends.MIN_VALUE

enum MyFriends {
    ANDRE, BRENT, CAROL, DIANE, EULER 
}
println "Max value is: " + MyFriends.MAX_VALUE

// Groovy Enum in Range
enum MyTools {
    DRILL, HAMMER, KNIFE, PLIERS, SCREW_DRIVER, TABLE 
}
println MyTools.KNIFE..MyTools.TABLE