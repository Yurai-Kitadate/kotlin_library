fun make_divisors(n:Int):MutableList<Int>{
    var lower_divisors = mutableListOf<Int>()
    var upper_divisors = mutableListOf<Int>()
    var i = 1
    while (i*i <= n){
        if (n % i == 0){
            lower_divisors.add(i)
            if (i != n / i){
                upper_divisors.add(n/i)
            }
        }
        i += 1
    }
    var res = mutableListOf<Int>()
    for (j in 0..lower_divisors.size-1){
        res.add(lower_divisors[j])
    }
    for (j in upper_divisors.size - 1 downTo 0 step 1){
        res.add(upper_divisors[j])
    }
    return res
}
