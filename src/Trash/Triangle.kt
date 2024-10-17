package Trash

class Triangle(
    private var h:Float,
    private var base:Float
): Shape() {
    override fun area(){
        var S = 0.5 * base * h;
    }
}