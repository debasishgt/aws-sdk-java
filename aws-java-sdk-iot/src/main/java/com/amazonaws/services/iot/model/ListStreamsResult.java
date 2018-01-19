/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of streams.
     * </p>
     */
    private java.util.List<StreamSummary> streams;
    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of streams.
     * </p>
     * 
     * @return A list of streams.
     */

    public java.util.List<StreamSummary> getStreams() {
        return streams;
    }

    /**
     * <p>
     * A list of streams.
     * </p>
     * 
     * @param streams
     *        A list of streams.
     */

    public void setStreams(java.util.Collection<StreamSummary> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<StreamSummary>(streams);
    }

    /**
     * <p>
     * A list of streams.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreams(java.util.Collection)} or {@link #withStreams(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param streams
     *        A list of streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreams(StreamSummary... streams) {
        if (this.streams == null) {
            setStreams(new java.util.ArrayList<StreamSummary>(streams.length));
        }
        for (StreamSummary ele : streams) {
            this.streams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of streams.
     * </p>
     * 
     * @param streams
     *        A list of streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreams(java.util.Collection<StreamSummary> streams) {
        setStreams(streams);
        return this;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token used to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * 
     * @return A token used to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token used to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreams() != null)
            sb.append("Streams: ").append(getStreams()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsResult == false)
            return false;
        ListStreamsResult other = (ListStreamsResult) obj;
        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsResult clone() {
        try {
            return (ListStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}