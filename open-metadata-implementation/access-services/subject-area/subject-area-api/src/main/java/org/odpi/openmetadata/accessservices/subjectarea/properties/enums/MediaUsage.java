/* SPDX-License-Identifier: Apache-2.0 */

package org.odpi.openmetadata.accessservices.subjectarea.properties.enums;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * Defines how a related media reference should be used.
 */


@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MediaUsage implements Serializable {
    /**
      * Provides a small image to represent the asset in tree views and graphs.
      */
    Icon(0, "Provides a small image to represent the asset in tree views and graphs.")
,
    /**
      * Provides a small image about the asset that can be used in lists.
      */
    Thumbnail(1, "Provides a small image about the asset that can be used in lists.")
,
    /**
      * Illustrates how the asset works or what it contains. It is complementary to the asset's description.
      */
    Illustration(2, "Illustrates how the asset works or what it contains. It is complementary to the asset's description.")
,
    /**
      * Provides guidance to a person on how to use the asset.
      */
    UsageGuidance(3, "Provides guidance to a person on how to use the asset.")
,
    /**
      * Another usage.
      */
    Other(99, "Another usage.")
;
    private final int ordinal;
    private final String description ;
    /**
     * Default constructor sets up the specific values for an MediaUsage enum instance.
     *
     * @param ordinal int enum value ordinal
     * @param description String description
     */
    MediaUsage(int ordinal, String description) {
        this.ordinal = ordinal;
        this.description = description;
    }

    /**
     * Return the numerical value for the enum.
     *
     * @return int enum value ordinal
     */
    public int getOrdinal() { return this.ordinal; }
    /**
     * Return the description for the enum.
     *
     * @return String description
     */
    public String getDescription() { return this.description; }
    /**
     * Return the descriptive name for the MediaUsage enum instance
     *
     * @return String name
     */
    public String getName() { return this.name(); }
}
