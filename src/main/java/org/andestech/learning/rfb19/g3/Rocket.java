package org.andestech.learning.rfb19.g3;

//public class Rocket extends BaseRocket {
public class Rocket implements IRocket {
    public double getStartMass() {
        return startMass;
    }

    public void setStartMass(double startMass) {
        this.startMass = startMass;
    }

    public double getPayload() {
        return payload;
    }

//    public void setPayload(double payload) {
//        this.payload = payload;
//    }

    public double getMaxV() {
        return maxV;
    }

//    public void setMaxV(double maxV) {
//        this.maxV = maxV;
//    }

    public Engine getEngine() {
        return engine;
    }

//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    private double startMass, payload, maxV;

    private Engine engine;

    public Rocket(double startMass, double payload, double maxV, Engine engine) {

        this.startMass = startMass;
        this.payload = payload;
        this.maxV = maxV;
        this.engine = engine;
        System.out.println("+++ ctor, rocket: " + this);
    }

    public  Rocket(){
        this(1500000,500000,8200,
                new Engine(4000000,70000, "Энергия-3"));

    }

    public  void ignit(){
        System.out.println("Ignit started!...");
    //..
    //..
    }

    public  void takeOff(){
        System.out.println("Поехали!!");
    }

    public String toString(){
        return "Rocket, mass:" + startMass +
        ", полезная нагрузка:" + payload +
        ", скорость:" + maxV + ".";

    }

}
