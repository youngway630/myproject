package com.wei;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
        Person p = new Person(67f, 1.8f);
        p.hello();
       /* p.weight = 67f;
        p.height = 1.8f;*/
        System.out.println(p.bmi());

        int score = 88;
//        System.out.println(score >= 80);
//        System.out.println(score > 80 && score < 90);
        System.out.println(score < 80 || score > 90);

        char c = 'A';
        System.out.println(c > 'a');

        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Wei";*/
    }
}
