//TODO: In dieser Aufgabe sollst du eine When-Verzweigung schreiben, die den Namen eines Monats ausgibt.
// Der Monat wird dabei als Zahl in der Konstante month angegeben. Jeder Monat hat dabei die Zahl, wie man sie in einem
// Datum verwendet. Wenn die Zahl keinen Monat darstellt (z.B. 420), dann soll eine Fehlermeldung ausgegeben werden.
// Die Monate:
// Januar -> 1
// Februar -> 2
// März -> 3
// April -> 4
// Mai -> 5
// Juni -> 6
// Juli -> 7
// August -> 8
// September -> 9
// Oktober -> 10
// November -> 11
// Dezember -> 12
// Wenn also die Konstante month die Zahl 7 hat, soll in der Konsole über die println()-Funktion "Juli" ausgegeben
// werden. Und wenn die Konstante month die Zahl 11 hat, soll in der Konsole "November" ausgegeben werden.
// Teste dann dein Programm, indem du für month verschiedene Monatszahlen eingibst. Kommt jeweils der richtige Monat
// raus? Teste dann dein Programm auch mit dem Wert 82 für die Konstante month. Wird die Fehlermeldung ausgeben?

fun main() {
    val month: Int = 12

    when (month){
        1 -> {
            println("Januar")
        }
        2 -> {
            println("Februar")
        }
        3 -> {
            println("März")
        }
        4 -> {
            println("April")
        }
        5 -> {
            println("Mai")
        }
        6 -> {
            println("Juni")
        }
        7 -> {
            println("Juli")
        }
        8 -> {
            println("August")
        }
        9 -> {
            println("September")
        }
        10 -> {
            println("Oktober")
        }
        11 -> {
            println("November")
        }
        12 -> {
            println("Dezember")
        }
        else -> println("Dies ist kein Monat!")
    }
}