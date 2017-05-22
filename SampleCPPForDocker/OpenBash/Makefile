all: OpenBash

OpenBash: OpenBash.o
	g++ OpenBash.o -o OpenBash

OpenBash.o: OpenBash.cpp
	g++ -c OpenBash.cpp

clean:
	rm *o OpenBash
