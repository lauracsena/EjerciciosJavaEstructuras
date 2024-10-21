import java.io.*;

public class Condicional4 {
    public static void main(String[] args) throws IOException{
        char car1, car2;
        System.out.print("Ingrese el primer caracter: ");
        car1 =(char)System.in.read();
        System.in.read();
        System.out.print("Ingrese el segundo caracter: ");
        car2 = (char)System.in.read();

        if(car1==car2)
        System.out.println("Son iguales");
        else
        System.out.println("No son Iguales");
    }

}
