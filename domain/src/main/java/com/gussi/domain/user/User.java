package com.gussi.domain.user;

import com.gussi.domain.Session;
import com.gussi.domain.enums.PermissionLevel;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * User info class
 */
@Data
@Document(collection = "User")
public abstract class User implements Serializable {
    private static final long serialVersionUID = 7130883824515841049L;
    @Id
    protected int id;
    protected String name;
    protected String email;
    protected String passcode;
    protected Date dob;
    protected Date entryDate;
    protected Date lastUpdated;
    protected List<Session> sessionEntry;
    protected boolean isAdmin;
    protected PermissionLevel permissionLevel;
}
