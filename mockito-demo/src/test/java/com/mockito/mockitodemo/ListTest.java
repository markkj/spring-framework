package com.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test(){
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(10).thenReturn(20);

        assertEquals(10,listMock.size());

        assertEquals(20,listMock.size());
    }


    @Test
    public void testGet(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
        assertEquals("Some String",listMock.get(0));
        assertEquals("Some String",listMock.get(1));
    }
}
