package com.company.JavaOOP;

public class Animal {
    public int no_of_feet;
    private String color;
    float weight;

    public Animal(){
        System.out.println("An object has been created!");
    }

    public Animal(int no_of_feet, String color, float weight){
        this.no_of_feet = no_of_feet;
        this.color = color;
        this.weight = weight;
    }

    public Animal(int no_of_feet, String color){
        this.no_of_feet = no_of_feet;
        this.color = color;
    }

    void eat(){

    }

    void sleep(){

    }

    void walk(){

    }

    int getNo_of_feet(){
        return no_of_feet;
    }

    public String getColor(String userName, String password){
        if(userName.equals("abcd") && password.equals("abcd@1234"))
            return color;
        else
            return "Not A Valid User!";
    }

    public void setColor(String userName, String password, String color){
        if(userName.equals("abcd") && password.equals("abcd@1234")){
            this.color = color;
        }

    }
}
