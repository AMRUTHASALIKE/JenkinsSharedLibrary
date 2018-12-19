#!/usr/bin/env groovy

def call(String gitURL)
  {
    stage('Pull')
    {
       git "${gitURL}"
    }
  }
  
