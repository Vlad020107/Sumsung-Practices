package Trash

import java.awt.Color

class Gruzovic(color: Color,
               gosNomer:Int,
               model:String,
    var destination: Destination
): Car(color, gosNomer, model) {

    override fun pobibikati() {
        println("Ver loud sound")
    }
}