package classes

/**
 *
 */
class Triangulo(var base: Double, var altura: Double, var lado1: Double, var lado2: Double, color: Color) : Figura(color) {
    /**
     *
     */
    override fun area(): Double = (base * altura) / 2

    /**
     *
     */
    override fun perimetro(): Double = base + lado1 + lado2
}