#!/usr/bin/env groovy

def call()
{
  stage('Build')
  {
       dir('SpringMVCSecurityXML') 
       {
         sh 'mvn clean install'
       }
  }
}
