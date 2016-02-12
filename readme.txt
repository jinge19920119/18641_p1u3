Project 1 - Unit 3    readme.txt

1.There are several files in it, class diagram,2 input files, output as several output cases and src for code.

2. class diagram.png is the class diagram of this unit. readFile1.txt and readFile1+.txt are two input files.

3.There are 6 packages in my program,adapter,scale,exception, driver, model and util. Other than scale created and adapter modified this unit, others keep the same. Scale package is created with one EditOptions class and Scalable interface. EditOptions extends Thread and is used for synchronization, Scalable is its interface. ProxyAutomobile in adapter package is modified to be according with this synchronization. What’s more, method of updateOptionPrice is changed to add the number it passes everytime, just to fit this request better. But i still have some confusion that just call the updateOptionPrice method one by one for several times doesn’t cause data corruption. 

4.There are just two cases here, one with ‘synchronized’ and one without it. The outcomes are served in outcome.txt 

5.All the comments and explanations of the project has been written in the code as comments.