package com.placeremainder.place.placealertassistent.models;


import com.google.android.gms.maps.model.LatLng;

public class LocationInfo {
    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    private LatLng latLng;
    private double lat;
    private double lng;
}
