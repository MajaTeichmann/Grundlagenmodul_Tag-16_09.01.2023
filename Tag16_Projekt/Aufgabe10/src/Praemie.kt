//TODO: Alle Bestandskunden eines Mobilfunkanbieters sollen eine Prämie erhalten. Die Firma existiert erst seit 5 Jahren,
// es gibt also keinen Bestandskunden, der länger dabei ist als 5 Jahre. Die Vertragsdauer eines Bestandskunden wird in
// der Konstante duration in Jahren angegeben.
// Die Belohnungen sehen wie folgt aus:
// Genau 1 Jahr -> 5€ Amazon-Gutschein Prämie
// Genau 2 Jahre -> 15€ Amazon Gutschein Prämie
// Genau 3 Jahre -> 25€ Amazon Gutschein Prämie
// Genau 4 Jahre -> 35€ Amazon Gutschein Prämie
// Genau 5 Jahre -> 50€ Amazon Gutschein Prämie
// Schreibe in der main()-Funktion eine When Verzweigung, das anhand der Vertragsdauer in der Konstante duration die
// Prämie in der Konsole ausgibt.
// Teste dein Programm, indem du den Wert der Konstante duration änderst und dann das Programm laufen lässt.
// Teste dein Programm mit diesen Werten und prüfe, ob das Richtige in der Konsole ausgegeben wird:

fun main() {
    val duration: Int = 6

    when (duration){
        1 -> {
            println("5€ Amazon-Gutschein Prämie")
        }
        2 -> {
            println("15€ Amazon Gutschein Prämie")
        }
        3 -> {
            println("25€ Amazon Gutschein Prämie")
        }
        4 -> {
            println("35€ Amazon Gutschein Prämie")
        }
        2 -> {
            println("50€ Amazon Gutschein Prämie")
        }
        else -> println("Du musst dich vertippt haben!")
    }

}