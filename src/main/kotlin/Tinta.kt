class Tinta(superficie: Superficie) {
    var name: String = "Borracha Liquida"
    val rendimentoGalao: Int = if (superficie.rustic) 60 else 80
    val rendimentoLatao: Int = if (superficie.rustic) 12 else 16
}
