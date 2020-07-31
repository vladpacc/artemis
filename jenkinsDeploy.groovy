properties([
    parameters([
        booleanParam(defaultValue: false, description: 'please select to apply the changes', name: 'terraformApply '),
        booleanParam(defaultValue: false, description: 'Please select to Destroy everything', name: 'terraformDestroy'),
        booleanParam(defaultValue: false, description: 'Please select the job to run in debugMode', name: 'debugMode'),
        choice(choices: ['dev', 'qa', 'stage', 'prod'], description: 'Please select the environment to deploy.', name: 'environment')
        ])
     ])


printlb("""
##########################################
Terraform apply: ${params.terraformApply}
Selected env : ${params.environment}
##########################################
""")

println('Hello world')