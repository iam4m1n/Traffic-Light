import java.util.ArrayList;

public class Intersection {

    public TrafficLight tl1 = new TrafficLight();
    public TrafficLight tl2 = new TrafficLight();
    public TrafficLight tl3 = new TrafficLight();
    public TrafficLight tl4 = new TrafficLight();

    ArrayList<TrafficLight> lightes = new ArrayList<>();



    public int[] carsCount = new int[4];


    public Intersection(Street one, Street two, Street three, Street four){
        carsCount[0] = one.carsCount;
        carsCount[1] = two.carsCount;
        carsCount[2] = three.carsCount;
        carsCount[3] = four.carsCount;


        lightes.add(tl1);
        lightes.add(tl2);
        lightes.add(tl3);
        lightes.add(tl4);


    }

    public int algorithm(){
        int idx = 0;
        int min = carsCount[0];
        for (int i = 0; i < 4; i++) {
            if(min > carsCount[i]) {
                min = carsCount[i];
                idx = i;
            }

        }
        lightes.get(idx).set_green();
        carsCount[idx] = 9999;
        return idx;
    }



}