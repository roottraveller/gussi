package com.gussi.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Karma details will be stored like this
 */
@Data
@Document(collection = "Karma")
public class Karma implements Serializable {
    private static final long serialVersionUID = 2386484139121506224L;
    @Id
    private long id;
    private String title;
    private String karma;
    private Date entryDate;
    private Date lastUpdated;
    private Map<Integer, String> updates;

}
