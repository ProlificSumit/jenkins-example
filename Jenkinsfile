pipeline {
    agent any

    environment {
        def mavenHome = tool name: 'Maven_3_5_4' type: 'maven'
    }


    stages {

        stage ('Compile stage') {
            steps {
                withMaven(maven: 'Maven_3_5_4') {
                    sh "${mavenHome}/bin/mvn compile"
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