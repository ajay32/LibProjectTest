package ajaymehta.coollib;

/**
 * Created by Avi Hacker on 11/19/2017.
 */

/**
 * Representation of a Latitude/Longitude pair Point in the map.
 */
public class Point {   // getter setter (constructor)
    float mLatitude;
    float mLongitude;

    public Point(float latitude, float longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public float getLongitude() {
        return mLongitude;
    }
}