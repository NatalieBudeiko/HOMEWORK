package homework26;

import java.util.ArrayList;
import java.util.Iterator;

public class GradeSample {
    public static void main(String[] args) {
        ArrayList<Grade> grades = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            grades.add(Grade.getRandomGrade());
        }
        System.out.println(grades);

        for (Iterator<Grade> iterator = grades.iterator(); iterator.hasNext(); ) {
            Grade grade = iterator.next();
            if (grade.isPoor()) iterator.remove();
        }
        System.out.println(grades);
    }
}
