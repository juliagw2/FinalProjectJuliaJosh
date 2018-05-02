package com.example.juliawisowaty.finalprojectjuliajosh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.location.places.GeoDataClient;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.PlaceDetectionClient;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Food_Output extends FragmentActivity{
    protected GeoDataClient mGeoDataClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__output);

        // Construct a GeoDataClient.
        mGeoDataClient = Places.getGeoDataClient(this, null);

        // Construct a PlaceDetectionClient.
        mPlaceDetectionClient = Places.getPlaceDetectionClient(this, null);

        // TODO: Start using the Places API.
    }
}

