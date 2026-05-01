def call() {
    withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG_PATH')]) {
        sh '''
            export KUBECONFIG="$KUBECONFIG_PATH"
            kubectl apply -f "${WORKSPACE}/deployment.yaml"
        '''
    }
