import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        Person person = new Person(560,"Person1"){};
        String expectedName = "";
        long expectedId = 423;
        //when
        person.setName(expectedName);
        String actualName = person.getName();
        long actualID = person.getId();
        //then
        Assertions.assertEquals(expectedName,actualName);
        Assertions.assertEquals(expectedId,actualID);
    }
    @Test
    public void testSetName(){
        //given
        Person person = new Person(569L,"Person2"){};
        String expected = "Person2";
        //when
        person.setName(expected);
        //then

        Assertions.assertEquals(expected,person.getName());
    }




}