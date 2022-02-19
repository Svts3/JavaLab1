package ua.lviv.iot.lab1;

record Chainsaw(String name, double powerInV, int numberOfTurnsOfChainPerMinute,
		int busLengthInMm, double weightInKg, double priceInUah) {

    private static int id;

    public static int GetId() {
	return id;
    }

    public Chainsaw() {
	this("No name", 0.0, 0, 0, 0.0, 0.0);
    }

    public Chainsaw(String name, double powerInV, double weightInKg) {
	this(name, powerInV, 0, 0, weightInKg, 0.0);
    }

    public String toString() {
	return String.format("\tChainsaw Info\n"+
			"Name: %s, Power: %.1f V\t\n"+
			"Number of Turns of chain: %d TPM, Bus length: %d mm\n"+ 
			"Weight: %.1f kg, Price: %.1f uah\t\n",
			name, powerInV,
			numberOfTurnsOfChainPerMinute,busLengthInMm,
			weightInKg, priceInUah);
}

}
