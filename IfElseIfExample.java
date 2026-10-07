public class IfElseIfExample {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 80) {
            System.out.println("A+");
        } else if (marks >= 70) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}