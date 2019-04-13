pipeline {
    agent any




    stages {
        stage ('Compile stage') {
                //get maven home path
                def mvnHome = tool name: 'Maven_3_5_4', type: 'maven'

            steps {
                withMaven(maven: 'Maven_3_5_4') {
                    sh "${mvnHome}/bin/mvn compile"
                }
            }
        }

        stage ('Testing stage') {

            steps {
                withMaven(maven: 'Maven_3_5_4') {
                    sh 'mvn test'
                }
             }
         }

        stage ('Deployment stage') {

                steps {
                withMaven(maven: 'Maven_3_5_4') {
                    sh 'mvn deploy'
                }
             }
         }
    }
}