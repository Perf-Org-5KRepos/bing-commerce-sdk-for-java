// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Defines the abstract base type for a facet request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = RequestFacetBase.class)
@JsonTypeName("Request.FacetBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Facet", value = RequestFacet.class),
    @JsonSubTypes.Type(name = "RangeFacet", value = RequestRangeFacet.class)
})
public class RequestFacetBase extends RequestFieldAggregationBase {
    /**
     * A comma-separated list of OData order syntax expressions. Default is
     * `_count desc`.
     */
    @JsonProperty(value = "orderBy")
    private String orderBy;

    /**
     * Get a comma-separated list of OData order syntax expressions. Default is `_count desc`.
     *
     * @return the orderBy value
     */
    public String orderBy() {
        return this.orderBy;
    }

    /**
     * Set a comma-separated list of OData order syntax expressions. Default is `_count desc`.
     *
     * @param orderBy the orderBy value to set
     * @return the RequestFacetBase object itself.
     */
    public RequestFacetBase withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

}

