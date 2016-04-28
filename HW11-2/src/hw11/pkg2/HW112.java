
package hw11.pkg2;

import java.util.ArrayList;

public class HW112
{

    public static void main(String[] args) 
    {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("bob"));
        people.add(new Student("bill"));
        people.add(new Employee("steve"));
        people.add(new Faculty("jane"));
        people.add(new Staff("pat"));
        
        //forloop( objectype[collection varName: collection)
        for(Person p: people)
        {
            System.out.println(p.toString());
            //System.out.println(p);  alternative
        }
        //Identical statment
        //for (int i = 0; i < people.size(); i++)
        //{
        //    Person p: people.get(i);
        //    p.toString();
        //}
        
    }
        
}
