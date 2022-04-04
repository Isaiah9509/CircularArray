package Circular.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//Create a class that supports an array-like data structure which can be efficiently rotated. If possible, the class
//should use a generic type and should support iteration via the standard enhanced for-loop.
public class CircularArray<T>{
    //Setting a private array (array like data structure)
    private T[] array;
    private int currentIndex;

    //Array Constructor.
    CircularArray(T... objects){
        this.array = objects;
    }

    //Set the currentIndex
    public void setIndex(int number){
        this.currentIndex = number;
    }

    //Move the index to the right.
    public void moveRight(){
        this.currentIndex += 1;
    }

    //Move index to the left.
    public void moveLeft(){
        this.currentIndex -= 1;
    }

    //print objects in the array using enhanced for loop
    public void printArray(){
        for(Object o: array) {
            System.out.println(o);
        }
    }

    //get object in the array at "o" index
    public T getObject(int index){
            return array[index % array.length];
    }

    //get object at the current Index
    public T getIndex(){
        return array[currentIndex % array.length];
    }

}
