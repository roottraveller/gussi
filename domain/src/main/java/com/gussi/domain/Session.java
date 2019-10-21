package com.gussi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session implements Serializable {
    private static final long serialVersionUID = -669608874262821907L;
    private Date loginEntry;
    private Date logoutEntry;

}
