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

        // Solicitar traduccion
        
        int bien = 0;
        int mal = 0;
        Scanner frase = new Scanner(System.in);
        for (String palabra : diccionario.keySet()) {
            System.out.print("Traduccion de " + palabra + " a ingles: ");
            String traduccion = frase.nextLine().toLowerCase();
            if (traduccion.equals(diccionario.get(palabra))) {
                bien++;
            } else {
                mal++;
            }
        }
        frase.close();

        // Mostrar resultado
        System.out.println("Respuestas correctas: " + bien);
        System.out.println("Respuestas incorrectas: " + mal);
    }
}