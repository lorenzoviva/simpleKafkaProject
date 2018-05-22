# simpleKafkaProject

Installazione di Docker: 
```
sudo apt-get update
sudo apt-get install apt-transport-https ca-certificates curl software-properties-common
sudo apt-get install apt-transport-https ca-certificates curl 
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add - 
sudo apt-key fingerprint 0EBFCD88 
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" 
sudo apt-get update 
sudo apt-get install docker-ce
sudo apt-get install docker
sudo apt install docker.io 
docker run hello-world
```
Eseguire un ambiente Docker (prima è necessario posizionarsi nella cartella del DockerFile)

```
docker build .
```
