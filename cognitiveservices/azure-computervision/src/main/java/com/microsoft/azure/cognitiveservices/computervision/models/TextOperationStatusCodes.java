/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TextOperationStatusCodes.
 */
public enum TextOperationStatusCodes {
    /** Enum value Not Started. */
    NOT_STARTED("Not Started"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded");

    /** The actual serialized value for a TextOperationStatusCodes instance. */
    private String value;

    TextOperationStatusCodes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TextOperationStatusCodes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TextOperationStatusCodes object, or null if unable to parse.
     */
    @JsonCreator
    public static TextOperationStatusCodes fromString(String value) {
        TextOperationStatusCodes[] items = TextOperationStatusCodes.values();
        for (TextOperationStatusCodes item : items) {
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
