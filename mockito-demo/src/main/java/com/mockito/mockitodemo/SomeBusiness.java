package com.mockito.mockitodemo;

public class SomeBusiness {
    private DataService dataService;


    int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value:
             data) {
            if(value > greatest)
                greatest = value;
        }
        return greatest;
    }

}


interface DataService{
    int[] retrieveAllData();
}