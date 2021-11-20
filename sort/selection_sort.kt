typealias ls<K> = MutableList<K>
fun ls_Int():MutableList<Int>{
    return mutableListOf<Int>()
}
fun selection_sort(a:ls<Int>){
    for (i in 0..a.size - 1){
        var minj = i
        for (j in i..a.size - 1){
            if (a[j] < a[minj]){
                minj = j
            }
        }
        var temp = a[i]
        a[i] = a[minj]
        a[minj] = temp
    }
}
