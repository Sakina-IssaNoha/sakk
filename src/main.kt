fun main(){
    var name = "akirachix"
    var x = name[0].toString()+name[2]+name[3]
    println(x)

    var t =statement("Sakina",21)
    println(t)

    var h =city("Mombasa")
    println(h)

    var f = det("Sakina","Sakina")
    println(f)

}
fun statement(a:String,x:Int):String{
    var name = a
    var age = x
    var c = "Hi, my name is $a I am $x years old"
return c


}
fun city(text:String):Int{
    return text.length
}

fun det(nAme:String,w:String){
    if(nAme==w)
        println("That is me")

    else {
        println("I don't know her")
    }
    }

