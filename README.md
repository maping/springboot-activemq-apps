## 1. Create a repo manually

### 1.1 Create a repo on GitHub
Click "Repositories",then click "New" button,input "springboot-activemq-apps", leave all other input as default, click "Create repository".

### 1.2 Develop springboot activemq apps
创建 springboot-activemq-apps 目录，然后把所有有关 springboot activemq 应用复制到这里
- helloworld
- activemq-queue-producer
- activemq-queue-consumer
- activemq-topic-producer
- activemq-topic-consumer

### 1.3 Init repo 
```console
$ cd springboot-activemq-apps
$ echo "# springboot-activemq-apps" >> README.md
$ git init
$ git add -A
$ git commit -m "add springboot activemq apps"
$ git branch -M main
$ git remote add origin https://github.com/maping/springboot-activemq-apps.git
$ git push -u origin main
```
