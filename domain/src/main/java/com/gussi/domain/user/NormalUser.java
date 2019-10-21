package com.gussi.domain.user;

import com.gussi.domain.enums.PermissionLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * All user except admin will be normal user
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NormalUser extends User {

    public NormalUser() {
        permissionLevel = PermissionLevel.READ;
        isAdmin = false;
    }
}
