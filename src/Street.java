public class Street {

    public int carsCount = 0;

    // the count of cars in each line
    public int[] lines = {0, 0, 0};


    public Street(int firstLine,  int secLine, int thirdLine){

        lines[0] = firstLine;
        lines[1] = secLine;
        lines[2] = thirdLine;

        carsCount = firstLine+secLine+thirdLine;

    }




}
