def call() {
    withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
        sh '''
            export KUBECONFIG=$KUBECONFIG
            kubectl apply -f deployment.yaml
        '''
    }
}
