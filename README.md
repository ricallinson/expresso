# expresso

__DO NOT USE - THIS IS UNDER DEVELOPMENT__

This is an [Express.js](http://expressjs.com/) inspired minimalist web framework for [Jmm](https://github.com/jminusminus/jmm).

## Install Jmm

Requires [Jmm](https://github.com/jminusminus/jmm).

	git clone git@github.com:jminusminus/jmm.git ~/.jmm
	source ~/.jmm/jmm.sh

## Run Test

Install and start the server with the following;

	<TODO>

The test will print the number of cores and threads the server is using;

	Server started, using 4 cores and 8 threads...

Now run apache bench;

	ab -n 1000000 -c 8 -k http://127.0.0.1:8080/

## Performance Results

The test was run on a MacBook Pro (Retina, 13-inch, Mid 2014), 3 GHz Intel Core i7 with 16 GB 1600 MHz DDR3 memory.

	Concurrency Level:      8
	Time taken for tests:   1.542 seconds
	Complete requests:      100000
	Failed requests:        0
	Keep-Alive requests:    99805
	Total transferred:      11999025 bytes
	HTML transferred:       2000000 bytes
	Requests per second:    64840.88 [#/sec] (mean)
	Time per request:       0.123 [ms] (mean)
	Time per request:       0.015 [ms] (mean, across all concurrent requests)
	Transfer rate:          7597.92 [Kbytes/sec] received

## Problems Found

None.
