package org.andestech.learning.rfb19.g3;

public class Engine {
    private double power, mass;

    public double getPower() {
        return power;
    }

    public Engine(double power, double mass, String vendor) {
        System.out.println("+++ ctor, engine: " + this);
        this.power = power;
        this.mass = mass;
        this.vendor = vendor;
    }
//    public void setPower(double power) {
//        this.power = power;
//    }

    public double getMass() {
        return mass;
    }

//    public void setMass(double mass) {
//        this.mass = mass;
//    }

    public String getVendor() {
        return vendor;
    }

//    public void setVendor(String vendor) {
//        this.vendor = vendor;
//    }

    private String vendor;


}
