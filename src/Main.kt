import kotlin.random.Random

fun main() {

    var pJugador: Int = 0
    var pMaquina: Int = 0
    while (pJugador != 2 && pMaquina != 2) {

        //1.Papel 2.Tijera 3.Piedra
        var ranMaquina: Int = Random.nextInt(1, 4)
        var ranJugador: Int = Random.nextInt(1, 4)
        var salidaMaquina: String = ""
        var salidaJugador: String = ""

        if (ranMaquina == 3 && ranJugador == 1) {
            println("GANO JUGADOR")
            pJugador++
        } else if (ranMaquina == 1 && ranJugador == 3) {
            println("GANO MAQUINA")
            pMaquina++
        } else if (ranMaquina > ranJugador) {
            println("GANO MAQUINA")
            pMaquina++
        } else if (ranJugador > ranMaquina) {
            println("GANO JUGADOR")
            pJugador++
        } else {
            println("EMPATE")
        }
        if (ranMaquina == 1) {
            salidaMaquina = "PAPEL"
        } else if (ranMaquina == 2) {
            salidaMaquina = "TIJERA"
        } else if (ranMaquina == 3) {
            salidaMaquina = "PIEDRA"
        }
        if (ranJugador == 1) {
            salidaJugador = "PAPEL"
        } else if (ranJugador == 2) {
            salidaJugador = "TIJERA"
        } else if (ranJugador == 3) {
            salidaJugador = "PIEDRA"
        }
        println("MAQUINA:$salidaMaquina JUGADOR $salidaJugador")
        println("PUNTAJE: M:$pMaquina VS J:$pJugador")
        println("-------------------------")
    }
    if (pJugador > pMaquina) {
        println("--------------GANO EL JUGADOR---------------")
    } else {
        println("--------------GANO LA MAQUINA---------------")
    }
}




