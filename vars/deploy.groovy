#!/usr/bin/env groovy

/*
def call()
{
  stage('Deploy')
  {
       dir('SpringMVCSecurityXML/target') 
       {
         sh 'whoami'
         sh 'cp SpringMVCSecurityXML.war /var/lib/tomcat8/webapps'
       }
  }
}
*/

def call()
{
  stage('Deploy')
  {
       dir('SpringMVCSecurityXML/target') 
       {         
         sshagent(['rs1']) 
         {
           //scp SpringMVCSecurityXML.war /var/lib/tomcat8/webapps
           sh "scp /home/ubuntu/f1 ubuntu@52.47.190.123:~"
         }

       }
  }
}
