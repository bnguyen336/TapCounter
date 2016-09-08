package edu.orangecoastcollege.cs273.bnguyen336.tapcounter;

/**
 * Created by binhn on 9/6/2016.
 */
public class Counter {
    private int mCount;

    //Unnecessary constructor for Java
    public void Counter() {
        mCount = 0;
    }

    public void addCount() {
        mCount++;
    }

    public int getCount() {
        return mCount;
    }
}
