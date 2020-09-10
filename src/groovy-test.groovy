class GroovyTut {

    static void main(String[] args) {
        println('Hello World!')

        int x = 7;
        println(x);

// Groovy-Loops
        for (int y = 0; y <= 5; y ++){
            println(y);
        }

        0.upto(5) {println "$it"};
        
        
        5.times{println "$it"}

        0.step(7,2){println "$it"}

// Groovy-List
        def list = ["Guru99", "is", "Best", "for", "Groovy"]  
        println(list);
        list.add("Learning");
        println(list.contains("is"));
    }

// Groovy-Maps
        def y = [fName:'Jen', lName:'Cruise', sex:'F']
        print y.get("fName")

}


