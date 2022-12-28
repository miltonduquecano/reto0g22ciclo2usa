import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/
class Reto0{

    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    /**
    * método principal
    */
    public void run(){
        /*
        solución propuesta
        */
    double numerouno, numerodos, suma, producto;
    String[] datos=new String[2];
    String texto=read();
    datos=texto.split(" ");
    numerouno=Double.parseDouble(datos[0]);
    numerodos=Double.parseDouble(datos[1]);
    suma=numerouno+numerodos;
    producto=numerouno*numerodos;    
            System.out.println(String.format("%.1f", suma)+" "+producto);
    }
}