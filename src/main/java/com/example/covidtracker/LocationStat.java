package com.example.covidtracker;

public class LocationStat implements Comparable<LocationStat> {
    private String state;
    private String country;
    private int latestTotalCases;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStat{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }

    @Override
    public int compareTo(LocationStat o) {
        if (this.getLatestTotalCases() > o.getLatestTotalCases()) {
            return -1;
        }
        else if(this.getLatestTotalCases() == o.getLatestTotalCases()){
            return 0;
        }
        else {
            return 1;
        }
    }
}
