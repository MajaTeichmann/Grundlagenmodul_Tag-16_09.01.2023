//TODO: Wir erweitern unser Konstrukt um eine weitere Abzweigung: Wenn es bewölkt ist, kann es nun auch noch regnen.
// Ob es regnet, wird durch die Konstante rainy angegeben.
// a) Schau dir den Codeausschnitt an.
// Was wird hier ausgegeben?
// Notiere dir deine Antwort. (z.B. in einem Kommentar)
// Führe dann den Code aus.
// Wird das ausgegeben, was du dir notiert hast?

/* fun main() {
    val sunny = false
    val cloudy = true
    val rainy = true

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            if (rainy) {
                println("Heute regnet es!")
            } else {
                println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
            }
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
} */

/*
    Schreibe hier deine Lösung für die Aufgabe hin: Heute regnet es!

 */

// TODO: b) Was wird ausgegeben, wenn die Konstanten wie folgend gesetzt sind?
//  Überlege dir erst eine Antwort, notiere sie dir, ersetze die Konstanten im Programm mit den neuen Konstanten,
//  führe dann das Programm aus. Wird das ausgegeben, was du dir notiert hast?

/*fun main() {
    val sunny = false
    val cloudy = true
    val rainy = false

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            if (rainy) {
                println("Heute regnet es!")
            } else {
                println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
            }
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}*/

/*
    Schreibe hier deine Lösung für die Aufgabe hin: Leider scheint heute nicht die Sonne und es ist bewölkt.

 */

// TODO: c) Was wird ausgegeben, wenn die Konstanten wie folgend gesetzt sind?
//  Überlege dir erst eine Antwort, notiere sie dir, ersetze die Konstanten im Programm mit den neuen Konstanten,
//  führe dann das Programm aus. Wird das ausgegeben, was du dir notiert hast?

fun main() {
    val sunny = false
    val cloudy = false
    val rainy = false

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            if (rainy) {
                println("Heute regnet es!")
            } else {
                println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
            }
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}

/*
    Schreibe hier deine Lösung für die Aufgabe hin: Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.
*/