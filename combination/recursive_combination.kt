public val long_zero:Long = 0
fun combination(n:Long,r:Long):Long{
    if (n == long_zero || r == n){
        return 1
    }
    else if (r == 1.toLong()){
        return n
    }
    return combination(n-1, r-1) + combination(n-1, r)
}
