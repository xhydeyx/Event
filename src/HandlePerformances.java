import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class HandlePerformances {

    Scanner reader=new Scanner(System.in);
    Queue<Performance> performances=new LinkedList<>();

    public void handlePerformances(){
        int choice=0;
        do{
            System.out.println("\n"+"Here are the choices:"+"\n");
            System.out.println("Type 1 to add performances:"+"\n");
            System.out.println("Type 2 to display all the performances:"+"\n");
            System.out.println("Type 3 to start the performances:"+"\n");
            System.out.println("Type 4 to QUIT:"+"\n");
            choice=reader.nextInt();
            reader.nextLine();

            switch(choice){
                case 1:
                    System.out.println("How many performances must be added:");
                    int num=reader.nextInt();
                    reader.nextLine();
                    addPerformances(num);
                case 2:
                    displayPerformances();
                    break;
                case 3:
                    startPerformance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.Please enter a valid choice.");         
            }

        }while(choice!=4);
    }

    public void addPerformances(int num){
        for(int i=0;i<num;i++){
            System.out.println("Enter the Performance ID:");
            String performanceID=reader.nextLine();

            System.out.println("Enter the name of the Performance:");
            String performanceName=reader.nextLine();

            System.out.println("Enter the name of the lead performor:");
            String performanceLeadName=reader.nextLine();

            Performance performance=new Performance(performanceID, performanceName, performanceLeadName);
            this.performances.offer(performance);
        }
    }

    public void displayPerformances(){
        System.out.println("Here are all the values from the queue:"+"\n"+performances);
    }

    public void startPerformance(){
        System.out.println("Here is the first performance:"+"\n"+performances.poll());
    }

}
