import java.util.ArrayList;
import java.time.LocalDate;

public class Event {

    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID,String eventName,String eventVenue,LocalDate eventDate){
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventVenue=eventVenue;
        this.eventDate=eventDate;
        this.eventAttendees=new ArrayList<>();
    }

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

    public ArrayList<String> getEventAttendees(){
        return eventAttendees;
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

    public void setEventAttendees(ArrayList<String> eventAttendees){
        this.eventAttendees=eventAttendees;
    }

    public void addAttendee(String attendeeName){
        eventAttendees.add(attendeeName);
    }

    public void removeAttendee(String attendee){
        eventAttendees.remove(attendee);
    }

    public boolean findAttendee(String attendeeName){
        return eventAttendees.contains(attendeeName);
    }

    public int getTotalAttendee(){
        return eventAttendees.size();
    }

    public void updateAttendee(String oldAttendee,String newAttendee){
        if(eventAttendees.contains(oldAttendee)){
            int index=eventAttendees.indexOf(oldAttendee);
            eventAttendees.set(index,newAttendee);
        }
    }

    @Override
    public String toString(){
        return "The details of the event:" + "\n"+
        "Event ID:" + eventID +"\n"+
        "Event Name:"+ eventName +"\n"+
        "Event Venue"+ eventVenue +"\n"+
        "Event Date"+ eventDate +"\n"+
        "Event attendees"+eventAttendees;
    }

}
