package Idiomas;

/*

Crear una clase Entrada con un main con la siguiente funcionalidad:

    Crea un objeto de tipo Idioma que sea castellano

    Crea un objeto de tipo Idioma que sea ingles

    Crea un objeto de tipo Idioma que sea aleman

    Crea un ArrayList de idiomas donde se metan los tres definidos anteriormente

    Añade unas cuantas palabras a la lista del idioma castellano

    Añade unas cuantas palabras a la lista del idioma inglés

    Añade unas cuantas palabras a la lista del idioma alemán

    Saca por pantalla el saludo en los tres idiomas con el siguiente formato. El saludo en XXX es: XXX

    Saca por pantalla la despedida en los tres idiomas con el siguiente formato. La despedida en XXX es: XXX

    Lista por pantalla las palabras de todos los idiomas

 */

public class Entrada {
    public static void main(String[] args) {
        Idioma espanol = new Idioma("Español", 100000) {
            @Override
            public void saludar() {
                System.out.println("Hola");
            }

            @Override
            public void despedir() {
                System.out.println("Adiós");
            }
        };

        espanol.ingresarPalabra("Patata");
        espanol.listarPalabras();
    }
}
