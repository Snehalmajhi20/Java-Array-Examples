// Whether array value present or not in array index
public class Arrayornot {
    public static void main(String[] args) {
        double [] num = {92.5,95,97,75.5,89,72};
        double value = 92.5;
        boolean isInArray =false;
        for (double a: num){
            if(value==a){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value of Array is present!");
        }
        else {
            System.out.println("The value of Array is not present!");
        }
    }
}
