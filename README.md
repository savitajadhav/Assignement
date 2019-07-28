1.	Description of Repo

Created a Repo named ‘RtAssignement’.

Under ‘src’ folder 3 packages.

1.	com.rtassignment – which includes ‘BasePage.java’. BasePage class contains common method like 
initialization() – To initialize  the driver.
Login() – Written login method in base class so that it should be accessible in all other test cases.

2.	com.rtassignment.testcase – which includes all test cases.
LoginPageTest : includes below test cases:

TC1: User should be able to log in on entering valid credentials.

TC2: User should not be able to logged in on entering invalid credentials and should get proper error message. Below are cases

a.	Valid username & invalid password.

b.	Invalid username & valid password

c.	Valid username and blank password

d.	Blank username and valid password

e.	Blank username and Blank password

ActivityPageTest: 

TC3: Media should be uploaded with ‘Private’ privacy.

CreateAlbumTest:

TC4: User should be able to create album with proper name and ‘Private’ privacy and 5 media should uploaded successfully.

TC5: User should be able to like/unlike the media and once user liked the post media should show ‘Unlike’

ProfilePageTest:

TC6 : User should be able to change the cover image.

3.	com.rtassignemnt.sampleimages : This package includes sample images which are using to upload images while creating Album and also includes Auto it executable files.

2.	How to Set it up

1.	Create a New Repository

2.	Open it using this command in terminal

cd  ‘path of directory’

3.	Perform a ‘git init’ to create a new git repository

4.	Checkout a repository

Create a working copy of a local repository by running the command 
Git clone ‘path to repository’


5.	Add & Commit

You can propose changes using git add <filename>
   
To add all modified files git add .(dot)

6.	To actually commit these changes use git commit –m “commit message”

7.	Pushing changes

To send those changes to your remote repository , execute git push –u origin master

8.	If you have not cloned an existing repository and want to connect your repository to a remote server, you need to add it with git remote add origin<server>
   
9.	Now you are able to push your changes to selected remote server

10.	Pull the changes

If you want to pull the data from GitHub to your local, go to command line

a.	Go to driver/folder where you want all these data

mkdir foldername

cd foldername

b.	When you are pulling data first time, you need to clone your repository using

Git clone <path of github where you want to copy>
   
c.	Now go to eclipse>import>General>existing project into workspace

d.	To pull the recent changes from github use

git pull origin master

3.	How to run the code locally

   After exporting the project from GitHub to eclipse, execute the testing.xml to run the complete test suite.





 

                 
                    

