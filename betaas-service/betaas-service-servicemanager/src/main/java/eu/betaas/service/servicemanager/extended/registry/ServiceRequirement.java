/*
Copyright 2014-2015 Intecs Spa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/

package eu.betaas.service.servicemanager.extended.registry;

import eu.betaas.taas.taasresourcesmanager.api.Location;

/**
 * This class represents one of the services requested by an extended service manifest
 * @author Intecs
 */
public class ServiceRequirement {
	/** The semantic description to be passed to TaaS for installation */
	public String mSemanticDescription;
	
	/** The location to which the service is referred, needed by TaaSRM for installation */
	public Location mLocation;
	
	/** The trust level required by TaaSRM for installation */
	public double mTrust;
	
	/** The type of data transfer (e.g. push/pull). See TaaSRM Feature definition */
	public int mType;
	
	/** The credentials necessary to install the service */
	public String mCredentials;
	
	/** Quality of Service requirement to be passed to TaaS during installation */
	public String mQoSMaxResponseTime;		
	
	/** Quality of Service requirement to be passed to TaaS during installation */
	public String mQoSMinAvailability;		
	
	/** Quality of Service requirement to be passed to TaaS during installation */
	public String mQoSMaxInterrequestTime;			
	
	public String mAverageRate;
	
	public String mMaxBurstSize;
	
	/** Period, in case of push services */
	public float mPeriod;
}


