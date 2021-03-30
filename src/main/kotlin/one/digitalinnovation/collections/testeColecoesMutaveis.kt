package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0, "PJ")
    val maria = Funcionario("maria", 4000.0, "CLT")

    println("-------LIST---------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------SET----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("------SET----------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("----------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}