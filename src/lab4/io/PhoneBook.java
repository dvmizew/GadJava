package lab4.io;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {
    private int counter;
    private Contact[] contacts = new Contact[10];

    public PhoneBook(String inputFile) {
        Scanner s = null;
        try {
            s = new Scanner((new BufferedReader(new FileReader(inputFile))));
            String name, number;
            while(s.hasNext()) {
                name = s.next();
                if (s.hasNext()) {
                    number = s.next();
                    storeContact(new Contact(name,number));
                }
            }
        }catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (s != null)
                s.close();
        }
    }

    private void storeContact(Contact contact) {
        if (counter < contacts.length) {
            contacts[counter++] = contact;
        }
        else {
            Contact[] newContacts = new Contact[contacts.length * 2];
            int i = 0;
            for(Contact currentContact: contacts){
                newContacts[i++] = currentContact;
            }
            newContacts[i++] = contact;
            contacts = newContacts;
            counter = i;
        }
    }
    public String toString() {
        String toReturn = "";
        for (int i = 1; i< counter; i++) {
            toReturn += contacts[i] + "\n";
        }
        return toReturn;
    }

    public Contact findContact(String name) {
        for (int i = 0; i < counter; i++) {
            if (contacts[i].getName().equals(name)) {
                return contacts[i];
            }
        }
        return null;
    }
}
