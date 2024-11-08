class Calcular {
    fun galao(area: Double, superficie: Superficie, tinta: Tinta): Double {
        return if (superficie.rustic) area / tinta.rendimentoGalao
        else area / tinta.rendimentoGalao
    }

    fun latao(area: Double, superficie: Superficie, tinta: Tinta): Double {
        return if (superficie.rustic) area / tinta.rendimentoLatao
        else area / tinta.rendimentoLatao
    }
}