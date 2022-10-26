package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBook {

    Node head;
    Node tail;
    int size = 0;


    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void add(String firstName, String lastName, String email, int phoneNumber) {
        Contact contact = new Contact(firstName, lastName, email, phoneNumber);
        Node node = new Node(contact);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;

        }
        size++;
    }

    public void printPhoneBook() {

        if (head == null) {
            System.out.println("Phonebook is empty");
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.contact);
            current = current.next;
        }


    }

    public Contact findByFirstName(String firstName) {
        if (head == null) {
            System.out.println("Phonebook is empty");
        }

        Node current = head;
        while (current != null) {
            if (current.contact.getFirstName().equals(firstName)) {
                return current.contact;
            }

            current = current.next;
        }
        throw new NoSuchElementException("This firstname dosn't exist! ");
    }

    public List<Contact> findAllByLastName(String lastName) {
        if (head == null) {
            System.out.println("Phonebook is empty");
        }

        Node current = head;
        List<Contact> contactList = new ArrayList<>();
        while (current != null) {
            if (current.contact.getLastName().equals(lastName)) {
                contactList.add(current.contact);

            }


            current = current.next;

        }
        if (contactList.size() == 0)
            throw new NoSuchElementException("This contact dosn't exist! ");
        return contactList;

    }


    public void deleteByFirstName(String firstName) {

    }

    public void deleteAllMatchingLastName(String lastName) {

    }

    public List<Contact> findAll() {
        return null;
    }

}
