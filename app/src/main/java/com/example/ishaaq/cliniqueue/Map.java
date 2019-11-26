package com.example.ishaaq.cliniqueue;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        float zoomLevel = 12.0f;

        // Add a marker in Sydney and move the camera
        LatLng uOttawa = new LatLng(45.421946, -75.680325);
        Marker u = mMap.addMarker(new MarkerOptions().position(uOttawa).title("University of Ottawa Health Services"));
        u.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uOttawa,zoomLevel));

        LatLng rideau = new LatLng(45.431005, -75.681432);
        Marker r = mMap.addMarker(new MarkerOptions().position(rideau).title("Rideau-Friel Medical Centre"));
        r.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rideau,zoomLevel));

        LatLng appleTreeSparks = new LatLng(45.420402, -75.702761);
        Marker as1 = mMap.addMarker(new MarkerOptions().position(appleTreeSparks).title("Apple Tree Medical group Sparks Street"));
        as1.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(appleTreeSparks,zoomLevel));

        LatLng appleTreeBank = new LatLng(45.379068, -75.668762);
        Marker b = mMap.addMarker(new MarkerOptions().position(appleTreeBank).title("Apple Tree Medical group Bank Street"));
        b.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(appleTreeBank,zoomLevel));

        LatLng appleTreeSlater = new LatLng(45.417463, -75.704249);
        Marker as2 = mMap.addMarker(new MarkerOptions().position(appleTreeSlater).title("Apple Tree Medical group Slater Street"));
        as2.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(appleTreeSlater,zoomLevel));

        LatLng carleton = new LatLng(45.385589, -75.692576);
        Marker c = mMap.addMarker(new MarkerOptions().position(carleton).title("Carleton University Medical Services"));
        c.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(carleton,zoomLevel));

//        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
//            @Override
//            public boolean onMarkerClick(Marker marker) {
//                int position = (int)(marker.getTag());
//                Intent intent1= new Intent(Map.this,ClinicsListActivity.class);
//                startActivity(intent1);
//                return false;
//            }
        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker arg0) {
                if(arg0 != null && arg0.getTitle().equals("University of Ottawa Health Services")){
                    String string4 =  "University of Ottawa Health Services";
                    Intent intent1 = new Intent(Map.this, ContactClinicActivity.class);
                    intent1.putExtra("ClinicName",string4);
                    startActivity(intent1);}

                if(arg0 != null && arg0.getTitle().equals("Rideau-Friel Medical Centre")){
                    String string3 =  "Rideau-Friel Medical Centre";
                    Intent intent2 = new Intent(Map.this, ContactClinicActivity.class);
                    intent2.putExtra("ClinicName",string3);
                    startActivity(intent2);}

                if(arg0 != null && arg0.getTitle().equals("Apple Tree Medical group Sparks Street")){
                    String string2 =  "Apple Tree Medical group Sparks Street";
                    Intent intent3 = new Intent(Map.this, ContactClinicActivity.class);
                    intent3.putExtra("ClinicName",string2);
                    startActivity(intent3);}

                if(arg0 != null && arg0.getTitle().equals("Apple Tree Medical group Bank Street")){
                    String string1 =  "Apple Tree Medical group Bank Street";
                    Intent intent4 = new Intent(Map.this, ContactClinicActivity.class);
                    intent4.putExtra("ClinicName",string1);
                    startActivity(intent4);}

                if(arg0 != null && arg0.getTitle().equals("Apple Tree Medical group Slater Street")){
                    String string5 =  "Apple Tree Medical group Slater Street";
                    Intent intent5 = new Intent(Map.this, ContactClinicActivity.class);
                    intent5.putExtra("ClinicName",string5);
                    startActivity(intent5);}

                if(arg0 != null && arg0.getTitle().equals("Carleton University Medical Services")){
                    String string6 =  "Carleton University Medical Services";
                    Intent intent6 = new Intent(Map.this, ContactClinicActivity.class);
                    intent6.putExtra("ClinicName",string6);
                    startActivity(intent6);}

            }
        });

    }

    public void showAppointmentsButton(View view) {
        Intent intent4= new Intent(Map.this, ShowAppointmentsActivity.class);
        startActivity(intent4);
    }

    public void showClinicsListButton(View view) {
        Intent intent4= new Intent(Map.this, ClinicsListActivity.class);
        startActivity(intent4);
    }
}
