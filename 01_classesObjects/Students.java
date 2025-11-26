//Student Class to Calculate Average marks and grade
//Algorithm
/*  1. START
    2. Take Input for students info or create a method
    3. initialize variable(String name, int rollNo, int[] marks, double total, double average, char grade)
    4. calculate 1 by 1. 1st calculateTotal 2nd calculateAverage 3rd calculategrade
    5. print displayStudents
    6. print OUTPUT
    7. END  */

public class Students {

        String name;
        int rollNo;
        int[] marks;
        double total, average; 
        char grade;

        public Students(String name, int rollNo, int[] marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;        
        }

        public void calculateTotal() {
            total = 0;
            for(int mark : marks){
                total = total + mark;
            }
        }

        public void calculateAverage() {
            average = total/marks.length;
        }

        public void calculategrade() {
            if(average >= 90) grade = 'A';
            else if(average >= 80) grade = 'B';
            else if(average >= 70) grade = 'C';
            else if(average >= 60) grade = 'D';
            else grade = 'E';
        }

        public void displayStudents() {
            System.out.println("Name: "+name);
            System.out.println("Roll no: "+rollNo);
            System.out.println("Marks: ");
            for(int mark : marks){
                System.out.print(mark + " ");
            }
            System.out.println();
            System.out.println("Total: "+total);
            System.out.println("Average: "+average);
            System.out.println("Grade: "+grade);
            System.out.println("----------------");
        }




    public static void main(String[] args) {
        Students st1 = new Students("Abhijit", 101, new int[]{80, 70, 99, 81, 61});
        st1.calculateTotal();
        st1.calculateAverage();
        st1.calculategrade();
        st1.displayStudents();
        Students st2 = new Students("Bob", 102, new int[]{90, 96, 69, 67, 81});
        st2.calculateTotal();
        st2.calculateAverage();
        st2.calculategrade();
        st2.displayStudents();
    }
}
