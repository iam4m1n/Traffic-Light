public class TrafficLight {
    public boolean isGreen = false;
    public boolean isRed = false;
    public boolean isBlinking = false;


    public void set_red(){
        this.isGreen = false;
        this.isBlinking = false;
        this.isRed = true;
    }

    public void set_green(){
        this.isGreen = true;
        this.isBlinking = false;
        this.isRed = false;
    }

    public void set_blinking(){
        this.isGreen = false;
        this.isBlinking = true;
        this.isRed = false;
    }





    public boolean start(int[] carsCount){
        return false;
    }










}
