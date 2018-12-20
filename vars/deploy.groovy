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

def call(String key_id, String user, String ip)
{
  //echo "${key_id}"
  stage('Deploy')
  {
       dir('SpringMVCSecurityXML/target') 
       {  
         sh "echo ${key_id}"
         sshagent(["${key_id}"]) 
         {
           //scp SpringMVCSecurityXML.war /var/lib/tomcat8/webapps
           sh "echo ${key_id}"
           sh "scp /home/ubuntu/f1 ${user}@${ip}:~"
         }

       }
  }
}
