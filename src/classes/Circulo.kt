package classes

/**
 *
 */
class Circulo(color: Color, private var radio: Double) : Figura(color) {
    /**
     *
     */
    override fun area(): Double = Math.PI * radio * radio

    /**
     *
     */
    override fun perimetro(): Double = 2 * Math.PI * radio
}