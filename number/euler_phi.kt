fun euler_phi(a:Int):Int{
    var n= a
    var res= n
    var x= 2
    while (x*x <= n){
        if (n % x == 0){
            res = res / x * (x-1)
            while (n % x == 0){
                n /= x
            }
        }
        x += 1
    }
    if (n > 1){
        res = res / n * (n-1)
    }
    return res
}
