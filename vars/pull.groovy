  def call(String gitURL)
  {
    stage('Pull')
    {
       git "${gitURL}"
    }
  }
  
