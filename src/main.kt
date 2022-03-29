fun main(){
var x = sum(7,9,10)
    println(x)
    var y = multiply(6,9,5)
    println(y)
    subtraction(2022,1999)
}
fun sum(a: Int, b: Int, c:Int): Int{
var add = a + b + c
    return add
}
fun multiply(num1: Int, num2: Int, num3: Int): Int{
    var mult = num1 * num2 * num3
    return mult

}
fun subtraction(year: Int, year1: Int ){
    var sub = year - year1
    println(sub)
    println("We are " + sub + " years old")

}





