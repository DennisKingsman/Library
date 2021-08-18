package com.example.interview.extention;

public class MainExtension {

    public static void main(String[] args) {
        result();
    }

    public static void result() {
        System.out.println("No extension with Enum");
        System.out.println("No extension with Singleton");
        System.out.println("No extension with default or private constructor");
        System.out.println("Yes extension with abstract class with private fields");
        System.out.println("Can create object of static inner class");
        System.out.println("Can't create static outer class");
        System.out.println("If clearly extends Object then cannot extend more");
        System.out.println("Collections has private constructor");
        System.out.println("U can extend of inner static class" +
                " and create object and use static methods on class," +
                "and use non static methods of parent inner static class" +
                "(only, not of outer class) on objects");
        System.out.println("U can extend of ArrayList");
        System.out.println("Inner class cannot have static declarations");
        System.out.println("Inner static class can have non-static declarations");
        System.out.println("Can create inner static class object" +
                " inside of inner non static class. " +
                "Even if static class has private constructor");
        System.out.println("Can crate inner static class object" +
                " inside of inner local class");
        System.out.println("Inner non static class object creates by using outer class object.new I()." +
                " U should create outer class object first.");
        System.out.println("Cannot cycling extending. Means A ext B, B ext Z, Z ext A no works.");
        System.out.println("Cannot call outer method from inner static class without creating object");
        System.out.println("Can call outer method from inner non static class" +
                " and local classes without creating an object");
        System.out.println("Can extends from Error");
        System.out.println("Cant define static and non static same methods");
        System.out.println("Can overload static and non static same NAMED methods");
        System.out.println("Outer class and ALL inner classes can have same non static method inside of");
        System.out.println("Inner classes cannot have static declarations");
        System.out.println("Enum can implements interfaces and has oun methods");
        System.out.println("Inner class can extend it's oun outer class." +
                " Static class can extend other non static classes. ");
        System.out.println("Init blocks of inner and outer classes are independent." +
                " Inner classes are not children of its outer classes.");
        System.out.println("Cannot create object of abstract class" +
                " even if it has the constructor and no abstract methods." +
                " But can create anon object.");
        System.out.println("Private methods can't be abstract(obvious)");
        System.out.println("Method with same name and same input can't be defined in class" +
                " even if change vision area or returning type." +
                " To overload method change it's input param. ");
        System.out.println("U can overload method in interface.");
        System.out.println("U cannot downcast view-area privacy in overriding methods from abstract class." +
                " No public to protected");
        System.out.println("U can upgrade view-area privacy in overriding methods from abstract class." +
                " Yes for protected to public.");
        System.out.println("If u change primitive to wrapper when u override method in method signature" +
                "(whether it return type or input param type)," +
                " it won't be overriding." +
                " But u can create wrapper inside of method and put it in the return line. " +
                "U also can use as input param the wrapper when u call the method which requires a primitive var.");
        System.out.println("U cannot define non public method in interface to implement," +
                " so u cannot change view-area in class which do implement it.");
        System.out.println("U can overload overridden methods.");
        System.out.println("Static methods in interface can be private(non public).");
        System.out.println("U can call static method of interface only from Interface name. " +
                "U can't use name of class which implements this interface. ");
    }

}
