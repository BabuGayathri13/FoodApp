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
                    sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.84:9000 -Dsonar.login=sqa_dfa478f11f619443e5f9bdb43e5d8610184c3719' 
                }
            }
        }
    }
}
