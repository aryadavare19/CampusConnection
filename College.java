import java.util.ArrayList;
import java.util.List;

class UserAuthentication{
    void signUp(){

    }
    void login(){

    }
}
class MarketPlaceLostAndFound{
    void lost(){

    }
    void found(){

    }
    void buy(){

    }
    void sell(){

    }
    void ContentManagement(){

    }
    void search(){}
}
class Event {
    String title;
    String description;
    String date;

    public Event(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }
}

class Announcement {
    String title;
    String content;
    String date;

    public Announcement(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }
}

public class College {
    List<Event> events;
    List<Announcement> announcements;

    public College() {
        events = new ArrayList<>();
        announcements = new ArrayList<>();
    }

    public void addEvent(String title, String description, String date) {
        Event event = new Event(title, description, date);
        events.add(event);
    }

    public void addAnnouncement(String title, String content, String date) {
        Announcement announcement = new Announcement(title, content, date);
        announcements.add(announcement);
    }

    public void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events currently.");
        } else {
            System.out.println("Events:");
            for (Event event : events) {
                System.out.println(event.title + " - " + event.description + " - " + event.date);
            }
        }
    }

    public void viewAnnouncements() {
        if (announcements.isEmpty()) {
            System.out.println("No announcements currently.");
        } else {
            System.out.println("Announcements:");
            for (Announcement announcement : announcements) {
                System.out.println(announcement.title + " - " + announcement.content + " - " + announcement.date);
            }
        }
    }

    public static void main(String[] args) {
        College college = new College();

        // Adding events
        college.addEvent("Seminar on AI", "Introduction to Artificial Intelligence", "2024-04-10");
        college.addEvent("Workshop on Python", "Learning Python programming language", "2024-04-15");

        // Adding announcements
        college.addAnnouncement("Holiday Notice", "College will remain closed on April 20th, 2024", "2024-04-20");
        college.addAnnouncement("New Course Offering", "Introduction to Data Science course now available", "2024-05-01");

        // Viewing events and announcements
        college.viewEvents();
        college.viewAnnouncements();
    }
}



