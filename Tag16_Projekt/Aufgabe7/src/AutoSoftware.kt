//TODO: Wir brauchen eine Software für ein Auto. Die Software soll nur starten, wenn der Motor an ist und alle Türen
// geschlossen sind.
// Schreibe eine Funktion. Die Funktion erhält zwei Parameter vom Typ Boolean, einmal isMotorRunning, das angibt, ob
// der Motor an ist und einmal doorsAreClosed, das angibt, dass alle Türen geschlossen sind.
// Verwende in deiner Funktion eine If-Else Verzweigung.
// Wenn der Motor läuft und die Türen geschlossen sind, soll unsere Funktion die Funktion start() aufrufen.
// Wenn der Motor läuft, aber die Türen nicht geschlossen sind, soll unsere Funktion die Funktion closeDoors() aufrufen.
// Teste deine Funktion, indem du sie in der main()-Funktion mit den Parametern
// true und true aufrufst. In der Konsole sollte "Software gestartet." ausgegeben werden.
// Teste deine Funktion, indem du sie in der main()-Funktion mit den Parametern
// true und false aufrufst. In der Konsole sollte "Bitte alle Türen schließen." ausgegeben werden.

fun main() {
    test(isMotorRunning = true,doorsAreClosed = true)
    test2(isMotorRunning = true,doorsAreClosed = false)
}

// Die Funktionen start() und closeDoors() sind vorgegeben.
fun start() {
    println("Software gestartet.")
}

fun closeDoors() {
    println("Bitte alle Türen schließen.")
}

fun test(isMotorRunning: Boolean, doorsAreClosed: Boolean){

    if (isMotorRunning){
        if (doorsAreClosed){
            start()
        }
        else (closeDoors())
    }
}

fun test2(isMotorRunning: Boolean, doorsAreClosed: Boolean){

    if (isMotorRunning){
        if (doorsAreClosed){
            start()
        }
        else (closeDoors())
    }
}
