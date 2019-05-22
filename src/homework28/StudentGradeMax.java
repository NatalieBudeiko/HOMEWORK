package homework28;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentGradeMax {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            grades.add((int) (Math.random() * 10));
        }
        System.out.println(grades);

        Integer max = grades.get(0);
        for (Iterator<Integer> iterator = grades.iterator(); iterator.hasNext(); ) {
            Integer grade = iterator.next();
            if (grade > max) {
                max = grade;

            }
        }
        System.out.println("Your max grade is " + max);
    }
}
