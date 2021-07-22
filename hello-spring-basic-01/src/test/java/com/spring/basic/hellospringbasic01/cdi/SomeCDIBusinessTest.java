package com.spring.basic.hellospringbasic01.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
//@ContextConfiguration(locations = "/testContext.xml")
@ExtendWith(MockitoExtension.class)
class SomeCDIBusinessTest {

    @InjectMocks
    SomeCDIBusiness business;

    @Mock
    SomeCDIDao someCDIDao;

    @Test
    public void testGetGreatestValue(){
        Mockito.when(someCDIDao.getData()).thenReturn(new int[]{200,100,25});

        int result = business.findGreatest();
        assertEquals(100,result);
    }

    @Test
    public void testGetGreatestValueNoValue(){
        Mockito.when(someCDIDao.getData()).thenReturn(new int[]{});

        int result = business.findGreatest();
        assertEquals(Integer.MIN_VALUE,result);
    }
}