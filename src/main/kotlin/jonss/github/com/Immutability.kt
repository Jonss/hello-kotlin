package jonss.github.com

const val ok = "OK"

class Immutability {
    private var a = "Init b"
    private val b = "Init b"

    init {
        a = "Nice"
//        b = "Not nice"
        println(ok)
    }

    val iCanChange = mutableListOf("Earth", "Wind", "Fire")
    val iCannot = listOf("Mercury", "Venus", "Earth", "Mars","Jupiter","Saturn", "Uranus")

}

fun main() {
    val immutability = Immutability()
    immutability.iCanChange.add("Water")
//    immutability.iCannot.add("Iron")
}
