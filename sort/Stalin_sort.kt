typealias ls<K> = MutableList<K>
fun ls_Int():MutableList<Int>{
    return mutableListOf<Int>()
}
fun Stalin_sort(a:ls<Int>):ls<Int>{
    var res = ls_Int()
    var now = 0
    for (i in 0..a.size-1){
        if (now <= a[i]){
            now = a[i]
            res.add(a[i])
        }
    }
    return res
}
