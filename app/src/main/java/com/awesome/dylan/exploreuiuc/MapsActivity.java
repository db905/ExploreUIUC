/*package com.awesome.dylan.exploreuiuc;

import com.awesome.dylan.exploreuiuc.MenuActivity;

import android.icu.util.TimeUnit;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.lang.*;
import com.google.android.gms.maps.*;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.GeolocationApi;
import com.google.maps.android.PolyUtil;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.TravelMode;
import com.google.maps.*;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    /*@Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.addMarker(new MarkerOptions().position();
    }
    private GeoApiContext getGeoContext() {
        GeoApiContext geoApiContext = new GeoApiContext();
        return geoApiContext.setQueryRateLimit(3)
                .setConnectTimeout(1, java.util.concurrent.TimeUnit.SECONDS)
                .setReadTimeout(1,java.util.concurrent.TimeUnit.SECONDS)
                .setWriteTimeout(1, java.util.concurrent.TimeUnit.SECONDS);
    }
    DateTime now = new DateTime();

    private String destination = MenuActivity.subject.address;

    private String origin = getLastLocation;
    DirectionsResult result = DirectionsApi.newRequest(getGeoContext()).
            mode(TravelMode.WALKING).origin(origin)
            .destination(destination).departureTime(now).await();
    private String getEndLocationTitle(DirectionsResult results) {
        return "Time :" + results.routes[0].legs[0].duration.humanReadable +
                " Distance :" + results.routes[0].legs[0].distance.humanReadable;
    }
    private void addPolyline(DirectionsResult results, GoogleMap mMap) {
        List<LatLng> decodedPath = PolyUtil.decode(results.routes[0].overviewPolyline
                .getEncodedPath());
        mMap.addPolyline(new PolylineOptions().addAll(decodedPath));
    }
    GeocodingResult
}
*/