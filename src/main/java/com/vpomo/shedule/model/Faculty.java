package com.vpomo.shedule.model;

public class Faculty {
    private Integer id_faculty;

    private String name_faculty;

    public Integer getId_faculty() {
        return id_faculty;
    }

    public void setId_faculty(Integer id_faculty) {
        this.id_faculty = id_faculty;
    }

    public String getName_faculty() {
        return name_faculty;
    }

    public void setName_faculty(String name_faculty) {
        this.name_faculty = name_faculty == null ? null : name_faculty.trim();
    }
}