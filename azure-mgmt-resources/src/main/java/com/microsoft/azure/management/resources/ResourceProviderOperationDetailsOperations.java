/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.ResourceProviderOperationDetailListResult;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceProviderOperationDetailsOperations.
 */
public interface ResourceProviderOperationDetailsOperations {
    /**
     * The interface defining all the services for ResourceProviderOperationDetailsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourceProviderOperationDetailsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("providers/{resourceProviderNamespace}/operations")
        Call<ResponseBody> list(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets a list of resource providers.
     *
     * @param resourceProviderNamespace Resource identity.
     * @param apiVersion the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceProviderOperationDetailListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceProviderOperationDetailListResult> list(String resourceProviderNamespace, String apiVersion) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param resourceProviderNamespace Resource identity.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceProviderNamespace, String apiVersion, final ServiceCallback<ResourceProviderOperationDetailListResult> serviceCallback);

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceProviderOperationDetailListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceProviderOperationDetailListResult> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<ResourceProviderOperationDetailListResult> serviceCallback);

}