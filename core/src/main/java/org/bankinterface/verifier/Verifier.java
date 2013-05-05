/*
 * Copyright 2013 bankinterface.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bankinterface.verifier;

import java.util.Map;

import org.bankinterface.exception.SignVerifyException;
import org.bankinterface.param.Notification;

/**
 * 验签服务提供者
 * 
 */
public interface Verifier {

    /**
     * 获取服务名
     * 
     * @return
     */
    String getName();

    /**
     * 验证并解密
     * 
     * @param signedField
     * @param joinStyle
     * @param signatureKey
     * @param notification
     * @return
     * @throws SignVerifyException
     */
    public Map<String, String> verify(String[] signedField, String joinStyle, String signatureKey,
            Notification notification) throws SignVerifyException;
}