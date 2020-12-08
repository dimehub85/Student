package com.dimemtl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student("John", "Doe", true, "21.04.2001", 3);
        ObjectMapper m = new ObjectMapper();
        System.out.println(m.writeValueAsString(student));
    }
}
