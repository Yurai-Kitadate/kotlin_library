fun least_common_multiple(A: List<Long>):Long{
    var B = A
    var res = B[0]
    for (i in 1..B.size - 1){
        var GCD:Long = gcd(res,A[i])
        res *= A[i]
        res /= GCD
    }
    return res
}
fun gcd(a: Long, b: Long):Long{
    var zero:Long = 0
    if (b == zero){
        return a
    }
    else{
        return gcd(b, a % b)
    }
}
