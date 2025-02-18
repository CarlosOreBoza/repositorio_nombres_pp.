package Programa02;
import java.util.Scanner;
public class empleado {
    public static void main(String args []){
        
        String empleado;
        double ht,th,sb,d,sn;
        Scanner lee=new Scanner(System.in);
        
        System.out.print("Nombre de empleado: ");
        empleado=lee.next();
        
        System.out.print("Horas trabajadas: ");
        ht=lee.nextDouble();
        
        System.out.print("Tarifa por hora: ");
        th=lee.nextDouble();
        sb=ht*th;
        d=sb*0.13;
        sn=sb-d;
        
        System.out.println("sueldo bruto: s/" + sb);
        System.out.println("descuento: " + d);
        System.out.println("sueldo neto: " + sn);
    }
    
}
