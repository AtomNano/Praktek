package inventory2_22maret;

import java.util.Scanner;

import inventory1.*;

public class producttester {
    public static void main(String[] args) {
        // TODO code application logic here

        // 6 objek product 
        // 4 objek mengacu pada constructur dengan parameter.

        Scanner in = new Scanner(System.in);
        // local variabel
        int tempnumber;
        String tempname;
        int tempqty;
        double tempprice;

        System.out.println(" \n Masukkan no produk : ");
        tempnumber = in.nextInt();
        in.nextLine();
        System.out.println(" \n Masukkan Nama produk : ");
        tempname = in.nextLine();
        System.out.println(" \n Masukka jumlah produk : ");
        tempqty = in.nextInt();
        System.out.println(" \n Masukkan no Harga : ");
        tempprice = in.nextDouble();

        product p1=new product(tempnumber,tempname,tempqty,tempprice);

        System.out.println(" \n Masukkan no produk : ");
        tempnumber = in.nextInt();
        in.nextLine();
        System.out.println(" \n Masukkan Nama produk : ");
        tempname = in.nextLine();
        System.out.println(" \n Masukka jumlah produk : ");
        tempqty = in.nextInt();
        System.out.println(" \n Masukkan no Harga : ");
        tempprice = in.nextDouble();

        product p2 = new product(tempnumber, tempname, tempqty, tempprice);

        in.close();

        product p3 = new product(1, "Rinso 1.8 kg", 10, 48500.00);
        product p4 = new product(2, "Molto Cair 100 ml", 25, 15500.00);
        product p5 = new product(3, "Pepsodent 100 gr", 250, 7500.00);
        product p6 = new product(4, "Lifeboy 150 ml", 35, 20000.00);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
