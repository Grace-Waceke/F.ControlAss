fun main(){
    oddNums()
    println(girls(arrayOf("marywambui", "caroline", "grace","nkimalantoi")))
    drinks(3)
    drinks(13)
    drinks(20)
    myNum()

}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNums(){
    for(p in 1..100){
        if(p %2 !==0){
            println(p)
        }
    }
}
fun girls(names:Array<String>):Int{
    var key=0
    names.forEach{ lol->
        if (lol.length > 5){
            key++
        }
    }
    return key
}
fun drinks(age:Int){
    if (age<=6 ){
        println("a glass of milk")
    }
    else if (age>6 && age<15){
        println("fanta")
    }
    else{
        println("cocacola")
    }
}
fun myNum() {
    for (x in 1..100){
        if (x%3==0){
            println("Fizz")
        }
        else if (x%5==0){
            println("Buzz")
        }
        if (x%3==0 || x%5==0){
            println("FizzBuzz")
        }
    }
}
