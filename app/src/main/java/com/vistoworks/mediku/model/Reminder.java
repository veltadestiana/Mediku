package com.vistoworks.mediku.model;

import java.util.Date;
import java.util.List;

public class Reminder {
    private int mId;
    private String mMedName;
    private String mMedDose;
    private List<String> mSchedule;
    private Date mLastModified;

    public Reminder(String medName, String medDose, List<String> schedule) {
        mMedName = medName;
        mMedDose = medDose;
        mSchedule = schedule;
    }

    public Reminder(int id, String medName, String medDose, List<String> schedule, Date lastModified) {
        mId = id;
        mMedName = medName;
        mMedDose = medDose;
        mSchedule = schedule;
        mLastModified = lastModified;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getMedName() {
        return mMedName;
    }

    public void setMedName(String medName) {
        mMedName = medName;
    }

    public String getMedDose() {
        return mMedDose;
    }

    public void setMedDose(String medDose) {
        mMedDose = medDose;
    }

    public List<String> getSchedule() {
        return mSchedule;
    }

    public void setSchedule(List<String> schedule) {
        mSchedule = schedule;
    }

    public Date getLastModified() {
        return mLastModified;
    }

    public void setLastModified(Date lastModified) {
        mLastModified = lastModified;
    }
}
