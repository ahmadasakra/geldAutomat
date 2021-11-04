# GeldAutomat
## Algorithmus für einen Geldwechsel-Automaten
Dieser Algorithmus soll einen eingegebenen **Betrag** *x* in Kleingeld, d.h. Münzen, wieder ausgeben. Dabei sollen möglichst wenig Münzen zurückgegeben werden.
Der Automat hat Zugriff auf so viele Münzen, wie er benötigt. Geldscheine kann er jedoch nicht ausgeben.

- Der Automat soll sich durch *eine kleine* Änderung (z.B. nur ein oder zwei Zeilen) an beliebige andere Währungen anpassen lassen. 

- Es ist in Ordnung, wenn er dafür neu kompiliert werden muss. Beispielsweise soll er nicht nur mit europäischen, sondern auch mit britischen, amerikanischen oder beliebigen anderen Münzen arbeiten können. Diese können sich auch in der Stückelung des Kleingelds unterscheiden. Die **Stückelung** 0,01 bzw. 1 (vergleichbar mit 0,01€ also 1 Cent) gibt es jedoch in jedem Fall.

### Ein Beispiel

- Es sollen 4,36€ zurückgegeben werden.

- Der Automat sollte berechnen, dass er 2x2€, 1x0,20€, 1x0,10€, 1x0,05€ und 1x0,01€ ausgeben muss.

- Die Ausgabe der Geldstücke kann in der Konsole stattfinden, es wird keine Oberfläche für das Programm benötigt.
