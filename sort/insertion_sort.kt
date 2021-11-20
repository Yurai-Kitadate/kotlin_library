typealias ls<K> = MutableList<K>
fun ls_Int():MutableList<Int>{
    return mutableListOf<Int>()
}
fun insertion_sort(a:ls<Int>){
    for (i in 0..a.size - 1){
        var v = a[i]
        var j = i - 1
        while (j >= 0 && a[j] > v){
            a[j + 1] = a[j]
            j -= 1
        }
        a[j + 1] = v
    }
}
