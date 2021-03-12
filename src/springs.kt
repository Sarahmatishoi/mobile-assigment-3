fun main(){
 printName()
    var greet=composed("sarah",20)
 println(greet)
    var apple=joy("length")
    println(apple)
    var guess= index("wato")
    println(guess)


}

fun printName(){
    var name="akirachix"
    var a=(name[0])
    var b=(name[2])
    var c=(name[3])
    println("$a$b$c")
}
fun composed(name:String,age:Int):String{
    var greet=("Hi,my name is " + name +" I am " + age +" years old ")
    return(greet)
}
fun joy(text:String):Int{
    var apple=text.length
    return(apple)
}
fun index(name:String){

    if(name=="PAPAI"){
        println("That's me")
    }
    else{
        println("I don't know who that is")

    }
}