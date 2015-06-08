package com.twopillar.entity;

public class planCirculation {
    private Integer id;

    private Integer planInfoId;

    private Integer circulationNumber;

    private String type;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanInfoId() {
        return planInfoId;
    }

    public void setPlanInfoId(Integer planInfoId) {
        this.planInfoId = planInfoId;
    }

    public Integer getCirculationNumber() {
        return circulationNumber;
    }

    public void setCirculationNumber(Integer circulationNumber) {
        this.circulationNumber = circulationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}