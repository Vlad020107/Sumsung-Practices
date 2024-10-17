package Trash

class Circle(
    private var R:Float,
): Shape() {
    override fun area(){
        var S = 3.14 * (R * R)
    }
}