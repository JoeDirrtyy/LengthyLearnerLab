public class Student extends Person implements ILearner{

    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOFHours) {
        totalStudyTime = totalStudyTime + numberOFHours;


    }
    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }


}