#!/usr/bin/env groovy

import hudson.slaves.EnvironmentVariablesNodeProperty
import hudson.EnvVars


def call(String name = 'amrutha') {
  echo "Hello, ${name}."
  echo env.deploy_user
  echo env['deploy_user']
  echo "${env.deploy_user}"
 
  
}
