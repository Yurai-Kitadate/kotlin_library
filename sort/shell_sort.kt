typealias ls<K> = MutableList<K>
fun ls_Int():MutableList<Int>{
    return mutableListOf<Int>()
}
public var cnt = 0
public var G = ls_Int()
public var h = 1
fun insertion_sort(a:ls<Int>,n:Int,g:Int){
    for (i in g..n - 1){
        var v = a[i]
        var j = i - g
        while (j >= 0 && a[j] > v){
            a[j + g] = a[j]
            j -= g
            cnt += 1
        }
        a[j + g] = v
    }
}
fun shellSort(a:ls<Int>,n:Int){
    while (true){
        if (h > n){
            break
        }
        G.add(h)
        h = 3*h + 1
    }
    for (i in G.size - 1 downTo 0 step 1){
        insertion_sort(a,n, G[i])
    }
}
