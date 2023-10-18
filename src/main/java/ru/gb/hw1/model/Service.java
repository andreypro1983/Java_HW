package ru.gb.hw1.model;

import ru.gb.hw1.Console;
import ru.gb.hw1.model.note.Note;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private Console console;
    private FileHandler fileHandler;
    private int counter;
    private List<Note> listNotes;

    private final static String PATH_FILE ="src/main/java/ru/gb/model/db/notes.txt";

    public Service (){
        this.console = new Console();
        this.fileHandler = new FileHandler();
        this.counter = 0;
        this.listNotes = new ArrayList<Note>();
        console.setService(this);

    }

    public boolean addNote(String message){
        if(!message.isBlank()){
            Note newNote = new Note(message);
            newNote.setId(counter);
            counter++;
            listNotes.add(newNote);
            fileHandler.save(PATH_FILE,newNote.getShortInfo());
            return true;
        } else return false;
    }

    public String showNotes(){
        StringBuilder sb = new StringBuilder();
        if(!listNotes.isEmpty()) {
            for (Note value : listNotes) {
                sb.append(value.toString()).append("\n");
            }
        } else sb.append("Записи отсутствуют");
        return sb.toString();
    }

    public void start(){
        console.start();
    }
}
