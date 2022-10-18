import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestInstructor {

    @Test
    public void testImplementation() {
        //given
        Instructor instructor = new Instructor(709L,"Instructor1");
        //when

        Assertions.assertTrue(instructor instanceof ITeacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(389L,"Instructir2");
        Assertions.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(999L,"Instructor3");
        Student student = new Student(890L,"Student");
        Double expected = 8.0;
        instructor.teach(student ,8.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }

    @Test
   public void testLecture(){
       Instructor instructor = new Instructor(999L, "Instructor");
        Student student = new Student(890L,"Student");
        Student student2 = new Student(890L,"Student2");
        Student[] students = {student,student2};
        instructor.lecture(students,8.0);
        Double expected = 4.0;
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);

    }
}
