## Overview

Implementation of the FizzBuzz coding exercise in Java

## Setup

### Prerequites

- Scala
- Sbt


### Scala

The scala language can be downloaded from the [main site](https://www.scala-lang.org), specifically 
this [link](https://downloads.lightbend.com/scala/2.12.3/scala-2.12.3.tgz)

NOTE: I don't like installers that muck around with my system, I prefer an archive that I can just uncompress
under /opt or somewhere.  I am probably stupid.  However, I do uncompress the archives as root and make sure 
they are only writable by that user, so at least that means things stay clean

Ran the following commands as root

```
cd /opt
tar -zxf ~fiona/Downloads/scala-2.12.3.tgz
chown -R root scala-2.12.3/
chgrp -R wheel scala-2.12.3/
ln -s /opt/scala-2.12.3/ /opt/scala
```

Add the Scala binaries to my path using the following

```
export PATH=$PATH:/opt/scala/bin
```

### SBT

This can be downloaded from the [main SBT site](http://www.scala-sbt.org/index.html) by clicking on the 
[all platforms archive](https://cocl.us/sbt-1.0.1.tgz) link on the 
[download page](http://www.scala-sbt.org/download.html) 

Again this archive is uncompressed under /opt as root using the following commands

```
cd /opt
tar -zxf ~fiona/Downloads/sbt-1.0.1.tgz              
chown -R root sbt
chgrp -R wheel sbt
```
 
Add to path 

```
export PATH=$PATH:/opt/sbt
```


## Project Setup

### Creating Template

I needed a basic build.sbt file for the project, according to the 
[sbt documentation](http://www.scala-sbt.org/0.13/docs/Hello.html)
the following command should do the trick

```
echo "eefizzbuzz" | sbt new scala/scala-seed.g8
```

Technically the docs refer to [sbt/scala-seed.g8](https://github.com/sbt/scala-seed.g8) but this is forked from 
the [scala-seed.g8](https://github.com/scala/scala-seed.g8) repo

I couldn't find a way to pass the project name to the sbt command, hence the use of echo - bit of a hack.


### Change build.sbt



## Task

```
Guidance: This excercise should be completed within 90 minutes. TDD, Clean code and unit testing approach should be used.
Output should be archived as Zip file or into github.

FizBuzz
=======
Step 1:
Write code that prints out the following for a contiguous range of numbers:
* the number
* 'fizz' for numbers divisible by 3
* 'buzz' for numbers divisible by 5
* 'fizzbuzz' for numbers divisible by both 3 and 5
e.g. if I run the program over a range from 1-20 I should get the following output
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
Archive this as a zip file and continue to step two.


Step 2:
Enhance your existing FizzBuzz solution to perform the following:
* If the number contains a three you must output the text 'lucky'. This overrides any existing behaviour
e.g. if I run the program over a range from 1-20 should get the following output
1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz
Archive this as a zip file and continue to step three


Step 3:
Enhance your exising FizzBuzz solution to also print statistics about how many times the following were output:
- fizz
- buzz
- fizzbuzz
- luck
- number
e.g. if I run the prograrm over a range from 1-20 I should get the following output:
1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz
fizz: 4
buzz: 3
fizzbuzz: 1
luck: 2
number: 10

```
