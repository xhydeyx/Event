import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.HashMap;

public class Event{
    Scanner reader=new Scanner(System.in);
    public final static int capacity=200;
    
    HashMap<String,Attendee> seatDetails=new HashMap<>(200,0.6f);

    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    ArrayList<Attendee> eventAttendees=new ArrayList<>();

    public Event(){}

    public String getEventID(){
        return eventID;
    }
        
    public String getEventName(){
        return eventName;
    }
        
    public String getEventVenue(){
        return eventVenue;
    }
        
    public LocalDate getEventDate(){
        return eventDate;
    }
    
    public void setEventID(String eventID){
        this.eventID=eventID;
    }
        
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
        
    public void setEventVenue(String eventVenue){
        this.eventVenue=eventVenue;
    }

    public void setEventDate(LocalDate eventDate){
        this.eventDate=eventDate;
    }

    public void setSeatDetails(String seat,Attendee attendee){
        seatDetails.put(seat,attendee);
    }

    public void getSeatDetails(String seat){
        System.out.println("The details for the seat"+seat+"are as follows:"+"\n"+seatDetails.get(seat));
    }

    public void organizeEvent(int choice){
        
        switch(choice){
           case 1:
               System.out.println("Enter the Event ID:");
               String id=reader.nextLine();
               setEventID(id);
        
               System.out.println("Enter the name of the Event:");
               String eventName=reader.nextLine();
               setEventName(eventName);
        
               System.out.println("Enter the Event Date(YYYY-MM-DD):");
               LocalDate date=LocalDate.parse(reader.nextLine());
               setEventDate(date);
        
               System.out.println("Enter the event's venue:");
               String venue=reader.nextLine();
               setEventVenue(venue);
            case 2:
                System.out.println("How many attendees are coming?");
                int num=reader.nextInt();
                reader.nextLine();

                for(int i=0;i<num;i++){
                System.out.println("Enter the name of the attendee:");
                String name=reader.nextLine();

                System.out.println("Enter the gender of the attendee:");
                char gender=reader.nextLine().charAt(0);

                System.out.println("Enter the age of the attendee:");
                int age=reader.nextInt();
                reader.nextLine();

                System.out.println("Enter the seatNo of the attendee:");
                String seat=reader.nextLine();

                Attendee newAttendee=new Attendee(name, gender, age, seat);

                eventAttendees.add(newAttendee);
                //seatDetails.put(seat,newAttendee);
                setSeatDetails(seat,newAttendee);
                }
                System.out.println("\n"+"All the attendee were added successfully to the List.");
            case 3:
                System.out.println("Enter the name of:");
                String nameToRemove=reader.nextLine();

                for(Attendee attendee:eventAttendees){
                    if(nameToRemove.equals(attendee.getName())){
                        eventAttendees.remove(attendee);
                        break;
                    }
                }
            case 4:
                System.out.println("Enter the name of the attendee you want to update:");
                String nameToUpdate=reader.nextLine();

                for(Attendee attendee:eventAttendees){
                    if(nameToUpdate.equals(attendee.getName())){
                        System.out.println("Enter the new name,or enter null if you don't want to update:");
                        String newName=reader.nextLine();
                        if(!newName.equals("null")){
                            attendee.setName(newName);
                        }

                        System.out.println("Enter the new nage,or enter 0 if you don't want to update:");
                        int newAge=reader.nextInt();
                        reader.nextLine();
                        if(newAge!=0){
                            attendee.setAge(newAge);
                        }

                        break;
                    }
                }
            case 5:
                System.out.println("Enter the name of the attendee to find:");
                String nameToFind=reader.nextLine();
                for(Attendee attendee:eventAttendees){
                   System.out.println(attendee);
                   if(attendee.getName().equals(nameToFind)){
                       System.out.println(attendee);
                       break;
                   }
                }
                break;
            case 6:
                System.out.println("Here is the list of attendees:"+"\n"+eventAttendees);
                break;
            case 7:
                HandleComplementaryPasses compPass=new HandleComplementaryPasses();
                compPass.handleComplementaryPasses();
                break;
            case 8:
                HandlePerformances performance=new HandlePerformances();
                performance.handlePerformances();
                break;
            case 9:
                System.out.println("Enter the seat number to find its details:");
                String seat=reader.nextLine();
                getSeatDetails(seat);
                break;
            case 10:
                break;
            default:
                System.out.println("Invalid choice"); 
        }

    }

}