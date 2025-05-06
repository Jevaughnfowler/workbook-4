package com.pluralsight;

public class Room {
  private int numberOfBeds;
  private double Price;
  private boolean Occupied;
  private boolean Dirty;
  private boolean Available;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public boolean isDirty() {
        return Dirty;
    }

    public boolean isAvailable() {
        return Available;
    }
}
