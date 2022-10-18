import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPeople {


    People people;
    @BeforeEach
    public void setUpBeforeEach(){
        people  = new People();
    }

    @Test
    void testAdd(){
        //given
        int expected = 1;
        //when
        people.add(new Person(999L,"Joe"));
        //then
        Assertions.assertEquals(expected,people.count());
    }


    @Test
    void testRemove(){
        //given
        int expected = 1;
        //when
        people.add(new Person(999L,"Joe"));
        people.remove(new Person(999L,"Joe"));
        //then
        Assertions.assertEquals(expected,people.count());
    }

    @Test
    void findByID(){
        Long expected = 999L;
        Person person = new Person(999L,"Joe");
        Long actual = person.getId();
        person.getId();
        Assertions.assertEquals(expected,actual);

    }
}
