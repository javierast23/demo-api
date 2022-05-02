package com.nisum.demo.repository;

import com.nisum.demo.model.People;
import java.util.ArrayList;

public class PeopleRepository {

    public static ArrayList<People> newPeople() {

        ArrayList<People> father = new ArrayList();
        ArrayList<People> sons_1 = new ArrayList();
        ArrayList<People> sons_2 = new ArrayList();

        People s1 = new People();
        s1.setName("Sid");
        s1.setLastName("Gifaldi");
        s1.setRut("1.111.111-1");
        s1.setAge(16);
        s1.setSons(null);
        sons_1.add(s1);

        People s2 = new People();
        s2.setName("Harold");
        s2.setLastName("Berman");
        s2.setRut("2.222.222-2");
        s2.setAge(15);
        s2.setSons(null);
        sons_1.add(s2);

        People p1 = new People();
        p1.setName("Helga");
        p1.setLastName("Pataki");
        p1.setRut("3.333.333-3");
        p1.setAge(17);
        p1.setSons(sons_1);
        father.add(p1);

        People s3 = new People();
        s3.setName("Doris");
        s3.setLastName("Santander");
        s3.setRut("4.444.444-4");
        s3.setAge(20);
        s3.setSons(null);
        sons_2.add(s3);

        People s4 = new People();
        s4.setName("Berta");
        s4.setLastName("Santander");
        s4.setRut("5.555.555-5");
        s4.setAge(21);
        s4.setSons(null);
        sons_2.add(s4);

        People p2 = new People();
        p2.setName("Lucas");
        p2.setLastName("Santander");
        p2.setRut("6.666.666-6");
        p2.setAge(22);
        p2.setSons(sons_2);
        father.add(p2);

        return father;

    }
}
