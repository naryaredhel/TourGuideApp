package com.example.android.tourguideapp;

public class TourInfo {

    private int mPhotoResourceId;
    private String mTitle ;
    private String mInfo;
    private String mAddress;
    private String mTell;

    public TourInfo (String title, String info, int photoResourceId){
        this.mInfo =info;
        this.mTitle=title;
        this.mPhotoResourceId=photoResourceId;
    }
    public TourInfo (String title, String info, int photoResourceId, String address, String tell){
        this.mInfo =info;
        this.mTitle=title;
        this.mPhotoResourceId=photoResourceId;
        this.mAddress=address;
        this.mTell=tell;
    }

    public int getmPhotoResourceId() {
        return mPhotoResourceId;
    }
    public String getmTitle() {
        return mTitle;
    }
    public String getmInfo() {
        return mInfo;
    }
    public String getmAddress() {
        return mAddress;
    }
    public String getmTell() {
        return mTell;
    }

}
