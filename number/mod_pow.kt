fun mod_pow(x:Long,n:Long,p: Long): Long{
    var ans:Long = 1
    var X: Long = x
    var N: Long = n
    while (N >= 1.toLong()){
        if (N % 2 == 1.toLong()){
            ans *= X
            ans = ans % p
        }
        X *= X
        X = X % p
        N = N / 2
    }
    return ans
}
//デカイ値を3つ目の引数を入れれば普通のpow
