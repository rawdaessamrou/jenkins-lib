def call() {
    withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG_PATH')]) {
        sh '''
            echo "Searching for deployment.yaml in: $WORKSPACE"
            find "$WORKSPACE" -name "deployment.yaml"
            
            export KUBECONFIG="$KUBECONFIG_PATH"
            kubectl apply -f "$WORKSPACE/deployment.yaml"
        '''
    }
}
