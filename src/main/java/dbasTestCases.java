import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.sql.SQLOutput;

public class dbasTestCases extends InterruptedException {


    // --------------------------------- Login Cases -------------------------------- //

    @Test
    public void loginTestCase1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert valid Admin details and then click on Sign in button");
        System.out.println("Expected Result : Admin should be Login");

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if its successfully login or not
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login failed");
        }

        driver.close();

    }           // Click Sign in btn with valid Admin details

    @Test
    public void loginTestCase2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("creator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert valid Creator details and then click on Sign in button");
        System.out.println("Expected Result : Creator should be Login");

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if its successfully login or not
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login failed");
        }

        driver.close();

    }           // Click Sign in btn with valid Creator details

    @Test
    public void loginTestCase3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("viewer");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert valid Viewer details and then click on Sign in button");
        System.out.println("Expected Result : Viewer should be Login");

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if its successfully login or not
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login failed");
        }

        driver.close();

    }           // Click Sign in btn with valid Viewer details

    @Test
    public void loginTestCase4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("invalidUserName");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement invalidTest = driver.findElement(By.xpath("//*[contains(text(),'Invalid')]"));
        if (invalidTest.isDisplayed()) {                       // asserting if the Invalid Credentials text is visible or not
            System.out.println("Invalid Credentials assertion passed");
        } else {
            System.out.println("Assertion Failed");
        }

        driver.close();

    }           // Click Sign in btn with invalid details

    @Test
    public void loginTestCase5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Click on Sign In button without inserting Username and Password");
        System.out.println("Expected Result : It should not Login and display 'Please fill out this field' on Username field");

        driver.close();

    }           // Click sign in with empty username and password

    @Test
    public void loginTestCase6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert username but no password");
        System.out.println("Expected Result : It should not Login and display 'Please fill out this field' on Password field");

        driver.close();

    }           // Click sign in with empty password

    @Test
    public void loginTestCase7() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert username but no password");
        System.out.println("Expected Result : It should not Login and display 'Please fill out this field' on Username field");

        driver.close();

    }           // Click sign in with empty username

    @Test
    public void loginTestCase8() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password11");
        Thread.sleep(2000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert valid username but invalid password");
        System.out.println("Expected Result : It should not Login and display 'Invalid Credentials");

        WebElement invalidTest = driver.findElement(By.xpath("//*[contains(text(),'Invalid')]"));
        if (invalidTest.isDisplayed()) {                       // asserting if the Invalid Credentials text is visible or not
            System.out.println("Invalid Credentials assertion passed");
        } else {
            System.out.println("Assertion Failed");
        }

        driver.close();

    }           // Click sign in with valid user but invalid password

    @Test
    public void loginTestCase9() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Saad123");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Login Functionality");
        System.out.println("Test Description : Insert invalid username but valid password");
        System.out.println("Expected Result : It should not Login and display 'Invalid Credentials");

        WebElement invalidTest = driver.findElement(By.xpath("//*[contains(text(),'Invalid')]"));
        if (invalidTest.isDisplayed()) {                       // asserting if the Invalid Credentials text is visible or not
            System.out.println("Invalid Credentials assertion passed");
        } else {
            System.out.println("Assertion Failed");
        }

        driver.close();

    }           // Click sign in with invalid user but valid password


    // --------------------------------- Select Client Cases -------------------------------- //

    @Test
    public void selectClient1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Client");
        System.out.println("Test Description : Insert valid user details and then click on Sign in button and see if all the necessary options are displaying to the admin.");
        System.out.println("Expected Result : User should login and can view all the necessary options on the dashboard");
        System.out.println("\n");


        WebElement userManagementText = driver.findElement(By.xpath("//*[contains(text(),'User Managment')]"));
        if (userManagementText.isDisplayed()) {                       // asserting if User Management btn is displaying or not
            System.out.println("- User Managment Button is displayed");
        } else {
            System.out.println("- User Managment Button is not displayed");
        }

        WebElement clientList = driver.findElement(By.xpath("//*[contains(text(),'Client List')]"));
        if (clientList.isDisplayed()) {                       // asserting if Client List btn is displaying or not
            System.out.println("- Client List Button is displayed");
        } else {
            System.out.println("- Client List Button is not displayed");
        }

        WebElement selectClient = driver.findElement(By.xpath("//b[contains(text(),'Select Client')]"));
        if (selectClient.isDisplayed()) {                       // asserting if Select Client btn is displaying or not
            System.out.println("- Select Client Button is displayed");
        } else {
            System.out.println("- Select Client Button is not displayed");
        }

        WebElement addNewClient = driver.findElement(By.xpath("//*[contains(text(),'Add New Client')]"));
        if (addNewClient.isDisplayed()) {                       // asserting if Add New Client btn is displaying or not
            System.out.println("- Add New Client Button is displayed");
        } else {
            System.out.println("- Add New Client Button is not displayed");
        }

        WebElement clientDropDown = driver.findElement(By.xpath("//select[@name='client']"));
        if (clientDropDown.isDisplayed()) {                       // asserting if Client dropdown is displaying or not
            System.out.println("- Client drop down is displayed");
        } else {
            System.out.println("- Client drop down is not displayed");
        }

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if logout button is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }

        driver.close();

    }           // Click sign in with valid user/password and land on dashboard

    @Test
    public void selectClient2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement clientList = driver.findElement(By.xpath("//*[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Client");
        System.out.println("Test Description : Insert valid user details and then click on Sign in button then click on Client list to see client list");
        System.out.println("Expected Result : Client list should display if the list having clients");
        System.out.println("\n");

        WebElement idColumn = driver.findElement(By.xpath("//*[contains(text(),'ID')]"));
        if(idColumn.isDisplayed()) {
            System.out.println("- ID's are displayed");
        }
        else {
            System.out.println("- ID's are not displayed");
        }
        WebElement deleteBtn = driver.findElement(By.xpath("//*[contains(text(),'Delete')]"));
        if(idColumn.isDisplayed()) {
            System.out.println("- Delete Button is displayed");
        }
        else {
            System.out.println("- Delete Button is not displayed");
        }

        driver.close();

    }           // Click on Client list and see the list having Id and Delete button along

    @Test
    public void selectClient3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement addNewClient = driver.findElement(By.xpath("//*[contains(text(),'Add New Client')]"));
        addNewClient.click();
        Thread.sleep(1000);

        WebElement insertClientName = driver.findElement(By.id("c_name"));
        insertClientName.click();
        insertClientName.sendKeys("sample");

        WebElement createClient = driver.findElement(By.id("add_client"));
        createClient.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Client");
        System.out.println("Test Description : Add New Client with sample name see if the Client is added in the Client drop down list");
        System.out.println("Expected Result : Client should be added in the Client drop down list");
        System.out.println("\n");

        WebElement clientAddedSuccessfully = driver.findElement(By.xpath("//*[contains(text(),'Client added successfully')]"));
        if(clientAddedSuccessfully.isDisplayed()){
            System.out.println("Client added Successfully");
        }
        else {
            System.out.println("Client is not added");
        }




        driver.close();

    }           // Click on Add New Client and see if the client is added in Client list

    @Test
    public void selectClient4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement selectClient = driver.findElement(By.xpath("//button/b[contains(text(),'Select Client')]"));
        selectClient.click();
        Thread.sleep(2000);


        System.out.println("Test Scenario : Select Client");
        System.out.println("Test Description : Select any client from the drop down list and press Select client button");
        System.out.println("Expected Result : User will land on Select project screen after clicking Select Client");
        System.out.println("\n");

        WebElement selectProjectText = driver.findElement(By.xpath("//b[contains(text(),'Select Project')]"));
        if(selectProjectText.isDisplayed()){
            System.out.println("- Landed on Select Project Screen");
        }
        else {
            System.out.println("- Not Landed on Select Project Screen");
        }

        driver.close();

    }           // Click on Select Client button after selecting any client from the list

    @Test
    public void selectClient5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement addNewClient = driver.findElement(By.xpath("//*[contains(text(),'Add New Client')]"));
        addNewClient.click();
        Thread.sleep(1000);

        WebElement createClient = driver.findElement(By.id("add_client"));
        createClient.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Client");
        System.out.println("Test Description : Add New Client with empty name and it should not create the client");
        System.out.println("Expected Result : Client should not be created");
        System.out.println("\n");

        WebElement createClientError = driver.findElement(By.xpath("//*[contains(text(),'Please Enter Client')]"));
        if(createClientError.isDisplayed()) {
            System.out.println("- Error : Please enter client name");
        }
        else {
            System.out.println("- Client is created");
        }

        driver.close();

    }           // Click on Add New Client and Create client with empty name

    @Test
    public void selectClient6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        logoutBtn.click();

        System.out.println("Test Scenario : Logout");
        System.out.println("Test Description : After Logged in click on Logout button");
        System.out.println("Expected Result : User should be logged out and get back to Sign in screen.");
        System.out.println("\n");

        WebElement signInButton = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        if(signInButton.isDisplayed()) {
            System.out.println("- Logout Successfully");
        }
        else {
            System.out.println("- Logout failed");
        }
        driver.close();

    }           // Click on Logout after logged in


    // --------------------------------- Select Project Cases -------------------------------- //

    @Test
    public void selectProject1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Client");
        System.out.println("Test Description : Insert valid user details and then click on Sign in button and see if all the necessary options are displaying to the admin.");
        System.out.println("Expected Result : User should login and can view all the necessary options on the dashboard");
        System.out.println("\n");


        WebElement userManagementText = driver.findElement(By.xpath("//*[contains(text(),'User Managment')]"));
        if (userManagementText.isDisplayed()) {                       // asserting if User Management btn is displaying or not
            System.out.println("- User Managment Button is displayed");
        } else {
            System.out.println("- User Managment Button is not displayed");
        }

        WebElement clientList = driver.findElement(By.xpath("//*[contains(text(),'Client List')]"));
        if (clientList.isDisplayed()) {                       // asserting if Client List btn is displaying or not
            System.out.println("- Client List Button is displayed");
        } else {
            System.out.println("- Client List Button is not displayed");
        }

        WebElement selectClient = driver.findElement(By.xpath("//b[contains(text(),'Select Client')]"));
        if (selectClient.isDisplayed()) {                       // asserting if Select Client btn is displaying or not
            System.out.println("- Select Client Button is displayed");
        } else {
            System.out.println("- Select Client Button is not displayed");
        }

        WebElement addNewClient = driver.findElement(By.xpath("//*[contains(text(),'Add New Client')]"));
        if (addNewClient.isDisplayed()) {                       // asserting if Add New Client btn is displaying or not
            System.out.println("- Add New Client Button is displayed");
        } else {
            System.out.println("- Add New Client Button is not displayed");
        }

        WebElement clientDropDown = driver.findElement(By.xpath("//select[@name='client']"));
        if (clientDropDown.isDisplayed()) {                       // asserting if Client dropdown is displaying or not
            System.out.println("- Client drop down is displayed");
        } else {
            System.out.println("- Client drop down is not displayed");
        }

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if logout button is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }

        driver.close();

    }           // Click sign in with valid user/password and land on dashboard




}