fun main(){
    //Calcula a área do trapézio
    print("Informe a base maior do trapézio: ")
    val base_maior = readln().toDouble()

    print("Informe a base menor do trapézio: ")
    val base_menor = readln().toDouble()

    print("Informe a altura do trapézio: ")
    val altura = readln().toDouble()

    val  area = ((base_maior + base_menor)*altura/2)

    println("O valor da área do trapézio: $area")
}