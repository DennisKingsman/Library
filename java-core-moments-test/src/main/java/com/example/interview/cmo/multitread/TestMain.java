package com.example.interview.cmo.multitread;

import com.example.interview.extention.AbstrEx;
import com.example.interview.extention.AbstrSimpleClass;
import com.example.interview.extention.Extender;
import com.example.interview.extention.Races;
import com.example.interview.staticcontext.OutClassChild;

import java.util.LinkedList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        OutClassChild outClassChild = new OutClassChild();
        System.out.println("STOP");
        OutClassChild.InStaticClassChild inStaticClassChild = new OutClassChild.InStaticClassChild();
        System.out.println("STOP");
        OutClassChild.InStaticClassChild.InClassTwo inClassTwo = inStaticClassChild.new InClassTwo();
        System.out.println("STOP");
        AbstrSimpleClass abstrSimpleClass = new AbstrSimpleClass() {};
        abstrSimpleClass.method();
        System.out.println(abstrSimpleClass.getClass());
    }

}
