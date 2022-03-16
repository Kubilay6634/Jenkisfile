pipeline {
  agent any
  
  stages {
  
    stage('Clone sources') {
            steps{
              git branch: 'main', url: 'https://github.com/Sohaib42/agent-information.git'
            }
    }
  
    stage("build"){
            steps{
              echo 'Building Application'
              
              }
    }
    
    
    stage("test"){
            steps{
              echo 'Testing Application'
              
              }
    }
    
    
    stage("deploy"){
            steps{
              echo 'Deploying Application'
              
              }
    }
    
    }
    }
    
    
    
