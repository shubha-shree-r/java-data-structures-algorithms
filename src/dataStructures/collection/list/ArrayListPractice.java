package src.dataStructures.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListPractice {

    private String name;
    private int grade;
    private int id;

    public ArrayListPractice(String name, int grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", Grade:" + grade + ", Id:" + id + "";
    }

    public static void main(String[] args) {
        List<ArrayListPractice> studentDetails = new ArrayList<>();
        // adding data to the list by creating new instance of class
        studentDetails.add(new ArrayListPractice("Shubha", 89, 1));
        studentDetails.add(new ArrayListPractice("Jeevan", 99, 2));
        studentDetails.add(new ArrayListPractice("Bhagya", 100, 3));


        // Display student records
        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());
        }

        System.out.println("...................................");

        // Find a student by name
        String searchName = "Shubha";
        for (ArrayListPractice student : studentDetails) {
            if (student.getName().equals(searchName)) {
                System.out.println("Found student: " + student.getName());
                break;
            }
        }
        System.out.println("...................................");

        studentDetails.remove(0);
        String searchRemovedName = "Shubha";
        for (ArrayListPractice student : studentDetails) {
            if (student.getName() == searchRemovedName) {
                System.out.println("Removed student:" + student.getName());
                break;
            }

        }


        // Display student records after updating
        System.out.println("Updated List");
        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }


        System.out.println("...................................");
        studentDetails.sort(Comparator.comparing(ArrayListPractice::getName));
        System.out.println("Sorted by name in ascending order");

        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());
        }
        System.out.println("...................................");

        studentDetails.sort(Comparator.comparing(ArrayListPractice::getName).reversed());
        System.out.println("Sorted by name in descending order");

        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());


        }
        System.out.println("...................................");

//        get method
        System.out.println(studentDetails.get(1));

        System.out.println("...................................");

//        set method
        studentDetails.set(1, new ArrayListPractice("Shubha", 120, 1));

        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());


        }
        System.out.println("...................................");

        System.out.println("Size of the list: " + studentDetails.size());

        studentDetails.add(new ArrayListPractice("Bhagya", 100, 3));
        studentDetails.add(new ArrayListPractice("Vaishnavi", 88, 4));
        studentDetails.add(new ArrayListPractice("Manoj", 100, 5));
        studentDetails.add(new ArrayListPractice("Puttaswamy", 100, 6));

        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());
        }
        System.out.println("...................................");
        studentDetails.sort(Comparator.comparing(ArrayListPractice::getId));
        System.out.println("Sorted by name in ascending order");

        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());
        }

        studentDetails.remove(2);

        System.out.println("...................................");

        System.out.println("Removed index 2 from list");

        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());
        }
        studentDetails.clear();

        System.out.println("...................................");

        System.out.println("Cleared everything");
        for (ArrayListPractice student : studentDetails) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade() + ", Id: " + student.getId());
        }

        System.out.println("...................................");

        if(studentDetails.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is full!");
        }

    }
}
