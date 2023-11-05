pipeline {
    environment {
        docker_image = ""
    }
    agent any
    stages {
        stage('Stage 1: Pull code from Github') {
            steps {
                git branch: 'main', url: 'https://github.com/rishi2o2o/Calculator.git'
            }
        }
        stage('Stage 2: Build jar file using Maven') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Stage 3: Build a docker image from the Dockerfile') {
            steps {
                script {
                    docker_image = docker.build "rishi2o2o/calculator:latest"
                }
            }
        }
        stage('Stage 4: Push the image to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        docker_image.push()
                    }
                }
            }
        }
        stage('Stage 5: Remove dangling images') {
            steps {
                script {
                    sh 'docker image prune -f'
                }
            }
        }
        stage('Stage 6: Pull image from Docker Hub and deploy on hosts using Ansible') {
            steps {
                ansiblePlaybook installation: 'Ansible',
                playbook: 'Deployment/deploy.yml',
                inventory: 'Deployment/inventory',
                credentialsId: 'LocalhostUserCredentials'
            }
        }
    }
}
