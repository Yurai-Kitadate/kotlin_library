fun n_to_10(A:String,N:Long):Long{
    var now :Long = 1
    var res :Long = 0
    for (i in 0..A.length - 1){
        res += now * (A[A.length - i - 1] - '0')
        now *= N
    }
    return res
}
