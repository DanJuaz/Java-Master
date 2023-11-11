package com.azurduy.app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Invoice {

    private ItemInvoice[] items;
    private int index;
    private int indexItem;
    public static final int MAX_ITEM=12;

    private Customer customer;
    private  int cod;
    private String description;
    private Date date;

    // CONSTRUCTOR


    public Invoice(Customer customer, String description) {
        this.customer = customer;
        this.description = description;
        this.items=new ItemInvoice[MAX_ITEM];
        this.date=new Date();
    }

    // GETTER AND SETTER
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ItemInvoice[] getItems() {
        return items;
    }

    public void setItems(ItemInvoice[] items) {
        this.items = items;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.date =format.parse(date);
        } catch (Exception e) {
            System.err.println();
        }
    }
    public String getDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String datenew = "000000";
        try {
            datenew =format.format(date);
           
        } catch (Exception e) {
            System.err.println();
        }
        return datenew;
    }

    
    public void addItems(ItemInvoice item){
        if(indexItem < MAX_ITEM) {
            this.items[indexItem++] = item;
        }
    }
    public double calcOverAll(){
        double result=0;

        for (ItemInvoice item:this.items) {
            if(item==null){
                continue;
            }
            result+=item.calculateImport();

        }
        return result;
    }

   public String seeDetail(){
        StringBuilder sb=new StringBuilder("Factura Nª: ");
        sb.append(index)
                .append("\nCliente: ")
                .append(this.customer.getName())
                .append("\t NIF: ")
                .append(customer.getNif())
                .append("\nDescricion: ")
                .append(this.description)
                .append("\n");
       sb.append("Fecha Emisión: ")
               .append(date)
               .append("\n")
               .append("\n#\tNombre\t$\t\tCant.\tTotal\n");

       for(int i = 0; i < indexItem; i++){
           sb.append(this.items[i].toString())
                   .append("\n");
       }
       sb.append("\nGran Total: ")
               .append(calcOverAll());

       return sb.toString();
   }
    @Override
    public String toString() {
        return seeDetail();
    }
}
