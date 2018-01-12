/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information on a recognized word.
 */
public class OcrWord {
    /**
     * Bounding box of a recognized word. The four integers represent the
     * x-coordinate of the left edge, the y-coordinate of the top edge, width,
     * and height of the bounding box, in the coordinate system of the input
     * image, after it has been rotated around its center according to the
     * detected text angle (see textAngle property), with the origin at the
     * top-left corner, and the y-axis pointing down.
     */
    @JsonProperty(value = "boundingBox")
    private String boundingBox;

    /**
     * String value of a recognized word.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get the boundingBox value.
     *
     * @return the boundingBox value
     */
    public String boundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox value.
     *
     * @param boundingBox the boundingBox value to set
     * @return the OcrWord object itself.
     */
    public OcrWord withBoundingBox(String boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the OcrWord object itself.
     */
    public OcrWord withText(String text) {
        this.text = text;
        return this;
    }

}