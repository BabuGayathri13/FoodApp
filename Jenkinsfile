pipeline {
    agent any
    tools { 
        maven 'maven' 
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
                    sh 'mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=BabuGayathri13_FoodApp' 
                }
            }
        }
    }
}
