fun main(){
    // Calcula a área d triângulo

    print("Informe a base do triângilo: ")
    var base = readln().toDouble()

    print("Informe a altura do triângulo:")
    var altura = readln().toDouble()

    var area = (base * altura)/2

    println("O valor da área do triângulo é: $area")
}