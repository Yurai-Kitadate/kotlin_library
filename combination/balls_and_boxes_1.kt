fun main(){
    var a = readLine()!!.split(" ").map{ it.toLong() }
    var n:Long = a[0]
    var k:Long = a[1]
    var res:Long = 1
    for (i in 0..n - 1){
        res *= k
        res %= 1000000007
    }
    println(res)
}
