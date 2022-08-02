build-dist:
	gradle clean
	gradle installDist

run:
	./build/install/app/bin/app $(arg)

build:
	gradle check
	gradle build

run-dist: build-dist run


.PHONY: build