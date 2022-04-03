package ua.lviv.lab.devices;

public class Calculator extends Device{
    private int dimension;
    public Calculator(String brand, String model, int priceInUsd,
	    double weigth,int dimension) {
	super(brand, model, priceInUsd, weigth);
	super.setTypeOfDevice(Type.CALCULATOR);
	this.dimension = dimension;
    }
    @Override
    public String toString() {
	return super.toString()+String.format("Dimension: %d\n", dimension);
    }
    
    

    
    
}
