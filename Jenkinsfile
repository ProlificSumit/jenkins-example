pipeline {
    agent any

    tools {
        maven 'Maven_3_5_4'
    }

    environment {
        def mavenHome = tool name: 'Maven_3_5_4', type: 'maven'
        def JAVA_HOME = tool name: 'jdk-1.8', type: 'jdk'
    }


    stages {

        stage ('Compile stage') {
            steps {
                withMaven(maven: 'Maven_3_5_4') {

                    bat 'mvn --version'
                    bat 'mvn compile'
                    //sh 'mvn --version'
                    //sh 'mvn compile'
                }
            }
        }

        stage ('Testing stage') {

            steps {
                withMaven(maven: 'Maven_3_5_4') {
                    bat 'mvn test'
                    //sh 'mvn test'
                }
             }
         }

        stage ('Deployment stage') {

                steps {
                withMaven(maven: 'Maven_3_5_4') {
                    bat 'mvn deploy'
                    //sh 'mvn deploy'
                }
             }
         }
    }
}