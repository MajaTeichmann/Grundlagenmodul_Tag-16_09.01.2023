//TODO: Wir wollen die Software für eine Login-Webseite schreiben. Dazu brauchen wir eine Funktion, die überprüft, ob
// der Nutzer auf der Webseite erlaubt ist, das Passwort stimmt und ob die Verbindung sicher ist.
// Die Funktion gibt dann eine Statusmeldung als String zurück.
// 1. Schreibe eine Funktion. Die Funktion erhält drei Parameter vom Typ Boolean.
// Einmal userAccepted, das angibt, ob der Nutzer erlaubt ist,
// einmal passwordOk, das angibt, ob das Password stimmt
// und einmal connectionSecure, das angibt, ob die Verbindung sicher ist.
// 2. Verwende in deiner Funktion eine If-Else Verzweigung.
// 3. Wenn der Nutzer nicht erlaubt ist, gibt die Funktion "User denied." zurück.
// 4. Wenn der Nutzer erlaubt ist, aber das Passwort falsch ist, gibt die Funktion "False password." zurück.
// 5. Wenn der Nutzer erlaubt ist, das Passwort stimmt, aber die Verbindung unsicher ist, gibt die Funktion
// "Unsafe connection." zurück.
// 6. Wenn der Nutzer erlaubt ist, das Passwort stimmt und die Verbindung sicher ist, gibt die Funktion "Ok." zurück.
// Teste deine Funktion, indem du sie in der main()-Funktion mit den folgenden Parametern aufrufst und den Rückgabewert
// der Funktion mit der println()-Funktion in der Konsole ausgibst.

/*Parameter:              Konsolenausgabe:
false, false, false     "User denied."
true,  false, false     "False password."
true,  true,  false     "Unsafe connection."
true,  true,  true      "Ok."*/

fun main() {
    logIn(false, false, false)
    logIn(true,  false, false)
    logIn(true,  true,  false)
    logIn(true,  true,  true)
}

fun logIn(userAccepted: Boolean, passwordOk: Boolean, connectionSecure: Boolean){
    if (userAccepted) {
        if (passwordOk){
            if (connectionSecure){
                println("Ok.")
            } else if (userAccepted)
                        if (passwordOk)
                            println("Unsafe connection.")
        } else println("False password.")
    } else println("User denied.")
}

// ERSTER VERSUCH:
//fun logIn(userAccepted: Boolean, passwordOk: Boolean, connectionSecure: Boolean){
//    if (userAccepted){
//        println("User denied.")
//    }
//    if (userAccepted){
//        if (passwordOk)
//            println("False password.")
//    }
//    if (userAccepted){
//        if (passwordOk)
//            if (connectionSecure)
//                println("Unsafe connection.")
//            else println("Ok")
//    }
//}