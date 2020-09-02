package com.advance;

public class BiologyTeacher extends Teacher {

    String mainSubject = "Biology";

    public static void main(String[] args) {

        BiologyTeacher missMarissa = new BiologyTeacher();

        System.out.println(missMarissa.getCollegeName());
        System.out.println(missMarissa.getDesignation());
        missMarissa.does();

    }

}
