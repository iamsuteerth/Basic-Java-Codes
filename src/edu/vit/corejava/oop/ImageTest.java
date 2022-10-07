package edu.vit.corejava.oop;

import java.util.Scanner;

/*
 * This program is to demonstrate Array of objects in java while also following appropriate conventions
 * 
 * @author Suteerth Subramaniam
 * @since 18-08-2022
 * @version 1.0
 */
class Image {
    // Property declaration
    private Integer height;
    private Integer width;
    private String name;
    private String format;
    private Boolean isTenBit;

    // No argument constructor manually created
    public Image() {
    };

    // Constructor which takes in parameters for ALL properties
    public Image(Integer height, Integer width, String name, String format, Boolean isTenBit) {
        this.height = height;
        this.width = width;
        this.isTenBit = isTenBit;
        this.name = name;
        this.format = format;
    }

    // Copy Constructor which copies all properties except name
    public Image(Image img) {
        this.height = img.height;
        this.width = img.width;
        this.format = img.format;
        this.isTenBit = img.isTenBit;
    }

    // Getters and Setters for individual parameters
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getIsTenBit() {
        return isTenBit;
    }

    public void setIsTenBit(Boolean isTenBit) {
        this.isTenBit = isTenBit;
    }

    // toString method which returns all properties in form of a string
    public String toString() {
        return ("Image [Name = " + name + "." + format + ", height=" + height + ", width=" + width + ", 10 Bit="
                + isTenBit + "]");
    }
}

public class ImageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Image img[] = new Image[3];
        for (int i = 0; i < 3; i++) {
            img[i] = new Image();
        }
        int i = 1;
        for (Image image : img) {
            System.out.println("Enter Details for image "+i);
            System.out.print("Enter Name : ");
            image.setName(sc.nextLine());
            System.out.println("Enter Height");
            image.setHeight(sc.nextInt());
            System.out.println("Enter Width");
            image.setWidth(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter format");
            image.setFormat(sc.nextLine());
            System.out.println("Is the image in 10 bit format? (Bool)");
            image.setIsTenBit(sc.nextBoolean());
            i++;
        }
        for (Image image : img) {
            System.out.println(image.toString());
        }
        sc.close();
    }
}