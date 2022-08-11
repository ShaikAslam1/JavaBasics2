package com.aslam.ismail;

public class SportsCarDemo {

//the SportsCarDemo has four field//
    public double seatHeight;
    public int cadence;
    public double speed;
    public int gear;
    public String jaguar;

    //the SportsCarDemo subClass has one constructor//

    public SportsCarDemo(double startHeight, int startCadence, double startSpeed, int startGear,String startJaguar){
        seatHeight = startHeight;
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
        jaguar = startJaguar;
    }

    public void setSeatHeight(double newValue){ seatHeight = newValue;}
    public void setCadence(int newValue){cadence = newValue;}
    public void applyBreak(double decrement){speed -= decrement;}
    public void speedUp(double increment){speed += increment;}
    public void setGear(int newValue){gear = newValue;}
    public void setJaguar(String newValue){jaguar = newValue;}

    public double getSeatHeight() {return  seatHeight;}
    public int getCadence() {return cadence;}
    public double getSpeed() {return speed;}
    public int getGear() {return gear;}
    public String getJaguar(){return  jaguar;}
}
