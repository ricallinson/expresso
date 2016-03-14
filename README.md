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

	Server started on port 8080, using 4 cores and 8 threads...

Now run apache bench;

	ab -n 1000000 -c 8 -k http://127.0.0.1:8080/

## Performance Results

The test was run on a MacBook Pro (Retina, 13-inch, Mid 2014), 3 GHz Intel Core i7 with 16 GB 1600 MHz DDR3 memory.

	Concurrency Level:      8
	Time taken for tests:   14.061 seconds
	Complete requests:      1000000
	Failed requests:        0
	Keep-Alive requests:    998004
	Total transferred:      119990020 bytes
	HTML transferred:       20000000 bytes
	Requests per second:    71116.47 [#/sec] (mean)
	Time per request:       0.112 [ms] (mean)
	Time per request:       0.014 [ms] (mean, across all concurrent requests)
	Transfer rate:          8333.27 [Kbytes/sec] received

## Problems Found

None.
