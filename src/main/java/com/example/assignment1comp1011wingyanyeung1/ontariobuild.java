package com.example.assignment1comp1011wingyanyeung1;

public class ontariobuild {
    private int id;
    private String project_name;
    private String supporting_ministry;
    private String region;
    private String status;
    private String target_complete;
    private int estimated_budget;



    //constructors
    public ontariobuild() {
        id = -1;
        project_name = "abc";
        supporting_ministry = "def";
    }

    public ontariobuild(int new_id, String new_project_name, String new_supporting_ministry, String new_region, String new_status, String new_target_complete, int new_estimated_budget) {
        id = new_id;
                project_name = new_project_name;
        supporting_ministry = new_supporting_ministry;
        region = new_region;
        status = new_status;
        target_complete = new_target_complete;
        estimated_budget = new_estimated_budget;
    }



    public int getID() {
        return id;
    }
    public void setID(int new_ID) {
        id = new_ID;
    }

    public String getProject_name() {
        return project_name;
    }
    public void setProject_name(String new_project_name) {
        project_name = new_project_name;
    }


    public String getSupporting_ministry() {
        return supporting_ministry;
    }
    public void setSupporting_ministry(String new_supporting_ministry) {
        supporting_ministry = new_supporting_ministry;
    }


    public String getRegion() {
        return region;
    }
    public void setRegion(String new_region) {
        region = new_region;
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String new_status) {
        status = new_status;
    }


    public String getTarget_complete() {
        return target_complete;
    }
    public void setTarget_complete(String new_target_complete) {
        target_complete = new_target_complete;
    }


    public int getEstimated_budget() {
        return estimated_budget;
    }
    public void setEstimated_budget(int new_estimated_budget) {
        estimated_budget = new_estimated_budget;
    }


    public ontariobuild change_estimated_budget(ontariobuild build1) {
        return null;
    }


    @Override
    public String toString(){
        return ("build1" + getProject_name() + ", " + getEstimated_budget());
    }
}
