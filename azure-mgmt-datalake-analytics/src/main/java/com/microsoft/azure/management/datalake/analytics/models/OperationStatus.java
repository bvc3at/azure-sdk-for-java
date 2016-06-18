/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OperationStatus.
 */
public enum OperationStatus {
    /** Enum value InProgress. */
    IN_PROGRESS("InProgress"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a OperationStatus instance. */
    private String value;

    OperationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OperationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static OperationStatus fromString(String value) {
        OperationStatus[] items = OperationStatus.values();
        for (OperationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}