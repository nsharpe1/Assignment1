import java.util.Arrays;

public class TemperatureAboveAverage {
    int arr[] = null;

    public TemperatureAboveAverage(int sizeofArray){
        arr = new int[sizeofArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert (int location, int valueEntered){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueEntered;
                System.out.println("Successfully entered");
            } else {
                System.out.println("The location is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index top access array");
        }
    }

    public static void main(String[] args) {
        TemperatureAboveAverage temperatureAboveAverage = new TemperatureAboveAverage(5);
        temperatureAboveAverage.insert(0,23);
        temperatureAboveAverage.insert(1,26);
        temperatureAboveAverage.insert(2,29);
        temperatureAboveAverage.insert(3,32);
        temperatureAboveAverage.insert(4,35);
        int length = temperatureAboveAverage.arr.length;
        int sum = 0;
        for (int i = 0; i < temperatureAboveAverage.arr.length; i++) {
            sum += temperatureAboveAverage.arr[i];
        }
        double temperatureAverage = sum / length;
        int abovetemperatureAverage = 0;
        for (int i = 0; i < temperatureAboveAverage.arr.length; i++) {
            if (temperatureAboveAverage.arr[i] > temperatureAverage) {
                abovetemperatureAverage++;
            }
        }
        
        System.out.println(Arrays.toString(temperatureAboveAverage.arr));
        System.out.println("Average temperature = " + temperatureAverage);
        System.out.println(abovetemperatureAverage + " numbers are above the average temperature");
    }
}
