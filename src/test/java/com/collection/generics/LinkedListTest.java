package com.collection.generics;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void givenInsertValue_WhenAtFirstOrLastposition_ShouldReturntrue(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        Assert.assertEquals(3,linkedList.size());
    }

    @Test
    public void givenInsertvalue_WhenAtFirstOrLastPosition_ShouldReturnfalse(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Assert.assertNotEquals(3,linkedList.size());
    }

    @Test
    public void givenRemoveValue_WhenAtFirstOrLastPosition_ShouldReturntrue(){
        LinkedList linkedList = new LinkedList();
        linkedList.removeall(1);
        linkedList.removeall(2);
        linkedList.removeall(3);
        Assert.assertEquals(0,linkedList.size());
    }

    @Test
    public void givenRemoveValue_WhenFirstToLastPosition_ShouldReturnfalse(){
        LinkedList linkedList = new LinkedList();
        linkedList.removeall(1);
        linkedList.removeall(2);
        linkedList.removeall(3);
        Assert.assertNotEquals(3,linkedList.size());
    }
}
