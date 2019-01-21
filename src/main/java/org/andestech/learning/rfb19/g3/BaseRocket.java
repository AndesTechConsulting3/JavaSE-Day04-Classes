package org.andestech.learning.rfb19.g3;

public abstract class BaseRocket {

    public abstract void ignit();


}

interface IRocketIgnitable
{
    public void ignit();
}


interface IRocketTakeoff
{
    public void takeOff();

}


interface IRocket extends IRocketTakeoff,IRocketIgnitable
{}


class BaseRocket2{
//    public  void ignit() throws Exception{
//        throw new Exception("Not realized...");
//
//    }
public  void ignit(){
    System.out.println("Should be realized!!!!");
}


        }