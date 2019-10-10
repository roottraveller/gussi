package com.newborn.gussi.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userID;
    private String name;
    private String email;
    private Date entryDate;
    private Date lastUpdated;
}
