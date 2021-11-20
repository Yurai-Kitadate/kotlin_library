fun bucket_sort(a:IntArray,n:Int):IntArray{
    var bucket = IntArray(n + 1)
    for (i in 0..a.size-1){
        backet[a[i]] += 1
    }
    var res = IntArray(a.size)
    var cnt = 0
    for (i in 0..n){
        while (true){
            if (bucket[i] == 0){
                break
            }
            bucket[i] -= 1
            res[cnt] = i
            cnt += 1

        }
    }
    return res
}
