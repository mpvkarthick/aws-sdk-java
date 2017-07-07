/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PatchBaselineIdentityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PatchBaselineIdentityMarshaller {

    private static final MarshallingInfo<String> BASELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineId").build();
    private static final MarshallingInfo<String> BASELINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineName").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystem").build();
    private static final MarshallingInfo<String> BASELINEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineDescription").build();
    private static final MarshallingInfo<Boolean> DEFAULTBASELINE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultBaseline").build();

    private static final PatchBaselineIdentityMarshaller instance = new PatchBaselineIdentityMarshaller();

    public static PatchBaselineIdentityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PatchBaselineIdentity patchBaselineIdentity, ProtocolMarshaller protocolMarshaller) {

        if (patchBaselineIdentity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(patchBaselineIdentity.getBaselineId(), BASELINEID_BINDING);
            protocolMarshaller.marshall(patchBaselineIdentity.getBaselineName(), BASELINENAME_BINDING);
            protocolMarshaller.marshall(patchBaselineIdentity.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(patchBaselineIdentity.getBaselineDescription(), BASELINEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(patchBaselineIdentity.getDefaultBaseline(), DEFAULTBASELINE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
