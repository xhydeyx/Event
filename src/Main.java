import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the total number of people attending the event:");
        Scanner reader=new Scanner(System.in);

        int count=reader.nextInt();
        reader.nextLine();

        System.out.println("Enter Event ID:");
        String eventID=reader.nextLine();
        System.out.println("Enter Event Name:");
        String eventName=reader.nextLine();
        System.out.println("Enter Event Venue:");
        String eventVenue=reader.nextLine();
        System.out.println("Enter Event Date(YYYY-MM-DD):");
        String eventDateInput=reader.nextLine();

        LocalDate eventDate=java.time.LocalDate.parse(eventDateInput);
        Event event=new Event(eventID, eventName, eventVenue, eventDate);

        for(int i=0;i<count;i++){
            System.out.println("Enter attendee name" + (i+1) +":");
            
            String attendeeName=reader.nextLine();
            event.addAttendee(attendeeName);
        }

        organizeEvent(event);
        System.out.println(event);

        reader.close();
    }

    public static void organizeEvent(Event event){
        System.out.println("You can do the following:");
        System.out.println("1.Add attendee");
        System.out.println("2.Remove attendee");
        System.out.println("3.Update attendee");
        System.out.println("4.Find a single attendee");
        System.out.println("5.Get total number of attendee");
        System.out.println("6.Do nothing");
        System.out.println("Enter the choice:");

        Scanner reader=new Scanner(System.in);
        int choice=reader.nextInt();
        reader.nextLine();
 
        switch(choice){
            case 1:
            System.out.println("Add the name:");
            Scanner a=new Scanner(System.in);
            String attendeeName=a.nextLine();
            event.addAttendee(attendeeName);
            break;
            case 2:
            System.out.println("Remove the name:");
            Scanner b=new Scanner(System.in);
            String attendee=b.nextLine();
            event.removeAttendee(attendee);
            break;
            case 3:
            System.out.println("Update the name:");
            Scanner c=new Scanner(System.in);
            String oldAttendee=c.nextLine();
            System.out.println("Enter a new attendee name:");
            Scanner d=new Scanner(System.in);
            String newAttendee=d.nextLine();
            event.updateAttendee(oldAttendee,newAttendee);
            break;
            case 4:
            System.out.println("Find the name:");
            String attendeeToFind=reader.nextLine();
            if(event.findAttendee(attendeeToFind)){
                System.out.println("Found it.");
            }else{
                System.out.println("Did not find.");
            }
            break;
            case 5:
            int totalAttendees=event.getTotalAttendee();
            System.out.println("The total number of attendee is"+totalAttendees);
            break;
            case 6:
            System.out.println("Do nothing.");
            break;
        }
        
        reader.close();

    }

}
