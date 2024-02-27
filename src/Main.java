import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner scanner=new Scanner (System.in);
        //variables globales
        boolean DispHabilitado=false;
        //SOLICITAMOS LA PETICIÓN
        System.out.println("DO YOU WANT ENABLED WIFI?   1:ON    2:OFF");
        byte condicion=scanner.nextByte();
        if (condicion==1){
            //VARIABLE LOCAL
            int i=0; // del condicional i y no lo puedo imprimir por fuera del i
            DispHabilitado=true;
            System.out.println("WiFi Enabled");
        } else if (condicion==2){
            DispHabilitado=false;
            System.out.println("WiFi Disabled");
        } else{
            System.out.println("Invalid Requirement");
        }
        scanner.close();
    }
}