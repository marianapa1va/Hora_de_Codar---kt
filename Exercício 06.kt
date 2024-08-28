fun main(){
    //Calcula a área do losango.
    print("Informe a diagonal maior do losango: ")
    val diagonal_maior = readln().toDouble()

    print("Informe a diagonal menor do losango: ")
    val diagonal_menor = readln().toDouble()

    val area = ((diagonal_maior * diagonal_menor)/2)

    println("O valor da área do losango é: $area")
}