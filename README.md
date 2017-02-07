changebasedregression.demo.Junit:
----------------------------------------------------------
### Synopsis:
This project is an example of change based regression process for Junit test cases. 
### How to Run:
1.Download this project by cloning it from this [location](http://infygit.ad.infosys.com/Venkatanishanth_S/Examples) take the http url and run this command
from git bash ```git clone <http url> ```

2.Download mongoDB and install in the local system.

3.Download tomcat and install it in the system and also go to the ```conf ``` folder of the tomcat and open ```server.XML```
and edit``` <Connector port="8080" protocol="HTTP/1.1"``` to``` <Connector port="3000" protocol="HTTP/1.1"```.

4.Now go to the project folder and run build.XML by giving it the properties namely ```PATH_TOMCAT``` and ```PATH_MONGODB```.

5.Here ```PATH_TOMCAT``` points to the location of folders of tomcat and ```PATH_MONGODB``` points to the  of mongod.exe of DB.

6.Now the test cases and their details are stored to DB and it is running on port ```27017```.
 
7.project name in which the test cases stored will be ```JunitTests```.

8.Now to view the tracked results first you should start the tomcat which can be done through build.XML ant task ```tomcat-start```. 

9.Now You can see the tracked test cases through UI. [How to use UI](http://infygit.ad.infosys.com/sub_projects_for_changeBasedRegression/Change_Based_Regression_Ui/wikis/home)

10.Now for running this build.XML again you have first stop the mongod.exe which has been started by build.XML you can do this
by going to mongoDB folder and start ```mongo.exe``` and run following commands ```use admin``` then ```db.shutdownServer()```.

11.You need to now stop the tomcat by build.xml ant task ```tomcat-stop```.