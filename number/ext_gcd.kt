fun extgcd(a:Long, b:Long):Triple<Long, Long, Long>{
    if (b != 0.toLong()){
        var p = extgcd(b, a % b)
        var d = p.first
        var y = p.second
        var x = p.third
        y -= (a / b)*x
        return Triple(d, x, y)
    }
    return Triple(a, 1, 0)
}
