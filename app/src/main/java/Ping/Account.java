package Ping;

import java.util.ArrayList;

public class Account {
    private  String Name;
    private final String Birthday;
    private  boolean Driver;
    private final ArrayList<Day> Week;
    private final ArrayList<Contact> ContactList;
    //Account number and a way to store this info

    public Account(){
        this.Name = "Default Name";
        this.Birthday = "01/01/1900";
        this.Driver = false;
        this.Week = new ArrayList<>();
        this.ContactList = new ArrayList<>();
    }

    public Account(String Name, String Birthday, boolean Driver, ArrayList Week, ArrayList ContactList){
        this.Name = Name;
        this.Birthday = Birthday;
        this.Driver = Driver;
        this.Week = Week;
        this.ContactList = ContactList;
    }

    public String getName(){
        return this.Name;
    }

    public String getBirthday(){
        return this.Birthday;
    }

    public boolean isDriver(){
        return this.Driver;
    }

    public ArrayList getWeek(){
        return this.Week;
    }

    public ArrayList getContacts(){
        return this.ContactList;
    }

    public void editName(String name){
        this.Name = name;
    }

    public void editDriver(boolean driver){
        this.Driver = driver;
    }

    public void addContact(Contact newContact){
        this.ContactList.add(newContact);
    }

    public void removeContact(int index){
        this.ContactList.remove(index);
    }

    public void removeContact(Contact contact){
        this.ContactList.remove(contact);
    }
}

