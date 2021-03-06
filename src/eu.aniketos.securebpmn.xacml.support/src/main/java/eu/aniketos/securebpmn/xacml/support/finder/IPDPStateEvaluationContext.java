/* Copyright 2012-2015 SAP SE
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

package eu.aniketos.securebpmn.xacml.support.finder;

import java.net.URI;
import java.util.Date;

import com.sun.xacml.Constants;
import com.sun.xacml.attr.TypeIdentifierConstants;

public interface IPDPStateEvaluationContext {

    public static final URI PDPSTATE_CATEGORY = Constants.ENVIRONMENT_CAT;
    public static final URI PDPSTATE_ATTRIBUTETYPE = TypeIdentifierConstants.INTEGER_URI;
    public static final String PDPSTATE = "urn:custom:svnPolicyVersion";
    public static final URI PDPSTATE_URI = URI.create(PDPSTATE);
    public static final URI PDPSTATE_ISSUER = null;

    public Date getExecTime();
    public long getVersion();
}
