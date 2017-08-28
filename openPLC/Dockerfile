FROM resin/rpi-raspbian:latest


RUN apt-get update
RUN apt-get -y install apt-utils
RUN apt-get -y upgrade

RUN apt-get -y install git
RUN apt-get -y install g++
RUN apt-get -y install make

# install dependencies for OpenPLC code
RUN apt-get -y install build-essential pkg-config bison flex
RUN apt-get -y install autoconf automake libtool make nodejs git

# get wiringPi library and build
RUN mkdir codeWiringPi
RUN cd codeWiringPi && git clone git://git.drogon.net/wiringPi

#install wiringPi (requires sudo so install as well)
RUN apt-get -y install sudo
RUN cd codeWiringPi/wiringPi && ./build

# get PLC code and build
RUN mkdir codeOpenPLC
RUN cd codeOpenPLC && git clone https://github.com/thiagoralves/OpenPLC_v2.git

RUN export TERM=dumb && cd codeOpenPLC/OpenPLC_v2 && echo "N\n4" | ./build.sh

# get the program
RUN mkdir robDockerStuff
RUN cd robDockerStuff && git clone https://github.com/rca0007/DockerSamples.git


# begin compilation (inspired by openPLC server.js file)
RUN cd codeOpenPLC/OpenPLC_v2 && ./iec2c  ../../robDockerStuff/DockerSamples/openPLC/*.st
RUN cd codeOpenPLC/OpenPLC_v2 && mv -f POUS.c POUS.h LOCATED_VARIABLES.h VARIABLES.csv Config0.c Config0.h Res0.c ./core/
RUN cd codeOpenPLC/OpenPLC_v2 && ./build_core.sh 

CMD cd codeOpenPLC/OpenPLC_v2 && ./core/openplc