pipeline {
    agent any

    stages {
        stage ('Compile stage') {
            withMaven(maven: 'Maven_3_5_4') {
                sh 'mvn compile'
            }
        }

        stage ('Testing stage') {
            withMaven(maven: 'Maven_3_5_4') {
                sh 'mvn test'
            }
         }

        stage ('Deployment stage') {
            withMaven(maven: 'Maven_3_5_4') {
                sh 'mvn deploy'
            }
         }
    }
}