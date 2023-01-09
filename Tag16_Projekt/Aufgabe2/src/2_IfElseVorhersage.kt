//TODO: Es handelt sich hierbei um die gleiche Aufgabe wie in der vorherigen nur wird nun zusätzlich überprüft ob es
// wolkig ist, wenn es nicht sonnig ist. Die Konstante cloudy vom Typ Boolean gibt an, ob es wolkig ist.
// Schau dir den Codeausschnitt an.
// Was wird hier ausgegeben?
// Notiere dir deine Antwort. (z.B. in einem Kommentar)
// Führe dann den Code aus.
// Wird das ausgegeben, was du dir notiert hast?

fun main() {
    val sunny = false;
    val cloudy = true

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}

/*
    Schreibe hier deine Lösung für die Aufgabe hin: Leider scheint heute nicht die Sonne und es ist bewölkt.

 */