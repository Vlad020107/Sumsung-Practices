package Trash

class Rectangle(
    private var w:Float,
    private var h:Float
): Shape() {
    override fun area(){
        var S = w * h
    }
}