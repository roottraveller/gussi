package com.gussi.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userID;
    private String name;
    private String email;
    private String passcode;
    private Date entryDate;
    private Date lastUpdated;
}
