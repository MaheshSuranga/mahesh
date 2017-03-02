/**
 * Created by asus on 3/2/2017.
 */
public class Main {

    public static void main(String args[]){
        Main main = new Main();
        Person person = new Person();
        person.setName("Mahesh");
        person.setEmail("msurazz@gmail.com");
        System.out.println(person);
    }
    public Person saveperson(Person person){
        if(person == null){
            throw new IllegalArgumentException();
        }else{
            person.setId("p100");
            return person;
        }

    }

}
