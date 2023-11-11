package testPlay;

import com.azurduy.app.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del cliente: ");
        Customer customer=new Customer(sc.nextLine());
        System.out.println("Introduzca el NIF cliente: ");
       customer.setNif(sc.nextLine());
        System.out.println("Introduzca una descripcion de la factura: ");
        Invoice invoice=new Invoice(customer, sc.nextLine());
        System.out.println("Introduzca la fecha: ");
        invoice.setDate(sc.nextLine());

        Product product;
        System.out.println();

        for (int i = 0; i < 2; i++) {
            product= new Product() {
                @Override
                public double getPrecioVenta() {
                    return 0;
                }
            };
            System.out.println("Ingrese producto nº "+product.getCod()+": ");
            product.setName(sc.nextLine());

            System.out.println("Ingrese el precio($): ");
            product.setPrice(sc.nextFloat());

            System.out.println("Ingrese la cantidad: ");
            invoice.addItems(new ItemInvoice(sc.nextInt(), product));

            System.out.println();
            sc.nextLine();
        }
        System.out.println(invoice);
    }
}
