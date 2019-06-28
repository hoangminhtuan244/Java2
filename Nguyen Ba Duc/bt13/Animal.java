/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt13;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public abstract class Animal {

    String name;
    int age;
    String description;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten con vat: ");
        name = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Nhap mo ta: ");
        description = input.nextLine();
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", description=" + description + '}';
    }

    public abstract void tiengKeu();
}
