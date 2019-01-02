#!/usr/bin/env groovy

def call(String name = 'amrutha') {
  echo "Hello, ${name}."
  echo env.deploy_user
  echo env['deploy_user']
}
