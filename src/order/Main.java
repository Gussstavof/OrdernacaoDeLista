package order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person>  personList = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Maria");
        person1.setAge(20);
        personList.add(person1);

        Person person2 = new Person();
        person2.setName("João");
        person2.setAge(18);
        personList.add(person2);

        Person person3 = new Person();
        person3.setName("Mario");
        person3.setAge(19);
        personList.add(person3);


        System.out.println("Sem ordem");
        System.out.println(personList);
        personList.sort(( p1,  p2)-> p1.getName().compareTo(p2.getName()));
        System.out.println("Ordem alfabetica");
        System.out.println(personList);
        System.out.println("Ordem por idade");
        personList.sort((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(personList);
        Collections.reverse(personList);
        System.out.println(personList);
    }
}
