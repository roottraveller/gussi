package com.gussi.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Karma {
    private long karmaId;
    private String karma;
    private Date entryDate;
    private Date lastUpdated;

}
