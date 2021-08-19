package com.example.interview.staticcontext;

public class OutClassParent {

    static {
        System.out.println("static block in OutClassParent");
    }

    {
        System.out.println("non static block in OutClassParent");
    }

    public OutClassParent() {
        System.out.println("Constructor in OutClassParent");
    }

    static class InStaticClassParant {

        static {
            System.out.println("static block in InStaticClassParant");
        }

        {
            System.out.println("non static block in InStaticClassParant");
        }

        public InStaticClassParant() {
            System.out.println("Constructor in InStaticClassParant");
        }

        class InClassOne {

            public InClassOne() {
                System.out.println("Constructor in InClassOne");
            }

        }

    }

    class InClassParant {

        {
            System.out.println("non static block in InClassParant");
        }

        public InClassParant() {
            System.out.println("Constructor in InClassParant");
        }

    }

}
