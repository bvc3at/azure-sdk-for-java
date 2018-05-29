/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The AddVideoFrameUrlOptionalParameter model.
 */
public class AddVideoFrameUrlOptionalParameter {
    /**
     * Timescale of the video.
     */
    private Integer timescale;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Get the timescale value.
     *
     * @return the timescale value
     */
    public Integer timescale() {
        return this.timescale;
    }

    /**
     * Set the timescale value.
     *
     * @param timescale the timescale value to set
     * @return the AddVideoFrameUrlOptionalParameter object itself.
     */
    public AddVideoFrameUrlOptionalParameter withTimescale(Integer timescale) {
        this.timescale = timescale;
        return this;
    }

    /**
     * Get the acceptLanguage value.
     *
     * @return the acceptLanguage value
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Set the acceptLanguage value.
     *
     * @param acceptLanguage the acceptLanguage value to set
     * @return the AddVideoFrameUrlOptionalParameter object itself.
     */
    public AddVideoFrameUrlOptionalParameter withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

}