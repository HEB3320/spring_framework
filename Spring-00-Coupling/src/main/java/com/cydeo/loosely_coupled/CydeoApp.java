package com.cydeo.loosely_coupled;

import com.cydeo.tightly_coupled.Mentor;

public class CydeoApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);

        mentor.manageAccount();





    }



}
