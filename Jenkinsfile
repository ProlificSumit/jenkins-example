pipeline {
    agent any




    stages {
                //get maven home path
                def mvnHome = tool name: 'Maven_3_5_4', type: 'maven'
                    sh "${mvnHome}/bin/mvn compile"
        stage ('Compile stage') {

            steps {
                withMaven(maven: 'Maven_3_5_4') {
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