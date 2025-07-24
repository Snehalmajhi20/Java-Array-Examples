//create an array of marks and make them sum and avg or percentage
public class ArraySum {
    public static void main(String[] args) {
        double [] marks = {92.5,95,97,75.5,89,72};
        double sum = 0;
        double totalmarks = 600;
        for (double num : marks){
            System.out.println(num);
            sum += num;
        }
        System.out.println("The total sum of marks: "+sum);
        double secured = (sum/totalmarks)*100;
        System.out.println("the avg or percentage of mark is: "+ secured);
    }
}
