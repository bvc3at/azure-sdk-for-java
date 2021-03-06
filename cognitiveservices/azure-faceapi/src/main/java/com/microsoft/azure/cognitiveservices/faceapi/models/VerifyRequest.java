/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for verify operation.
 */
public class VerifyRequest {
    /**
     * faceId the face, comes from Face - Detect.
     */
    @JsonProperty(value = "faceId", required = true)
    private String faceId;

    /**
     * Specify a certain person in a person group. personId is created in
     * Persons.Create.
     */
    @JsonProperty(value = "personId", required = true)
    private String personId;

    /**
     * Using existing personGroupId and personId for fast loading a specified
     * person. personGroupId is created in Person Groups.Create.
     */
    @JsonProperty(value = "personGroupId", required = true)
    private String personGroupId;

    /**
     * Get the faceId value.
     *
     * @return the faceId value
     */
    public String faceId() {
        return this.faceId;
    }

    /**
     * Set the faceId value.
     *
     * @param faceId the faceId value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * Get the personId value.
     *
     * @return the personId value
     */
    public String personId() {
        return this.personId;
    }

    /**
     * Set the personId value.
     *
     * @param personId the personId value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withPersonId(String personId) {
        this.personId = personId;
        return this;
    }

    /**
     * Get the personGroupId value.
     *
     * @return the personGroupId value
     */
    public String personGroupId() {
        return this.personGroupId;
    }

    /**
     * Set the personGroupId value.
     *
     * @param personGroupId the personGroupId value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
        return this;
    }

}
