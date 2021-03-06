package com.company;
import java.util.Scanner;
class Invoice
{
    private String product;
    private String inf;
    private double price;
    private double client_balance;
    private int count;
    public Invoice(String product,double price,String inf, int count) {
        this.product = product;
        if (price > 0.00) {
            this.price = price;
        }
        this.inf=inf;
        this.count=count;
    }
    public void Count(int count) {
        System.out.println("Количество товара: "+count);
    }
    public void getProduct(String product) {
        System.out.println("Наименование товара: "+product);
    }
    public double getInvoiceAmount(double price, int count ) {
        if(count<0) {
            count=0;
        }
        if(price<0.00) {
            price=0.00;
        }
        double result=price*count;
        return result;
    }
    public void Payment(double client_balance) {
        double result=0.00;
        result=client_balance-getInvoiceAmount(price,count);
        if(result<0)
            System.out.println("Ошибка!");
        else
            System.out.println("Вы заплатили:" + getInvoiceAmount(price,count));
        System.out.println("На вашем счету осталось: "+ result);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice inv=new Invoice("kinder",124,"Уход за волосами" , 4);//Экземляр класса
        inv.getProduct("kinder");
        inv.Count(2);
        inv.getInvoiceAmount(124,2);
        inv.Payment(2000);
    }
}
