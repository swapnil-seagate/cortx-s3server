/*
 * Copyright (c) 2020 Seagate Technology LLC and/or its Affiliates
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
 *
 * For any questions about this software or licensing,
 * please email opensource@seagate.com or cortx-questions@seagate.com.
 *
 */

package com.seagates3.dao;
import java.util.List;
import java.util.Map;

import com.seagates3.exception.DataAccessException;
import com.seagates3.model.Account;
import com.seagates3.model.Policy;

public interface PolicyDAO {

    /**
     * Find Policy.
     *
     * @param account
     * @param name
     * @return
     * @throws DataAccessException
     */
    public Policy find(Account account, String name)
            throws DataAccessException;

    /**
     * Save the policy.
     *
     * @param policy
     * @throws DataAccessException
     */
    public void save(Policy policy) throws DataAccessException;
    public
     Policy findByArn(String arn, Account account) throws DataAccessException;
    public
     List<Policy> findAll(
         Account account,
         Map<String, Object> apiParameters) throws DataAccessException;
    public
     void delete (Policy policy) throws DataAccessException;
}
