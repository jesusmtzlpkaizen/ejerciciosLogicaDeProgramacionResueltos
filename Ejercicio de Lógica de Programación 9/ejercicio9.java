import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        // Con Hash agregaremos la clave valor palabra español- ingles
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("can", "poder");
        diccionario.put("get", "obtener");
        diccionario.put("do", "hacer");
        diccionario.put("wish", "desear");
        diccionario.put("want", "querer");
        diccionario.put("drive", "conducir");
        diccionario.put("ride", "montar");
        diccionario.put("run", "correr");
        diccionario.put("write", "escribir");
        diccionario.put("eat", "comer");
        diccionario.put("take", "tomar");
        diccionario.put("give", "dar");
        diccionario.put("dance", "bailar");
        diccionario.put("jump", "brincar");
        diccionario.put("go", "ir");
        diccionario.put("call", "llamar");
        diccionario.put("sleep", "dormir");
        diccionario.put("smell", "oler");
        diccionario.put("smile", "sonreir");
        diccionario.put("swim", "nadar");

        // Solicitar una palabra en español
        Scanner frase = new Scanner(System.in);
        System.out.print("Introduce una palabra en espanol: ");
        String palabra = frase.nextLine();
        frase.close();

        // Buscar la traducción
        String traduccion = diccionario.get(palabra);

        // Mostrarlo
        if (traduccion != null) {
            System.out.println("La traduccion de " + palabra + " es  " + traduccion);
        } else {
            System.out.println("No se encontro la palabra " + palabra);
        }
    }