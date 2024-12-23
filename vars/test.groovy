def call(String branch, String repoUr) {
    pipeline {
      agent any 
      
      stages {
          stage('clone'){
              steps{
                  echo "clone"
              }
          }
          stage('build'){
              steps{
                  echo "build"
              }
          }
          stage('test'){
              steps{
                  echo "test"
              }
          }
          stage('deploy'){
              steps{
                  echo "deploy"
              }
          }
      }
  }
}
