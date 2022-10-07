package edu.vit.corejava.oop;
/*
 * This program covers basics of class and it's methods and objects.
 * Void method is in the class itself, The Test variant uses multiple classes!
 * @author Suteerth Subramaniam
 */
public class ImageOne {
    private Integer height;
    private Integer width;
    private String name;
    private String format;
    private Boolean isTenBit;

    public ImageOne() {
        this.format = "jpg";
        this.isTenBit = false;
    }

    public ImageOne(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    public ImageOne(Integer height, Integer width, String name, String format) {
        this(height, width);
        this.name = name;
        this.format = format;
    }

    public ImageOne(Integer height, Integer width, String name, String format, Boolean isTenBit) {
        this(height, width, name, format);
        this.isTenBit = isTenBit;
    }

    public ImageOne(ImageOne img) {
        this.height = img.height;
        this.width = img.width;
        this.format = img.format;
        this.isTenBit = img.isTenBit;
    }
    // Starting builder patterns
    public ImageOne setHeight(Integer height){
        this.height = height;
        return this;
    }
    public ImageOne setWidth(Integer width){
        this.width = width;
        return this;
    }
    public ImageOne setName(String name){
        this.name = name;
        return this;
    }
    public ImageOne setFormat(String format){
        this.format = format;
        return this;
    }
    public ImageOne setBit(Boolean isTenBit){
        this.isTenBit = isTenBit;
        return this;
    }
    // End of Builder Pattern
    public String toString() {
        return "Image [format=" + format + ", height=" + height + ", isTenBit=" + isTenBit + ", name=" + name
                + ", width=" + width + "]";
    }
    public static void main(String[] args) {
        // Creating img1 without any parameter;
        ImageOne img1 = new ImageOne();
        System.out.println(img1.toString());
        ImageOne img2 = new ImageOne(1920, 1080);
        System.out.println(img2.toString());
        ImageOne img3 = new ImageOne(1920, 1080, "image_two", "png");
        System.out.println(img3.toString());
        ImageOne img4 = new ImageOne(img3).setBit(false).setName("image_three");
        System.out.println(img4.toString());
        ImageOne img5 = new ImageOne(2560, 1440, "image_four", "jpeg", true);
        System.out.println(img5.toString());
        ImageOne img6 = new ImageOne().setHeight(3840)
                                .setWidth(2160)
                                .setName("best")
                                .setFormat("webp")
                                .setBit(true);
        System.out.println(img6.toString());
    }
}
