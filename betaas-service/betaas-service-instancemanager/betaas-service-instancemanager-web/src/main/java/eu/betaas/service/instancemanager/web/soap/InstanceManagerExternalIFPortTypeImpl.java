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


/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.betaas.service.instancemanager.web.soap;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2014-04-04T18:30:30.711+02:00
 * Generated source version: 2.7.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "InstanceManagerExternalIF",
                      portName = "InstanceManagerExternalIFPort",
                      targetNamespace = "http://api.instancemanager.service.betaas.eu/",
                      wsdlLocation = "http://192.168.24.128:9302/im-service?wsdl",
                      endpointInterface = "eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType")
                      
public class InstanceManagerExternalIFPortTypeImpl implements InstanceManagerExternalIFPortType {

    private static final Logger LOG = Logger.getLogger(InstanceManagerExternalIFPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getAdminAddress(*
     */
    public java.lang.String getAdminAddress() { 
        LOG.info("Executing operation getAdminAddress");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getGWStarID(*
     */
    public java.lang.String getGWStarID() { 
        LOG.info("Executing operation getGWStarID");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#requestJoin(java.lang.String  arg0 )*
     */
    public boolean requestJoin(java.lang.String arg0) { 
        LOG.info("Executing operation requestJoin");
        System.out.println(arg0);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#isGWStar(*
     */
    public boolean isGWStar() { 
        LOG.info("Executing operation isGWStar");
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getDescription(*
     */
    public java.lang.String getDescription() { 
        LOG.info("Executing operation getDescription");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getGWID(*
     */
    public java.lang.String getGWID() { 
        LOG.info("Executing operation getGWID");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#requestDisjoin(*
     */
    public boolean requestDisjoin() { 
        LOG.info("Executing operation requestDisjoin");
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getInstanceInfo(*
     */
    public java.lang.String getInstanceInfo() { 
        LOG.info("Executing operation getInstanceInfo");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#joinInstance(java.lang.String  arg0 ,)java.lang.String  arg1 )*
     */
    public boolean joinInstance(java.lang.String arg0,java.lang.String arg1) { 
        LOG.info("Executing operation joinInstance");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#disjoinInstance(java.lang.String  arg0 ,)java.lang.String  arg1 )*
     */
    public boolean disjoinInstance(java.lang.String arg0,java.lang.String arg1) { 
        LOG.info("Executing operation disjoinInstance");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getInstanceID(*
     */
    public java.lang.String getInstanceID() { 
        LOG.info("Executing operation getInstanceID");
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#getJoinedGWs(*
     */
    public eu.betaas.service.instancemanager.web.soap.ArrayOfString getJoinedGWs() { 
        LOG.info("Executing operation getJoinedGWs");
        try {
            eu.betaas.service.instancemanager.web.soap.ArrayOfString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.betaas.service.instancemanager.web.soap.InstanceManagerExternalIFPortType#isBackupStar(*
     */
    public boolean isBackupStar() { 
        LOG.info("Executing operation isBackupStar");
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
