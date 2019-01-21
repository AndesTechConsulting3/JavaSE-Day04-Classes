package org.andestech.learning.rfb19.g3;

///public class App extends Object
public class App
{

    public static void rocketFullStart(IRocket iRocket)
{
    iRocket.ignit();
    System.out.println("pause....");
    iRocket.takeOff();

}

    public static void rocketFullStart2(Object iRocket)
    {
        ((IRocket)iRocket).ignit();
        System.out.println("pause....");
        ((IRocket)iRocket).takeOff();

    }

    public static void main( String[] args )
    {

        Engine engine = new Engine(21687687,300000, "Энергия");
        Rocket rocket = new Rocket(1500000,500000,8100,engine);

        rocket.ignit();
        rocket.takeOff();

        //............

        Rocket rocket2 = new Rocket(1500000,500000,8100,
                new Engine(98798743,65272, "Энергия-2"));


        System.out.println("M_eng2=" + rocket2.getEngine().getMass());
        rocket2.ignit();
        rocket2.takeOff();

        //..........

        NuclearRocket nuclearRocket = new NuclearRocket();

        rocketFullStart(nuclearRocket);
       // rocketFullStart2("aksdkjh");

//        nuclearRocket.ignit();
//        nuclearRocket.takeOff();

        //--------------


        Object o = new Object();

        o=nuclearRocket;

        if( o instanceof NuclearRocket){
        ((NuclearRocket)o).ignit();}

        if( o instanceof PhotonRocket){
        ((PhotonRocket)o).ignit();}


        //-----------

        Rocket r3 = nuclearRocket;
        System.out.println(r3);

        r3= rocket;
        System.out.println(r3);


    }
}
