package phastixtv.ch.aufgaben;

public class Uebergabe {

    /*
    Zum Ausführen muss man das Terminal in IDE öffnen, das wäre links unten, bei den vielen Auswahlmöglichkeiten.
    Gib dann den Befehl "cd src/main/java/phastixtv/ch/aufgaben" um in den Ordner zukommen, wo diese Datei liegt.
    Zum Starten nutz du den Befehl "java .\Uebergabe.java [Hier kommt das Wort hin, was du willst. Das wird dann,
    dass 0 Argument, wenn du im Code schaust]".
    Wenn du mehrere Wörter eingeben möchtest, musst du ein "" einsetzen.
    Beispiel:
    java .\Uebergabe.java "So kannst du mehrere Wörter einsetzen!"
     */

    public static void main (String[] args) {
        System.out.println("Der Parameter war:" + args[0]);
    }
}
