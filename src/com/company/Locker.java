package com.company;

public class Locker {
    private boolean isOpen;

    public Locker() {

    }
    public void setisOpen() {
        this.isOpen = true;
    }
    public  void setisClose() {
        this.isOpen = false;
    }
    boolean getisOpen() {
        return this.isOpen;
    }
    public String displayOpenLocker() {
        if(this.isOpen)
            return(" locker is open");
        return null;
    }
}
