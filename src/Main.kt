import classes.*

fun main() {

    // *********
    val circulo = Circulo(Color.AZUL,5.0)
    println("Área del círculo: ${circulo.area()}")
    println("Perímetro del círculo: ${circulo.perimetro()}")
    println("Color del círculo: ${circulo.color.muestraColor}")

    // *********
    val rectangulo = Rectangulo(4.0, 6.0, Color.ROJO)
    println("Área del rectángulo: ${rectangulo.area()}")
    println("Perímetro del rectángulo: ${rectangulo.perimetro()}")

    // *********
    val triangulo = Triangulo(4.0, 3.0, 4.0, 5.0, Color.AMARILLO)
    println("Área del triángulo: ${triangulo.area()}")
    println("Perímetro del triángulo: ${triangulo.perimetro()}")
}