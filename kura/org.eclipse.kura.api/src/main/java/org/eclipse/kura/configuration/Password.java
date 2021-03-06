/*******************************************************************************
 * Copyright (c) 2011, 2020 Eurotech and/or its affiliates
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kura.configuration;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @noextend This class is not intended to be subclassed by clients.
 */
@ProviderType
public class Password {

    private char[] passwordVal;

    public Password(String password) {
        super();
        if (password != null) {
            this.passwordVal = password.toCharArray();
        }
    }

    public Password(char[] password) {
        super();
        this.passwordVal = password;
    }

    public char[] getPassword() {
        return this.passwordVal;
    }

    @Override
    public String toString() {
        return new String(this.passwordVal);
    }
}
