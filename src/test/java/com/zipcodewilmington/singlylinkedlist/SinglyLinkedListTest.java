package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testConstructor(){
        String expected = "Miral";
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>(expected);

        Assert.assertEquals(expected, linkedList.getHead().getData());
    }

    @Test
    public void testAdd(){
        //given
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();

        //when
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(50);
        linkedList.add(70);
        Integer expected = 4;

        //then
        Assert.assertEquals(expected, linkedList.getSize());

    }

    @Test
    public void testRemove(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");

        //when
        Boolean remove = linkedList.remove(2);

        //then
        Assert.assertTrue(remove);

    }

    @Test
    public void testRemove2(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");

        //when
        linkedList.remove(2);

        //then
        Assert.assertFalse(linkedList.contains("Joye"));
    }

    @Test
    public void testContain(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");
        linkedList.add("Raj");
        System.out.println(linkedList.toString());
        //then
        Assert.assertTrue(linkedList.contains("Miral"));
        Assert.assertTrue(linkedList.contains("Joye"));
        Assert.assertTrue(linkedList.contains("Dev"));

    }

    @Test
    public void testFind(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");

        //then
        Assert.assertEquals((Integer)1, linkedList.find("Miral"));
        Assert.assertEquals((Integer)3, linkedList.find("Dev"));
    }

    @Test
    public void testSize(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");
        Integer expected = 3;

        //then
        Assert.assertEquals(expected, linkedList.getSize());
    }

    @Test
    public void testGetByIndex(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        //when
        linkedList.add("Miral");
        linkedList.add("joye");
        linkedList.add("Dev");

        Assert.assertEquals("joye", linkedList.getByIndex(2));
    }

    @Test
    public void testClone(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");

        //when
        SinglyLinkedList<String> linkedList1 = null;
        try{
            linkedList1 = (SinglyLinkedList<String>) linkedList.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        //then
        Assert.assertEquals(linkedList.toString(), linkedList1.toString());


    }
    ///Check the reverse method<<<<<<<<<<
    @Test
    public void testReverse(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Miral");
        linkedList.add("Joye");
        linkedList.add("Dev");



        //then
        Assert.assertEquals("Dev", linkedList.reverse(linkedList.getHead()).getData());
    }

    @Test
    public void testSort(){
        //given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();
        linkedList.add("Miral");
        linkedList.add("joye");
        linkedList.add("Dev");

        System.out.println(linkedList.getHead().toString());

        linkedList.sort();

        System.out.println(linkedList.getHead().toString());
    }
}
