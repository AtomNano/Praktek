package inventory1;

public class producttester {
    public static void main(String[] args) {
        // TODO code application logic here

        // 6 objek product 
        // 4 objek mengacu pada constructur dengan parameter.

        product p1 = new product();
        product p2 = new product();

        // 4 objek mengacu pada constructur dengan parameter.

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
