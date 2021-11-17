var top:Int = 0
var S = Array<Int>(1000,{it * 0})
fun push(x:Int){
    S[++top] = x
}
fun pop():Int{
    top--
    return S[top + 1]
}
