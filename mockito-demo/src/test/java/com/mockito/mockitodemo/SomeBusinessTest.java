package com.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class SomeBusinessTest {

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusiness business;

    @Test
    public void testFindTheGreatestFromAllDataWithStub(){
        business = new SomeBusiness(new DataServiceStub());
        int number = business.findTheGreatestFromAllData();
        assertEquals(24,number);
    }

    @Test
    public void testFindTheGreatestFromAllDataWithMock(){
        when(dataService.retrieveAllData()).thenReturn(new int[]{24,6,15});

        int number = business.findTheGreatestFromAllData();
        assertEquals(24,number);

    }

    @Test
    public void testFindTheGreatestFromAllDataWithMock_NoValue(){
        when(dataService.retrieveAllData()).thenReturn(new int[]{});

        int number = business.findTheGreatestFromAllData();
        assertEquals(Integer.MIN_VALUE,number);

    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{24,6,15};
    }
}