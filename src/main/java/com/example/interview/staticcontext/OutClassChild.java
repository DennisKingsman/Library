package com.example.interview.staticcontext;

public class OutClassChild extends OutClassParent {

    static {
        System.out.println("static block in OutClassChild");
    }

    {
        System.out.println("non static block in OutClassChild");
    }

    public OutClassChild() {
        System.out.println("Constructor in OutClassChild");
    }

    public static class InStaticClassChild {

        static {
            System.out.println("static block in InStaticClassChild");
        }

        {
            System.out.println("non static block in InStaticClassChild");
        }

        public InStaticClassChild() {
            System.out.println("Constructor in InStaticClassChild");
        }

        public class InClassTwo {

            public InClassTwo() {
                System.out.println("Constructor in InClassTwo");
            }

        }

    }

    class InClassChild {

        {
            System.out.println("non static block in InClassChild");
        }

        public InClassChild() {
            System.out.println("Constructor in InClassChild");
        }

    }

}
