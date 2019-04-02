package jonss.github.com

class RegularCat(override val colour: String) : CatAction, CatColor {

    override fun play() {
        println("Kill 'Em all")
    }

}

interface CatAction {
    fun play()
}

interface CatColor {
    val colour: String
}

class Jupiter: CatColor by JupiterColour,
 CatAction by JupiterPlay


object JupiterColour : CatColor {
    override val colour: String = "Black and white"
}

object JupiterPlay : CatAction {
    override fun play() {
        println("Kill cochroaches just for fun.")
    }
}


