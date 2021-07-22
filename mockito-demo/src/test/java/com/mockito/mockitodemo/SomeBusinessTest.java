package com.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        SomeBusiness business = new SomeBusiness(new DataServiceStub());
        int number = business.findTheGreatestFromAllData();
        assertEquals(24,number);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{24,6,15};
    }
}