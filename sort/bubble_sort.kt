fun bubble_sort(a:IntArray):IntArray{
    var n = a.size
    var flag = true

    while (flag){
        flag = false
        for (j in n - 1 downTo 1 step 1)
        {
            if (a[j] < a[j - 1])
            {
                var tmp = a[j - 1]
                a[j - 1] = a[j]
                a[j] = tmp
                flag = true;
            }
        }
    }
    return a
}
