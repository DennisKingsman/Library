package com.example.interview.extention;

import com.example.interview.inner.classes.OuterClass;

public class StaticEx {

    private int outherField;


    static void sameMethod(int a) {
        System.out.println(a);
    }

    public void outerMethod() {
        System.out.println("Outer method");
    }

    static class InnerStaticClass extends OuterClass {

        private int[] a = new int[2];
        private int f;

        public InnerStaticClass(int f) {
            super(1, 2);
            this.f = f;
        }


        static void sameMethod(int a) {
            System.out.println(a);
        }

        public static void sayHello() {

            StaticEx e = new StaticEx();
            e.outerMethod();
            System.out.println("Hello");
        }

        public int getF() {
            return f;
        }

        public void setF(int f) {
            this.f = f;
        }

    }

    class InnerClass {

        public InnerClass() {
            outerMethod();
            StaticEx e = new StaticEx();
            e.outherField = 2;
            e.outerMethod();
            outherField = 23;
        }


        public void method() {
            InnerStaticClass var = new InnerStaticClass(2);
            System.out.println("inner class method" + var.getF());

            class InnerMethodClass {

                public int z;

                public int getZ() {
                    outerMethod();
                    InnerStaticClass var = new InnerStaticClass(2);
                    return z;
                }

                public void setZ(int z) {
                    this.z = z;
                    outherField = 3;
                    outerMethod();
                }

            }
        }

    }

}
