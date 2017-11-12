## How do I get this ?
Your IDE ([IntelliJ](https://www.jetbrains.com/idea/), [Eclipse](https://eclipse.org/), [Spring Tool Suit](https://spring.io/tools)) should be able to clone a project from Github.
It should be easy to find information regarding how to do that for your chosen IDE.
It's also possible to download the project as a .zip [here](https://github.com/ArtyFartyParty/IceArt/archive/master.zip).

## How do I run this ?
This project is setup using [Maven](https://maven.apache.org/what-is-maven.html) as a dependency manager, so if your IDE does not manage that, or you don't have it installed you can look [here](https://maven.apache.org/install.html) for further information.
When all the dependencies are downloaded, you can run the project by running the ``main()`` method in the class ``Application`` and then enter [localhost:8080](http://localhost:8080) into the address bar of your favorite web browser.

### What did you use to make this ?
I used IntelliJ Ultimate with Maven to setup this project. Students and Teachers get the Ultimate edition for free, apply [here](https://www.jetbrains.com/student/).

### Database
This project assumes there is a postgres database called IceArt at the URL: postgresql://localhost:5432/IceArtDB . See username and password in [application.properties](https://github.com/ArtyFartyParty/IceArt/blob/master/src/main/resources/application.properties) modify these fields to match your own username and password. We are using version 9.6 og postgreSQL.

### Credits
This project was created by Ása Júlía Aðalsteinsdóttir (aja11@hi.is), Melkorka Mjöll Jóhannesdóttir (mmj8@hi.is), Sigurlaug Þórðardóttir (sth301@hi.is) and Valgerður Sigfinnsdóttir (vas30@hi.is) in the HBV501G course fall 2017.
