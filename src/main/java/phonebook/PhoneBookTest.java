package phonebook;

import java.util.List;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("FakeName", "FakeLastName", "abc1@cydeo.com", 1234567890);
        phoneBook.add("Burulai", "Abdrakhmanova", "burulai@cydeo.com", 1234567890);
        phoneBook.add("Dilara", "Aslandogan", "dilara@cydeo.com", 1234567890);
        phoneBook.add("FakeName", "FakeLastName", "abc2@cydeo.com", 1234567890);
        phoneBook.add("FakeName", "FakeLastName", "abc3@cydeo.com", 1234567890);
        phoneBook.add("Khashayar", "Shayesteh", "abc@cydeo.com", 1234567890);
        phoneBook.add("Abc", "AbcLastName", "abc@cydeo.com", 1234567890);
        phoneBook.add("Madiyar", "Damen", "madiyar@cydeo.com", 1234567890);
        phoneBook.add("Muhammet", "Sengez", "muhammet@cydeo.com", 1234567890);
        phoneBook.add("Natalie", "Chobu", "natalie@cydeo.com", 1234567890);
        phoneBook.add("Qadir", "Ibrahimov", "qadir@cydeo.com", 1234567890);
        phoneBook.add("Yasin", "Tawasulli", "yasin@cydeo.com", 1234567890);
        phoneBook.add("Zhibek", "Toktogulova", "zhibek@cydeo.com", 1234567890);
        phoneBook.add("FakeName", "FakeLastName", "abc4@cydeo.com", 1234567890);

        System.out.println(" ***** Print all records*****");
        phoneBook.printPhoneBook();

        System.out.println("***** Find the first record of which first name is Abc *****");
        System.out.println(phoneBook.findByFirstName("Abc"));

//        System.out.println("***** Find the all records of which last name is FakeLastName*****");
//        phoneBook.findAllByLastName("FakeLastName").forEach(System.out::println);

//        System.out.println("***** Delete the first occurrence of which first name is FakeName*****");
//        phoneBook.deleteByFirstName("FakeName");
//        phoneBook.printPhoneBook();
//
//        System.out.println("***** Delete the all records of which last name is FakeLastName*****");
//        phoneBook.deleteAllMatchingLastName("FakeLastName");
//        phoneBook.printPhoneBook();
//
//        System.out.println("***** Show the all records in ArrayList*****");
//        phoneBook.findAll().forEach(System.out::println);
//
//        System.out.println("***** Show the last size of linkedList *****");
//        System.out.println(phoneBook.size());
    }
}
