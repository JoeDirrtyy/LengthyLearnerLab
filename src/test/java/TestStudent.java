import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class TestStudent {

    @Test
    public void testImplementation() {
        //given
        Student student = new Student(423L,"Student1");
        //when

        Assertions.assertTrue(student instanceof ILearner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(698L,"Student2");
        Assertions.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(69L,"Student3");
        Double expected = 9.0;
        student.learn(9.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }


}
