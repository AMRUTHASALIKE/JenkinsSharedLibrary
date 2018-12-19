#!/usr/bin/env groovy

def call()
{
  stage('Deploy')
  {
       dir('SpringMVCSecurityXML/target') 
       {
         sh 'cp SpringMVCSecurityXML.war /var/lib/tomcat8/webapps'
       }
  }
}
