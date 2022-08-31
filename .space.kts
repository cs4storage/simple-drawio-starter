/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("shell script") {
    container(displayName = "Say Hello", image = "ubuntu") {
        shellScript {
            content = """
                echo Hello
                echo World!
                pwd
                whoami
                apt update -y  && apt install curl tmux sudo wget socat -y 
            """
        }
    }
}
