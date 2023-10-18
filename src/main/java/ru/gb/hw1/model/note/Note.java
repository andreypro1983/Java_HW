package ru.gb.hw1.model.note;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Note {
    int id;
    String message;
    LocalDateTime createdDate;
    private static final String DATE_FORMAT ="dd.MM.yyyy HH:mm:ss";


    public Note (String message){
        this.message = message;
        this.createdDate = LocalDateTime.now();
    }

    public void setId (int id){
        this.id=id;
    }

    public String getShortInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        String formattedDate = createdDate.format(format);
        return formattedDate + " -> "+ message;
    }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        String formattedDate = createdDate.format(format);
        return "id=" + id +
                ", message='" + message + '\'' +
                ", createdDate=" + formattedDate;
    }
}
