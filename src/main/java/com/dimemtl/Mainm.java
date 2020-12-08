package com.dimemtl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mainm {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"sex\":true,\"birthday\":\"21.04.2001\",\"gpa\":3}";
        ObjectMapper m = new ObjectMapper();
        Student student = m.readValue(json, Student.class);
        System.out.println(m.writeValueAsString(student));
    }
}
