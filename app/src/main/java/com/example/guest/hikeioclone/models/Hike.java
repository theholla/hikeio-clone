package com.example.guest.hikeioclone.models;

public class Hike {
    private String mName, mLocation, mDistance;
    private int mElevGain, mElevMax, mLatitude, mLongitude;

    public Hike(String name, String location, String distance, int elevGain, int elevMax, int latitude, int longitude) {
        mName = name;
        mLocation = location;
        mDistance = distance;
        mElevGain = elevGain;
        mElevMax = elevMax;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getDistance() {
        return mDistance;
    }

    public void setDistance(String distance) {
        mDistance = distance;
    }

    public int getElevGain() {
        return mElevGain;
    }

    public void setElevGain(int elevGain) {
        mElevGain = elevGain;
    }

    public int getElevMax() {
        return mElevMax;
    }

    public void setElevMax(int elevMax) {
        mElevMax = elevMax;
    }

    public int getLatitude() {
        return mLatitude;
    }

    public void setLatitude(int latitude) {
        mLatitude = latitude;
    }

    public int getLongitude() {
        return mLongitude;
    }

    public void setLongitude(int longitude) {
        mLongitude = longitude;
    }
}
