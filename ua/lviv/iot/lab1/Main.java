package ua.lviv.iot.lab1;

public class Main {

    public static void main(String[] args) {

	Chainsaw chainsaw1 = new Chainsaw();

	Chainsaw chainsaw2 = new Chainsaw("Daewoo", 1200, 1.5);

	Chainsaw chainsaw3 = new Chainsaw("Bosch", 1800, 200, 400, 2.5, 2500);

	System.out.println(chainsaw1);

	System.out.println(chainsaw2);

	System.out.println(chainsaw3);

    }

}
