import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startTime = 0;
        int endTime = 0;
        int[] profit= new int[n];
        System.out.println("Enter job start time, end time, and earnings");
        if(n>0 && n<100){
        for(int i = 0; i < n; i++){
             startTime = sc.nextInt();
             endTime = sc.nextInt();
             profit[i] = sc.nextInt();
        }
    }
            int sum = 0;
            int largest = profit[0];
            if(startTime < endTime) {
            for (int i = 0; i < profit.length; i++) {
                if (profit[i] > largest) {
                    largest = profit[i];
                }
                sum += profit[i];
            }
        }
            System.out.println("The number of tasks and earnings available for others");
            System.out.println("Task :"+" "+ (n-1));
            System.out.println("Earnings :"+" "+ (sum-largest));

    }
}