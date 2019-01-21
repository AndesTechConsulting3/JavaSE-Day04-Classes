package org.andestech.learning.rfb19.g3;

public class NuclearRocket extends Rocket {

    private double reactorPower;
    //...........

    public double getReactorPower() {
        return reactorPower;
    }

    public NuclearRocket()
    {
        super();
        reactorPower = 623876876;
    }

    public NuclearRocket(double startMass, double payload, double maxV, Engine engine, double reactorPower)
    {
        super(startMass,payload,maxV,engine);
        this.reactorPower = reactorPower;

    }

    @Override
    public void ignit()
    {
        //super.ignit();
        System.out.println("Nuclear ignit!..");
    }


    public String toString(){
        return "Nuclear! " + super.toString();

    }
}
