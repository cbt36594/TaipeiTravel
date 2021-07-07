package com.nevic.taipeitravel.model;

import com.google.gson.annotations.SerializedName;

/**
 * 管制範圍 : "凱達格蘭大道(中山至公園)北側1線道"
 * _id : 1
 * 管制日期 : "109.9.8"
 */
public class Traffic {

    @SerializedName("管制範圍")
    private String control;
    @SerializedName("_id")
    private String id;
    @SerializedName("管制日期")
    private String date;

    public String getControl() {
        return control;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
}
