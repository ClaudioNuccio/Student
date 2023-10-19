public class Main {
    public static void main(String[] args) {

        Student firstStudent = new Student("Francesco", "Virgulini");
        firstStudent.setID(42);


        System.out.println("The name of the first student is " + firstStudent.getName());
        System.out.println("The surname of the first student is " + firstStudent.getSurname());
        System.out.println("The ID of the first student is " + firstStudent.getID());
    }
}