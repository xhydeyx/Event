import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Event event=new Event(null, null, null, null);

        int choice=0;
        do{

            System.out.println("\n"+"Here's what you can do in the program"+"\n");
            System.out.println("Type 1 to enter event details:"+"\n");
            System.out.println("Type 2 to enter attendee names that are coming to the event:"+"\n");
            System.out.println("Type 3 to remove an attendee from the List:"+"\n");
            System.out.println("Type 4 to update an attendee in the List:"+"\n");
            System.out.println("Type 5 to search for an attendee in the List:"+"\n");
            System.out.println("Type 6 to display all the attendees from the event:"+"\n");
            choice=scanner.nextInt();
            event.organizeEvent(choice);
        }while(choice!=7);
    scanner.close();
    }
}
