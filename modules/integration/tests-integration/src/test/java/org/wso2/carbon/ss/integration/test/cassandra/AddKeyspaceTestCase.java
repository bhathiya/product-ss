package org.wso2.carbon.ss.integration.test.cassandra;
/*
*Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/

/*import org.wso2.carbon.automation.api.clients.utils.AuthenticateStub;
import org.wso2.carbon.automation.core.utils.UserInfo;
import org.wso2.carbon.automation.core.utils.UserListCsvReader;
import org.wso2.carbon.automation.core.utils.environmentutils.EnvironmentBuilder;
import org.wso2.carbon.automation.core.utils.environmentutils.EnvironmentVariables;*/

import static org.testng.Assert.assertTrue;

public class AddKeyspaceTestCase {
    //private EnvironmentVariables ssServer;
    //private UserInfo userInfo;
    //private EnvironmentBuilder builder;
    private final String keyspaceName="TestKeyspace";
    private String backendUrl;
    private String sessionCookie;
    private String serviceUrl;

    /*@BeforeClass(alwaysRun = true)
    public void setEnvironment() throws LoginAuthenticationExceptionException, RemoteException {
        userInfo = UserListCsvReader.getUserInfo(0);
        builder = new EnvironmentBuilder().ss(0);
        ssServer = builder.build().getSs();
        backendUrl=ssServer.getBackEndUrl();
        sessionCookie=ssServer.getSessionCookie();
        serviceUrl =ssServer.getServiceUrl();
    }

    @Test
    public void testAddKeyspace()
            throws Exception {
        String endPoint=backendUrl+"CassandraKeyspaceAdmin";
        CassandraKeyspaceAdminStub cassandraKeyspaceAdminStub=new CassandraKeyspaceAdminStub(endPoint);
        AuthenticateStub.authenticateStub(sessionCookie, cassandraKeyspaceAdminStub);
        KeyspaceInformation keyspaceInformation=new KeyspaceInformation();
        keyspaceInformation.setName("cassandra");
        keyspaceInformation.setReplicationFactor(1);
        keyspaceInformation.setStrategyClass("org.apache.cassandra.locator.SimpleStrategy");
        cassandraKeyspaceAdminStub.addKeyspace(keyspaceInformation);
        String[] keyspaces=cassandraKeyspaceAdminStub.listKeyspacesOfCurrentUser();
        boolean contains=false;
        for(String s:keyspaces)
        {
            if(s.equals("cassandra"));
            {
                contains=true;
                break;
            }

        }
        assertTrue(contains);
    }*/
}
