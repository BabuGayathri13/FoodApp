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
                    sh 'mvn sonar:sonar -Dsonar.host.url=http://172.19.99.245:9000 -Dsonar.login=sqa_62b88187ed339f1612639bd7ab86267d5e5e95f5' 
                }
            }
        }
    }
}
