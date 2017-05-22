FROM ubuntu:latest

RUN apt-get update
RUN apt-get -y install git

RUN git clone https://github.com/rca0007/DockerSamples.git

RUN apt-get -y install g++
RUN apt-get -y install make
RUN make -C /DockerSamples/SampleCPPForDocker

CMD ./DockerSamples/SampleCPPForDocker/InfiniteAdding
