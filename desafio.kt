// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val posicao: String)

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<List<Usuario>>()
    
    fun matricular(usuarios: List<Usuario>) {
        inscritos.add(usuarios)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudosIntro = listOf(ConteudoEducacional("Introdução a Kotlin", Nivel.BASICO, 68), ConteudoEducacional("Controle de fluxo com Kotlin", Nivel.BASICO, 80))
    val conteudosInter = listOf(ConteudoEducacional("POO em Kotlin", Nivel.INTERMEDIARIO, 80), ConteudoEducacional("Funções em Kotlin", Nivel.INTERMEDIARIO))
    val conteudosAvan = listOf(ConteudoEducacional("Consumo de API's em Android", Nivel.AVANCADO, 100),
                               ConteudoEducacional("Injeção de Dependências com Koin", Nivel.AVANCADO, 100),
                               ConteudoEducacional("MVVM e Clean Architecture", Nivel.AVANCADO, 100))
    
    val formacaoBasica = Formacao("Introdução ao desenvolvimento Android Nativo", conteudosIntro)
    val formacaoIntermediaria = Formacao("Conceitos Importantes para desenvolvimento Android Nativo", conteudosInter)
    val formacaoAvancada = Formacao("Preparação para ingresso no Mercado de Trabalho em desenvolvimento Android Nativo", conteudosAvan)
    
    val user1 = Usuario("Pedro Gonçalves", "Estudante")
    val user2 = Usuario("Giovanni Lima", "Estudante")
    val user3 = Usuario("Roberta Porto", "Estudante")
    
    val user4 = Usuario("João Francisco", "Estagiário")
    val user5 = Usuario("Kleiton dos Santos", "Estagiário")
    
    val user6 = Usuario("Amanda Faria", "Engenheira de Computação")
    val user7 = Usuario("Erico Garcia", "Cientista da Computação")
    val user8 = Usuario("Vitor Lira", "Engenheiro de Computação")
    
    formacaoBasica.matricular(listOf(user1, user2, user3))
    println("${formacaoBasica.nome};")
    println("Conteúdos: ${formacaoBasica.conteudos};")
    println("Matriculados: ${formacaoBasica.inscritos}")
    println("")
    
    formacaoIntermediaria.matricular(listOf(user4, user5))
    println("${formacaoIntermediaria.nome};")
    println("Conteúdos: ${formacaoIntermediaria.conteudos};")
    println("Matriculados: ${formacaoIntermediaria.inscritos}")
    println("")
    
    formacaoAvancada.matricular(listOf(user6, user7, user8))
    println("${formacaoAvancada.nome};")
    println("Conteúdos: ${formacaoAvancada.conteudos};")
    println("Matriculados: ${formacaoAvancada.inscritos}")   
}