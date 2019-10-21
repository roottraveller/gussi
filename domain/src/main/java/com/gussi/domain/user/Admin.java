package com.gussi.domain.user;

import com.gussi.domain.enums.PermissionLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * An admin class
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends User {

    public Admin() {
        permissionLevel = PermissionLevel.ALL;
        isAdmin = true;
    }
}
