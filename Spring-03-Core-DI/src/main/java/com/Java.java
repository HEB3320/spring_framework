package com;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {


    OfficeHours officeHours;

    //Spring 4.3 and on no need this annotation to inject other object into this class also no need to create
    //constructor when use lombok
//@Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
 //   }

    public void getTeachingHours (){

        System.out.println("Weekly Java Teaching Hours: " + (20 + officeHours.getHours()));
    }
}
