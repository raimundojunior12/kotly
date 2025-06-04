package com.example.test2.models

data class Pessoa(val nome: String, val idade: Int){
    fun apresentar() = "Olá, meu nome é $nome e tenho $idade anos."
    fun podeVotar() = if (idade >= 16) "Pode votar" else "Não pode votar"
    fun faixaEtaria() = when {
        idade >= 60 -> "Idoso"
        idade >= 18 -> "Adulto"
        idade >= 12 -> "Jovem"
        else -> "Criança"

    }
}