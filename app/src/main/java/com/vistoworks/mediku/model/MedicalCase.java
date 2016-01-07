package com.vistoworks.mediku.model;

import java.util.Date;
import java.util.List;

public class MedicalCase {
    private int mId;
    private String mComplaint;
    private String mDescription;
    private Date mComplaintDate;
    private String mDiagnosis;
    private Date mDiagnosedDate;
    private String mAction;
    private String mActionDescription;
    private List<Med> mMeds;

    public MedicalCase(String complaint, String description, Date complaintDate, String diagnosis, Date diagnosedDate, String action, String actionDescription, List<Med> meds) {
        mComplaint = complaint;
        mDescription = description;
        mComplaintDate = complaintDate;
        mDiagnosis = diagnosis;
        mDiagnosedDate = diagnosedDate;
        mAction = action;
        mActionDescription = actionDescription;
        mMeds = meds;
    }

    public MedicalCase(int id, String complaint, String description, Date complaintDate, String diagnosis, Date diagnosedDate, String action, String actionDescription, List<Med> meds) {
        mId = id;
        mComplaint = complaint;
        mDescription = description;
        mComplaintDate = complaintDate;
        mDiagnosis = diagnosis;
        mDiagnosedDate = diagnosedDate;
        mAction = action;
        mActionDescription = actionDescription;
        mMeds = meds;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getComplaint() {
        return mComplaint;
    }

    public void setComplaint(String complaint) {
        mComplaint = complaint;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Date getComplaintDate() {
        return mComplaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        mComplaintDate = complaintDate;
    }

    public String getDiagnosis() {
        return mDiagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        mDiagnosis = diagnosis;
    }

    public Date getDiagnosedDate() {
        return mDiagnosedDate;
    }

    public void setDiagnosedDate(Date diagnosedDate) {
        mDiagnosedDate = diagnosedDate;
    }

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public String getActionDescription() {
        return mActionDescription;
    }

    public void setActionDescription(String actionDescription) {
        mActionDescription = actionDescription;
    }

    public List<Med> getMeds() {
        return mMeds;
    }

    public void setMeds(List<Med> meds) {
        mMeds = meds;
    }

    public class Med {
        private String mName;
        private String mIndication;
        private String mDosage;

        public Med(String name, String indication, String dosage) {
            mName = name;
            mIndication = indication;
            mDosage = dosage;
        }

        public String getName() {
            return mName;
        }

        public void setName(String name) {
            mName = name;
        }

        public String getIndication() {
            return mIndication;
        }

        public void setIndication(String indication) {
            mIndication = indication;
        }

        public String getDosage() {
            return mDosage;
        }

        public void setDosage(String dosage) {
            mDosage = dosage;
        }
    }
}
