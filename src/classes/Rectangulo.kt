package classes

/**
 *
 */
class Rectangulo(private var ancho: Double, private var altura: Double, color: Color) : Figura(color) {
    /**
     *
     */
    override fun area(): Double = ancho * altura

    /**
     *
     */
    override fun perimetro(): Double = 2 * (ancho + altura)
}