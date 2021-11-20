typealias ls<K> = MutableList<K>
fun ls_Int():MutableList<Int>{
    return mutableListOf<Int>()
}
public var MAX = 500000
public var SENTINEL = 2000000000
public var L = ls_Int()
public var R = ls_Int()
public var cnt = 0
fun merge(A:ls<Int>,left:Int,mid:Int,right:Int){
    var n1 = mid - left
    var n2 = right - mid
    for (i in 0..n1 - 1){
        L[i] = A[left + i]  
    }
    for (i in 0..n2 - 1){
        R[i] = A[mid + i]
    }
    L[n1] = SENTINEL
    R[n2] = SENTINEL
    var i = 0
    var j = 0
    for (k in left..right - 1){
        cnt += 1
        if (L[i] <= R[j]){
            A[k] = L[i]
            i += 1
        }
        else{
            A[k] = R[j]
            j += 1
        }
    }
}
fun merge_sort(A:ls<Int>,n:Int,left:Int,right:Int){
    if (left + 1 < right){
        var mid:Int = (left + right)/2
        merge_sort(A,n,left,mid)
        merge_sort(A,n,mid,right)
        merge(A,left,mid,right)
    }
}
fun main(){
    for (i in 0..MAX/2 + 1){
        L.add(0)
        R.add(0)
    }
    var n = readLine()!!.toInt()
    var a = readLine()!!.split(" ").map{ it.toInt() }.toMutableList()
    // for (i in 0..MAX - n){
    //     a.add(0)
    // }
    merge_sort(a,n,0,n)
}
