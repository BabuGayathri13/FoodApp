pipeline {
    agent any
    tools { 
        maven 'maven3' 
    }
    environment {
        SONAR_TOKEN = credentials('SONAR_TOKEN')
        SONAR_HOST_URL = 'https://sonarcloud.io'
        SONAR_ORGANIZATION = 'babuGayathri13'
        SONAR_PROJECT_KEY = 'BabuGayathri13_FoodApp'
    }
    stages {
        
        
        stage('Build') { 
            steps {
                dir('semwebproject') {
                    sh 'mvn -B -DskipTests clean package' 
                }
            }
        }
        stage('Junit') { 
            steps {
                dir('semwebproject') {
                    sh 'mvn test jacoco:prepare-agent jacoco:report' 
                    junit '**/target/surefire-reports/*.xml'
                    
                }
            }
        }

        stage('Jacoco') { 
            steps {
                dir('semwebproject') {
                    sh 'mvn clean verify' 
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }

        
        stage('sonar') { 
            steps {
                dir('semwebproject') {
                    sh 'mvn clean verify sonar:sonar -Dsonar.token=$SONAR_TOKEN -Dsonar.host.url=$SONAR_HOST_URL -Dsonar.organization=$SONAR_ORGANIZATION -Dsonar.projectKey=$SONAR_PROJECT_KEY' 
                }
            }
        }
    }
}
