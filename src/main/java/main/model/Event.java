package main.model;

import java.util.Date;

//Pakkinn Event geymir

/*
    Höfundar

    Melkorka Mjöll Jóhannesdóttir - mmj8@hi.is

 */

public class Event {
    private String title;
    private String location;
    private Date timeBegin;
    private Date timeEnd;
    private String description;
    private int id;
    private boolean deleted;

    public Event(String title, String location, Date timeBegin, Date timeEnd, String description, int id, boolean deleted) {
        this.title = title;
        this.location = location;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.description = description;
        this.id = id;
        this.deleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public Date getTimeBegin() {
        return timeBegin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public boolean getDeleted() {
        return deleted;
    }
}
