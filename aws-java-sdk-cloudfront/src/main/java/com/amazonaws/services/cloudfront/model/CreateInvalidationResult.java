/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateInvalidationResult implements Serializable, Cloneable {

    private String location;

    private Invalidation invalidation;

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateInvalidationResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param invalidation
     */
    public void setInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
    }

    /**
     * @return
     */
    public Invalidation getInvalidation() {
        return this.invalidation;
    }

    /**
     * @param invalidation
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateInvalidationResult withInvalidation(Invalidation invalidation) {
        setInvalidation(invalidation);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getInvalidation() != null)
            sb.append("Invalidation: " + getInvalidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvalidationResult == false)
            return false;
        CreateInvalidationResult other = (CreateInvalidationResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null
                && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getInvalidation() == null ^ this.getInvalidation() == null)
            return false;
        if (other.getInvalidation() != null
                && other.getInvalidation().equals(this.getInvalidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getInvalidation() == null) ? 0 : getInvalidation()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateInvalidationResult clone() {
        try {
            return (CreateInvalidationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}