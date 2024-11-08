import kotlin.math.ceil // biblioteca para arredondar o numero em double para cima

fun main() {
    // Lê a entrada da area e converte para double, caso o numero seja inteiro
    println("Digite a area (em m²) a ser pintada")
    val entrada = readlnOrNull() ?: "0.0"
    val area: Double = entrada.toDoubleOrNull() ?: 0.0

    // Lê a entrada da superficie se é rustica ou nao e converte para o tipo boolean
    println("A superficie é rustica ? (true or false)")
    val entradaSuperficie = readlnOrNull() ?: "false"
    val rustic: Boolean = entradaSuperficie.toBoolean()

    //Cria uma instancia das classes
    val superficie = Superficie(rustic)
    val tinta = Tinta(superficie)
    val calcular = Calcular()

    //Faz o calculo da quantidade de galao e latao necessario para a area informada e altera a flexão gramatical
    val resultadoGalao = ceil(calcular.galao(area, superficie, tinta)).toInt()
    val galao = if (resultadoGalao == 1) "galão" else "galões"
    val resultadoLatao = ceil(calcular.latao(area, superficie, tinta)).toInt()
    val latao = if (resultadoLatao == 1) "latão" else "latões"

    println(
        "Para pintar uma area de $area m², precisará de $resultadoGalao $galao ou $resultadoLatao $latao " +
                "de ${tinta.name}"
    )
}

