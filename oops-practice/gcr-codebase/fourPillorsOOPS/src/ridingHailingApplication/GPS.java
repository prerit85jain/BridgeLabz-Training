package ridingHailingApplication;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}