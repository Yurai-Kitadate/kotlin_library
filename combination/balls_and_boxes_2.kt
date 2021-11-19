fun main(){
    var a = readLine()!!.split(" ").map{ it.toLong() }
    var n:Long = a[0]
    var k:Long = a[1]
    var res:Long = 1
    for (i in k downTo k - n + 1 step 1){
        res *= i.toLong()
        res %= 1000000007
    }
    println(res)
}
