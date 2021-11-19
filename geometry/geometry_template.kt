import kotlin.math.*
public val EPS:Double = 0.0000000001
class Point(x:Double,y:Double){
    var x:Double = 0.0
    var y:Double = 0.0
    init {
        this.x = x
        this.y = y
    }
}
class Segment(p1:Point,p2:Point) {
    var p1:Point = Point(0.0,0.0)
    var p2:Point = Point(0.0,0.0)
    init {
        this.p1 = p1
        this.p2 = p2
    }
}
class Circle(c:Point,r:Double){
    var c:Point = Point(0.0,0.0)
    var r:Double = 0.0
    init {
        this.c = c
        this.r = r
    }
}
fun norm(p:Point):Double{
    return p.x * p.x + p.y * p.y
}
fun len(p:Point):Double{
    return sqrt(norm(p))
}



operator fun Point.plus(point_A: Point): Point {
    return Point(this.x + point_A.x, this.y + point_A.y)
}

operator fun Point.minus(point_A: Point): Point {
    return Point(this.x -  point_A.x, this.y - point_A.y)
}

operator fun Point.times(num: Int): Point {
    return Point(this.x * num, this.y * num)
}

operator fun Point.div(num: Int): Point {
    return Point(this.x / num, this.y / num)
}
fun same(p1:Point,p2:Point):Boolean{
    var c :Point = p1 - p2
    if (abs(c.x) < EPS && abs(c.y) < EPS){
        return true
    }
    else{
        return false
    }
}
fun dot(p1:Point,p2:Point):Double{
    return p1.x * p2.x + p1.y * p2.y
}
fun len_of_projection(p1:Point,p2:Point):Double{
    return dot(p1,p2)/len(p1)
}
fun cross(p1:Point,p2:Point):Double{
    return p1.x * p2.y - p1.y * p2.x
}
