package ua.lviv.iot.lab1;

record Chainsaw(String name,int powerInW, int numberOfTurnsOfChainPerMinute,
		int busLengthInMm, double weightInKg, double priceInUah) {

    private static int id;

    public static int GetId() {
	return id;
    }

    public Chainsaw() {
	this("No name", 0, 0, 0, 0.0, 0.0);
    }

    public Chainsaw(String name, int powerInW, double weightInKg) {
	this(name, powerInW, 0, 0, weightInKg, 0.0);
    }

    public String toString() {
	return String.format("\tChainsaw Info\n"+
			"Name: %s, Power: %d W\n"+
			"Number of Turns of chain: %d TPM, Bus length: %d mm\n"+ 
			"Weight: %.1f kg, Price: %.1f uah\n",
			name, powerInW,
			numberOfTurnsOfChainPerMinute,busLengthInMm,
			weightInKg, priceInUah);
}

}
