package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.internal.ThreadExecutorMap;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class dbasTestCases extends InterruptedException {


    // --------------------------------- Login Cases -------------------------------- //

    @Test
    public void loginTestCase1() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("administrator");
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
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


        WebDriverManager.chromedriver().setup();
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

        //System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
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
        userName.sendKeys("ankur1234");
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
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Sign')]")));
        signInBtn.click();

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
        userName.sendKeys("ankur1234");
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
        userName.sendKeys("ankur1234");
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
        userName.sendKeys("ankur1234");
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
        if (idColumn.isDisplayed()) {
            System.out.println("- ID's are displayed");
        } else {
            System.out.println("- ID's are not displayed");
        }
        WebElement deleteBtn = driver.findElement(By.xpath("//*[contains(text(),'Delete')]"));
        if (idColumn.isDisplayed()) {
            System.out.println("- Delete Button is displayed");
        } else {
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
        userName.sendKeys("ankur1234");
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
        if (clientAddedSuccessfully.isDisplayed()) {
            System.out.println("Client added Successfully");
        } else {
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
        userName.sendKeys("ankur1234");
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
        if (selectProjectText.isDisplayed()) {
            System.out.println("- Landed on Select Project Screen");
        } else {
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
        userName.sendKeys("ankur1234");
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
        if (createClientError.isDisplayed()) {
            System.out.println("- Error : Please enter client name");
        } else {
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
        userName.sendKeys("ankur1234");
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
        if (signInButton.isDisplayed()) {
            System.out.println("- Logout Successfully");
        } else {
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
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid admin id/pw , and selecting client. Admin should land on the Select Project Screen.");
        System.out.println("Expected Result : Admin after selecting login and selecting client should land on Select Project screen and can view all the necessary details.");
        System.out.println("\n");

        WebElement clientOptions = driver.findElement(By.xpath("//select[@name='client']"));
        String clientName = clientOptions.getText();
        //System.out.println("Client Name : "+clientName);

        if (!clientName.trim().isEmpty()) {

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement projectList = driver.findElement(By.xpath("//*[contains(text(),'Project List')]"));
            if (projectList.isDisplayed()) {                       // asserting if Project List btn is displaying or not
                System.out.println("- Project List Button is displayed");
            } else {
                System.out.println("- Project List Button is displayed");
            }

            WebElement switchClient = driver.findElement(By.xpath("//*[contains(text(),'Switch Client')]"));
            if (switchClient.isDisplayed()) {                       // asserting if Switch Client btn is displaying or not
                System.out.println("- Switch Client Button is displayed");
            } else {
                System.out.println("- Switch Client Button is not displayed");
            }

            WebElement addNewProject = driver.findElement(By.xpath("//*[contains(text(),'Add New Project')]"));
            if (addNewProject.isDisplayed()) {                       // asserting if Add New Project btn is displaying or not
                System.out.println("- Add New Project Button is displayed");
            } else {
                System.out.println("- Add New Project Button is not displayed");
            }

            WebElement selectProject = driver.findElement(By.xpath("//*[contains(text(),'Select Project')]"));
            if (selectProject.isDisplayed()) {                       // asserting if Select Project btn is displaying or not
                System.out.println("- Select Project Button is displayed");
            } else {
                System.out.println("- Select Project Button is not displayed");
            }

            WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
            if (logoutBtn.isDisplayed()) {                       // asserting if Logout btn is displaying or not
                System.out.println("- Logout Button is displayed");
            } else {
                System.out.println("- Logout Button is not displayed");
            }
            Thread.sleep(2000);
            driver.close();

        }           // Click sign in with valid user/password and land on dashboard

        else {

            WebElement addNewClientBtn = driver.findElement(By.xpath("//a[contains(text(),'Add New Client')]"));
            addNewClientBtn.click();
            Thread.sleep(1000);

            int min = 0, max = 1000;
            int randomNum = (int) (Math.random() * (max - min + 1) + min);
            //String randomString = UUID.randomUUID().toString();
            WebElement enterClientName = driver.findElement(By.id("c_name"));
            enterClientName.click();
            enterClientName.sendKeys("Client" + randomNum);
            Thread.sleep(1000);
            WebElement addClientBtn = driver.findElement(By.id("add_client"));
            addClientBtn.click();
            Thread.sleep(1000);

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement projectList = driver.findElement(By.xpath("//*[contains(text(),'Project List')]"));
            if (projectList.isDisplayed()) {                       // asserting if Project List btn is displaying or not
                System.out.println("- Project List Button is displayed");
            } else {
                System.out.println("- Project List Button is displayed");
            }

            WebElement switchClient = driver.findElement(By.xpath("//*[contains(text(),'Switch Client')]"));
            if (switchClient.isDisplayed()) {                       // asserting if Switch Client btn is displaying or not
                System.out.println("- Switch Client Button is displayed");
            } else {
                System.out.println("- Switch Client Button is not displayed");
            }

            WebElement addNewProject = driver.findElement(By.xpath("//*[contains(text(),'Add New Project')]"));
            if (addNewProject.isDisplayed()) {                       // asserting if Add New Project btn is displaying or not
                System.out.println("- Add New Project Button is displayed");
            } else {
                System.out.println("- Add New Project Button is not displayed");
            }

            WebElement selectProject = driver.findElement(By.xpath("//*[contains(text(),'Select Project')]"));
            if (selectProject.isDisplayed()) {                       // asserting if Select Project btn is displaying or not
                System.out.println("- Select Project Button is displayed");
            } else {
                System.out.println("- Select Project Button is not displayed");
            }

            WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
            if (logoutBtn.isDisplayed()) {                       // asserting if Logout btn is displaying or not
                System.out.println("- Logout Button is displayed");
            } else {
                System.out.println("- Logout Button is not displayed");
            }
            Thread.sleep(2000);
            driver.close();

        }

    }           // Click on Select client and land on Select Project screen


    @Test
    public void selectProject2() throws InterruptedException {

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

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid creator id/pw , Creator should land on the Select Project Screen.");
        System.out.println("Expected Result : Creator after landing on Select Project screen can view Add New Project, Select Project and Logout buttons only.");
        System.out.println("\n");

        WebElement addNewProject = driver.findElement(By.xpath("//*[contains(text(),'Add New Project')]"));
        if (addNewProject.isDisplayed()) {                       // asserting if Add New Project btn is displaying or not
            System.out.println("- Add New Project Button is displayed");
        } else {
            System.out.println("- Add New Project Button is not displayed");
        }

        WebElement selectProject = driver.findElement(By.xpath("//*[contains(text(),'Select Project')]"));
        if (selectProject.isDisplayed()) {                       // asserting if Select Project btn is displaying or not
            System.out.println("- Select Project Button is displayed");
        } else {
            System.out.println("- Select Project Button is not displayed");
        }

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if Logout btn is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }

    }           // Creator should have access to select project screen


    @Test
    public void selectProject3() throws InterruptedException {

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

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid viewer id/pw , Viewer should land on the Select Project Screen.");
        System.out.println("Expected Result : Viewer after landing on Select Project screen can view Select Project and Logout buttons only.");
        System.out.println("\n");

        WebElement selectProject = driver.findElement(By.xpath("//*[contains(text(),'Select Project')]"));
        if (selectProject.isDisplayed()) {                       // asserting if Select Project btn is displaying or not
            System.out.println("- Select Project Button is displayed");
        } else {
            System.out.println("- Select Project Button is not displayed");
        }

        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/Home/logout']"));
        if (logoutBtn.isDisplayed()) {                       // asserting if Logout btn is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }
        Thread.sleep(2000);
        driver.close();

    }           // Viewer should have access to select project screen


    @Test
    public void selectProject4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid Admin id/pw , Admin can view project list after clicking Project list btn on the Select Project screen.");
        System.out.println("Expected Result : Admin after landing on the Select Project screen, can access Project list");
        System.out.println("\n");

        WebElement clientOptions = driver.findElement(By.xpath("//select[@name='client']"));
        String clientName = clientOptions.getText();
        if (!clientName.trim().isEmpty()) {

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement projectListBtn = driver.findElement(By.xpath("//*[contains(text(),'Project List')]"));
            projectListBtn.click();


            Thread.sleep(2000);
            driver.close();

        }           // Click sign in with valid user/password and land on dashboard

        else {

            WebElement addNewClientBtn = driver.findElement(By.xpath("//a[contains(text(),'Add New Client')]"));
            addNewClientBtn.click();
            Thread.sleep(1000);

            String randomString = UUID.randomUUID().toString();
            WebElement enterClientName = driver.findElement(By.id("c_name"));
            enterClientName.click();
            enterClientName.sendKeys(randomString);
            Thread.sleep(1000);
            WebElement addClientBtn = driver.findElement(By.id("add_client"));
            addClientBtn.click();
            Thread.sleep(1000);

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement projectListBtn = driver.findElement(By.xpath("//*[contains(text(),'Project List')]"));
            projectListBtn.click();

            Thread.sleep(2000);
            driver.close();

        }


    }           // Admin can access the Project list after clicking Project list button


    @Test
    public void selectProject5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid Admin id/pw , Admin creates Project ");
        System.out.println("Expected Result : Admin after landing on the Select Project screen, and inserting new project name , Project should be created");
        System.out.println("\n");

        WebElement clientOptions = driver.findElement(By.xpath("//select[@name='client']"));
        String clientName = clientOptions.getText();
        if (!clientName.trim().isEmpty()) {

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement addNewProject = driver.findElement(By.xpath("//a[contains(text(),'Add New Project')]"));
            addNewProject.click();
            Thread.sleep(1000);

            WebElement projectNameField = driver.findElement(By.id("p_name"));
            projectNameField.click();
            int min = 0, max = 1000;
            int randomNum = (int) (Math.random() * (max - min + 1) + min);
            projectNameField.sendKeys("Project" + randomNum);
            WebElement targetDatabase = driver.findElement(By.id("ddldbtargetid"));
            targetDatabase.click();
            targetDatabase.sendKeys(Keys.DOWN);
            targetDatabase.sendKeys(Keys.ENTER);

            driver.findElement(By.id("add_project")).click();               // add project button

            Thread.sleep(2000);
            driver.close();

        } else {

            WebElement addNewClientBtn = driver.findElement(By.xpath("//a[contains(text(),'Add New Client')]"));
            addNewClientBtn.click();
            Thread.sleep(1000);

            int min = 0, max = 1000;
            int randomNum = (int) (Math.random() * (max - min + 1) + min);

            WebElement enterClientName = driver.findElement(By.id("c_name"));
            enterClientName.click();
            enterClientName.sendKeys("Client" + randomNum);
            Thread.sleep(1000);
            WebElement addClientBtn = driver.findElement(By.id("add_client"));
            addClientBtn.click();
            Thread.sleep(1000);

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement addNewProject = driver.findElement(By.xpath("//a[contains(text(),'Add New Project')]"));
            addNewProject.click();
            Thread.sleep(1000);

            WebElement projectNameField = driver.findElement(By.id("p_name"));
            projectNameField.click();
            int mini = 0, maxi = 1000;
            int randomNo = (int) (Math.random() * (maxi - mini + 1) + mini);
            projectNameField.sendKeys("Project" + randomNo);
            WebElement targetDatabase = driver.findElement(By.id("ddldbtargetid"));
            targetDatabase.click();
            targetDatabase.sendKeys(Keys.DOWN);
            targetDatabase.sendKeys(Keys.ENTER);

            driver.findElement(By.id("add_project")).click();               // add project button

            Thread.sleep(2000);
            driver.close();

        }


    }           // Admin creates a project with valid project name after selecting client


    @Test
    public void selectProject6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid Admin id/pw , Admin creates Project ");
        System.out.println("Expected Result : Admin after landing on the Select Project screen, and inserting new project name , Project should be created");
        System.out.println("\n");

        WebElement clientOptions = driver.findElement(By.xpath("//select[@name='client']"));
        String clientName = clientOptions.getText();
        if (!clientName.trim().isEmpty()) {

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement addNewProject = driver.findElement(By.xpath("//a[contains(text(),'Add New Project')]"));
            addNewProject.click();
            Thread.sleep(1000);

            WebElement projectNameField = driver.findElement(By.id("p_name"));
            projectNameField.click();

            projectNameField.sendKeys("#$%%#Project");
            WebElement targetDatabase = driver.findElement(By.id("ddldbtargetid"));
            targetDatabase.click();
            targetDatabase.sendKeys(Keys.DOWN);
            targetDatabase.sendKeys(Keys.ENTER);

            driver.findElement(By.id("add_project")).click();               // add project button

            WebElement invalidText = driver.findElement(By.xpath("//*[contains(text(),'Invalid username')]"));
            if (invalidText.isDisplayed()) {
                System.out.println("Assertion : Invalid text appears");
            } else {
                System.out.println("Assertion : Invalid text do not appears");
            }
            Thread.sleep(2000);
            driver.close();

        } else {

            WebElement addNewClientBtn = driver.findElement(By.xpath("//a[contains(text(),'Add New Client')]"));
            addNewClientBtn.click();
            Thread.sleep(1000);

            int min = 0, max = 1000;
            int randomNum = (int) (Math.random() * (max - min + 1) + min);

            WebElement enterClientName = driver.findElement(By.id("c_name"));
            enterClientName.click();
            enterClientName.sendKeys("Client" + randomNum);
            Thread.sleep(1000);
            WebElement addClientBtn = driver.findElement(By.id("add_client"));
            addClientBtn.click();
            Thread.sleep(1000);

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement addNewProject = driver.findElement(By.xpath("//a[contains(text(),'Add New Project')]"));
            addNewProject.click();
            Thread.sleep(1000);

            WebElement projectNameField = driver.findElement(By.id("p_name"));
            projectNameField.click();
//            int mini = 0 , maxi = 1000;
//            int randomNo = (int)(Math.random()*(maxi-mini+1)+mini);
            projectNameField.sendKeys("$%##Project");
            WebElement targetDatabase = driver.findElement(By.id("ddldbtargetid"));
            targetDatabase.click();
            targetDatabase.sendKeys(Keys.DOWN);
            targetDatabase.sendKeys(Keys.ENTER);

            driver.findElement(By.id("add_project")).click();               // add project button

            WebElement invalidText = driver.findElement(By.xpath("//*[contains(text(),'Invalid username')]"));
            if (invalidText.isDisplayed()) {
                System.out.println("Assertion : Invalid text appears");
            } else {
                System.out.println("Assertion : Invalid text do not appears");
            }

            Thread.sleep(2000);
            driver.close();

        }


    }           // Admin creates a project with invalid project name after selecting client


    @Test
    public void selectProject7() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        System.out.println("Test Scenario : Select Project");
        System.out.println("Test Description : After inserting valid admin id/pw ,and selecting client and project. Admin will land on project home screen.");
        System.out.println("Expected Result : Admin after selecting client and project will land on project home screen, and project name from Select project screen and Home screen should be same.");
        System.out.println("\n");

        WebElement clientOptions = driver.findElement(By.xpath("//select[@name='client']"));
        String clientName = clientOptions.getText();
        if (!clientName.trim().isEmpty()) {

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement selectedProjectName = driver.findElement(By.xpath("//select[@name='project']/option[1]"));
            String projectNameFromSelectProject = selectedProjectName.getText();
            WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectProjectBtn.click();

            WebElement projectNameOnHomeScreen = driver.findElement(By.xpath("//h5"));
            String a = projectNameOnHomeScreen.getText();

            String[] projectNameFromHomPage = a.split(" ");
            String projectNameFromHomePage = projectNameFromHomPage[3];

            Assert.assertEquals(projectNameFromHomePage, projectNameFromSelectProject, "Assertion : Project names doesn't match");
            System.out.println("Assertion : Project names are same");

            Thread.sleep(2000);
            driver.close();

        } else {

            WebElement addNewClientBtn = driver.findElement(By.xpath("//a[contains(text(),'Add New Client')]"));
            addNewClientBtn.click();
            Thread.sleep(1000);

            int min = 0, max = 1000;
            int randomNum = (int) (Math.random() * (max - min + 1) + min);

            WebElement enterClientName = driver.findElement(By.id("c_name"));
            enterClientName.click();
            enterClientName.sendKeys("Client" + randomNum);
            Thread.sleep(1000);
            WebElement addClientBtn = driver.findElement(By.id("add_client"));
            addClientBtn.click();
            Thread.sleep(1000);

            WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectClientBtn.click();
            Thread.sleep(1000);

            WebElement selectedProjectName = driver.findElement(By.xpath("//select[@name='project']/option[1]"));
            String projectNameFromSelectProject = selectedProjectName.getText();
            WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
            selectProjectBtn.click();

            WebElement projectNameOnHomeScreen = driver.findElement(By.xpath("//h5"));
            String a = projectNameOnHomeScreen.getText();

            String[] projectNameFromHomPage = a.split(" ");
            String projectNameFromHomePage = projectNameFromHomPage[3];

            Assert.assertEquals(projectNameFromHomePage, projectNameFromSelectProject, "Assertion : Project names doesn't match");
            System.out.println("Assertion : Project names are same");


            Thread.sleep(2000);
            driver.close();

        }           // Admin select client and project then he should land on home screen with selected details


    }           // Admin select client and project and verify if the project name from select project and home screen matches


    // --------------------------------- User Management Cases -------------------------------- //


    @Test
    public void userManagement1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin tries to create a user with special characters");
        System.out.println("Expected Result : Admin should not be able to create a user with special characters.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

        WebElement usrName = driver.findElement(By.id("username"));
        usrName.click();
        usrName.sendKeys("!!!");
        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        pasword.sendKeys("12345678");
        WebElement saveUser = driver.findElement(By.id("btn_save"));
        saveUser.click();

        Thread.sleep(2000);
        driver.close();

    }           // Admin creates a user with invalid username       (Add Assertion on popup)


    @Test
    public void userManagement2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin adds another admin from User Management");
        System.out.println("Expected Result : Admin adds another admin, it should be added.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

        WebElement usrName = driver.findElement(By.id("username"));
        usrName.click();
        int min = 0, max = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        usrName.sendKeys("Admin"+randomNum);
        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        pasword.sendKeys("12345678");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='_authorization']")));
        s.selectByVisibleText("Administrator");

        WebElement saveUser = driver.findElement(By.id("btn_save"));
        saveUser.click();

        WebElement addedSuccessfullyText = driver.findElement(By.xpath("//*[contains(text(),'Administrator added successfully')]"));
        if (addedSuccessfullyText.isDisplayed()){
            System.out.println("Assertion : Admin Successfully Added");
        }
        else {
            System.out.println("Assertion : Admin Not Added Successfully");
        }

        Thread.sleep(2000);
        driver.close();

    }           // Admin adds another admin from User Management


    @Test
    public void userManagement3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin adds Creator from User Management");
        System.out.println("Expected Result : Admin adds Creator, it should be added.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

        WebElement usrName = driver.findElement(By.id("username"));
        usrName.click();
        int min = 0, max = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        usrName.sendKeys("Creator"+randomNum);
        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        pasword.sendKeys("12345678");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='_authorization']")));
        s.selectByVisibleText("Creator");

        WebElement clientName = driver.findElement(By.id("ddlclientid"));
        clientName.click();
        clientName.sendKeys(Keys.DOWN);
        clientName.sendKeys(Keys.ENTER);

        WebElement saveUser = driver.findElement(By.id("btn_save"));
        saveUser.click();

        WebElement addedSuccessfullyText = driver.findElement(By.xpath("//*[contains(text(),'User added successfully')]"));
        if (addedSuccessfullyText.isDisplayed()){
            System.out.println("Assertion : Creator Successfully Added");
        }
        else {
            System.out.println("Assertion : Creator Not Added Successfully");
        }

        Thread.sleep(2000);
        driver.close();

    }           // Admin adds Creator from User Management


    @Test
    public void userManagement4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin adds Viewer from User Management");
        System.out.println("Expected Result : Admin adds Viewer, it should be added.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

        WebElement usrName = driver.findElement(By.id("username"));
        usrName.click();
        int min = 0, max = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        usrName.sendKeys("Admin"+randomNum);
        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        pasword.sendKeys("12345678");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='_authorization']")));
        s.selectByVisibleText("Viewer");

        WebElement clientName = driver.findElement(By.id("ddlclientid"));
        clientName.click();
        clientName.sendKeys(Keys.DOWN);
        clientName.sendKeys(Keys.ENTER);

        WebElement saveUser = driver.findElement(By.id("btn_save"));
        saveUser.click();

        WebElement addedSuccessfullyText = driver.findElement(By.xpath("//*[contains(text(),'User added successfully')]"));
        if (addedSuccessfullyText.isDisplayed()){
            System.out.println("Assertion : Viewer Successfully Added");
        }
        else {
            System.out.println("Assertion : Viewer Not Added Successfully");
        }

        Thread.sleep(2000);
        driver.close();

    }           // Admin adds Viewer from User Management

    @Test
    public void userManagement5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin adding another admin ");
        System.out.println("Expected Result : While adding another admin, client list should be disabled.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

        WebElement usrName = driver.findElement(By.id("username"));
        usrName.click();
        int min = 0, max = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        usrName.sendKeys("Admin"+randomNum);
        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        pasword.sendKeys("12345678");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='_authorization']")));
        s.selectByVisibleText("Administrator");

        WebElement clientName = driver.findElement(By.id("ddlclientid"));
        if(!clientName.isEnabled()) {
            System.out.println("Assertion : Client List is Disabled while creating new Admin user");
        }
        else {
            System.out.println("Assertion : Client List is Enabled while creating new Admin user");
        }

        WebElement saveUser = driver.findElement(By.id("btn_save"));
        saveUser.click();

        WebElement addedSuccessfullyText = driver.findElement(By.xpath("//*[contains(text(),'Administrator added successfully')]"));
        if (addedSuccessfullyText.isDisplayed()){
            System.out.println("Assertion : Administrator Successfully Added");
        }
        else {
            System.out.println("Assertion : Administrator Not Added Successfully");
        }

        Thread.sleep(2000);
        driver.close();

    }           // While adding another Admin, Client list should be disabled


    @Test
    public void userManagement6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin adding another admin ");
        System.out.println("Expected Result : While adding another admin, client list should be disabled.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

        WebElement usrName = driver.findElement(By.id("username"));
        usrName.click();
        usrName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        Thread.sleep(1000);
        pasword.sendKeys("12345678");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='_authorization']")));
        s.selectByVisibleText("Administrator");

        WebElement saveUser = driver.findElement(By.id("btn_save"));
        saveUser.click();
        Thread.sleep(1000);

        WebElement userAlreadyExistText = driver.findElement(By.xpath("//*[contains(text(),'Username already exist')]"));
        if(userAlreadyExistText.isDisplayed()) {
            System.out.println("Assertion : User already exists");
        }
        else {
            System.out.println("Assertion : User successfully created");
        }
        driver.close();

    }           // User should not be able to create with same username


    @Test
    public void userManagement7() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin updating other user ");
        System.out.println("Expected Result : When admin edits any user's profile, it should be updated.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

//        List<WebElement> userEditBtn = driver.findElements(By.id("btnEdit"));
//        clientEditBtn.get(2).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");

        WebElement userEditBtn = driver.findElement(By.xpath("//tbody/tr[2][@style='font-weight:100;']/td/a[@id='btnEdit']"));
        userEditBtn.click();
        Thread.sleep(1000);

        WebElement pasword = driver.findElement(By.id("password"));
        pasword.click();
        int min = 0, max = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        pasword.sendKeys("1234"+randomNum);

        driver.findElement(By.id("btn_save")).click();          // Updating user by clicking on Save User button

        WebElement usrUpdateText = driver.findElement(By.xpath("//*[contains(text(),'User Updated Successfully')]"));
        String userUpdateText = usrUpdateText.getText();

        Assert.assertEquals(userUpdateText,"User Updated Successfully","Assertion : User not updated");
        System.out.println("Assertion : User successfully updated");

        Thread.sleep(2000);
        driver.close();

    }           // Admin should be able to edit other users record


    @Test
    public void userManagement8() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin deleting other user ");
        System.out.println("Expected Result : When admin delete any user's profile, it should be deleted.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


        List<WebElement> deleteBtn = driver.findElements(By.xpath("//a[@class='btn']"));
        int count = deleteBtn.size();
        deleteBtn.get(count-1).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Yes")).click();

        Thread.sleep(1000);

        WebElement userDeletText = driver.findElement(By.xpath("//*[contains(text(),'User Deleted Successfully')]"));
        String userDeleteText =userDeletText.getText();
        Assert.assertEquals(userDeleteText,"User Deleted Successfully","Assertion :User Not Deleted Successfully");
        System.out.println("Assertion : User Deleted Successfully");

        Thread.sleep(2000);
        driver.close();

    }           // Admin should be able to delete other users record


    @Test
    public void userManagement9() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : User logout from ther main menu");
        System.out.println("Expected Result : When user clicks on Logout button then he should be logged out.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement logoutBtn = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        logoutBtn.click();
        Thread.sleep(2000);

        WebElement signinBtn = driver.findElement(By.id("login"));
        String copySignInText = signinBtn.getText();

        Assert.assertEquals(copySignInText,"Sign In","Assertion - Didn't Logout Successfully");
        System.out.println("Assertion - Logout Successfully");

        driver.close();

    }           // User should be able to logout from the main menu


    @Test
    public void userManagement10() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin clicks on Edit button of any user");
        System.out.println("Expected Result : All the details will be auto inserted after the edit button clicked.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();

//        List<WebElement> userEditBtn = driver.findElements(By.id("btnEdit"));
//        clientEditBtn.get(2).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");

        WebElement userEditBtn = driver.findElement(By.xpath("//tbody/tr[2][@style='font-weight:100;']/td/a[@id='btnEdit']"));
        userEditBtn.click();

        Thread.sleep(3000);
        driver.close();

    }           // After clicking on Edit button of any user , details should autofill in the fields


    @Test
    public void userManagement11() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : User Management");
        System.out.println("Test Description : Admin get into the User Management Page and he can see list of users registered");
        System.out.println("Expected Result : Admin can see all the user list inside User Management Page");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement userManagement = driver.findElement(By.xpath("//a[contains(text(),'User Managment')]"));
        userManagement.click();



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");

        Thread.sleep(3000);
        driver.close();

    }           // Admin can view all the registered users on User Management Page



    // --------------------------------- Aggregate Db Report Cases -------------------------------- //


    @Test
    public void aggregateDbReport1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User should be able to see the correct count of database items on aggregated db report page");
        System.out.println("Expected Result : Count of databases and individuals in the list should be same");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(2000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H1");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        List<WebElement> dbRecords = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        int countOfDbRecordOnProjectScreen = dbRecords.size();
        String countOfRecordsOnProjectScreen = String.valueOf(countOfDbRecordOnProjectScreen);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(3000);

        WebElement numberOfDatabasesCount = driver.findElement(By.xpath("//div[@class='row'][3]/div[@class='col'][2]/h5"));
        String countOfNumberOfDatabases = numberOfDatabasesCount.getText();

        Assert.assertEquals(countOfNumberOfDatabases,countOfRecordsOnProjectScreen,"Assertion : Count are not same, Count of Project Screen : "+countOfRecordsOnProjectScreen+ " and Count of Number of Databases in Aggregate View : "+countOfNumberOfDatabases);
        System.out.println("Assertion : Counts are same,  Count of Project Screen : "+countOfRecordsOnProjectScreen+ " and Count of Number of Databases in Aggregate View : " +countOfNumberOfDatabases);

        Thread.sleep(1000);
        driver.close();

    }           // Count of DB records in Project Screen and No of DB's in Aggregate View should be same


    @Test
    public void aggregateDbReport2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User after selecting client and project and Aggregate view,should not see the graph if the count is 0");
        System.out.println("Expected Result : User should not see the graph if the count is 0");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H12");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        List<WebElement> dbRecords = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        int countOfDbRecordOnProjectScreen = dbRecords.size();
        String countOfRecordsOnProjectScreen = String.valueOf(countOfDbRecordOnProjectScreen);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(2000);

        WebElement failingAcessReportText = driver.findElement(By.xpath("//*[contains(text(),'Make a DB Connection')]"));
        String failingAccessReportText = failingAcessReportText.getText();

        if(countOfDbRecordOnProjectScreen == 0 && failingAccessReportText.equals("Make a DB Connection before accessing Report.")) {
            System.out.println("Assertion : Count is "+countOfDbRecordOnProjectScreen+ " and Error on Clicking View Aggregate Report : "+failingAccessReportText);
        }
        else {
            System.out.println("Assertion : Count is not 0 and neither its getting error on clicking View Aggregate Report");
        }

        Thread.sleep(1000);
        driver.close();

    }           // User should not see the graph if the count is 0


    @Test
    public void aggregateDbReport3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User after selecting client and project and Aggregate view,should not see the graph if the count is 0");
        System.out.println("Expected Result : User should not see the graph if the count is 0");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H12");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        List<WebElement> dbRecords = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        int countOfDbRecordOnProjectScreen = dbRecords.size();
        String countOfRecordsOnProjectScreen = String.valueOf(countOfDbRecordOnProjectScreen);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(2000);

        WebElement failingAcessReportText = driver.findElement(By.xpath("//*[contains(text(),'Make a DB Connection')]"));
        String failingAccessReportText = failingAcessReportText.getText();

        if(countOfDbRecordOnProjectScreen == 0 && failingAccessReportText.equals("Make a DB Connection before accessing Report.")) {
            System.out.println("Assertion : Count is "+countOfDbRecordOnProjectScreen+ " and Error on Clicking View Aggregate Report : "+failingAccessReportText);
        }
        else {
            System.out.println("Assertion : Count is not 0 and neither its getting error on clicking View Aggregate Report");
        }

        Thread.sleep(1000);
        driver.close();

    }           // Reports under Aggregate view should be matching with individual reports


    @Test
    public void aggregateDbReport4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User after selecting client and project and Aggregate view,should see the graph if there are some records");
        System.out.println("Expected Result : User should see the graph if the records is more than 0");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H1");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        WebElement graph = driver.findElement(By.id("MyBarChart"));
        if(graph.isDisplayed()) {
            System.out.println("Assertion : Graph is displayed to the User");
        }
        else {
            System.out.println("Assertion : Graph is not displayed to the User");
        }

        Thread.sleep(1000);
        driver.close();

    }           // User should see the graph if there are some records


    @Test
    public void aggregateDbReport5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User after selecting client and project , and getting into View Aggregate Reports, should see all the details");
        System.out.println("Expected Result : User should see (Overall Complexity, Project Name, No of Databases, Estimated timeline and total size of databases");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H1");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(2000);

        WebElement clientName = driver.findElement(By.xpath("//div[@class='row'][1]/div[@class='col'][1]/h5"));
        String getClientName = clientName.getText();
        WebElement overallComplexity = driver.findElement(By.xpath("//div[@class='row'][2]/div[@class='col'][1]/h5"));
        String getOverallComplexity = overallComplexity.getText();
        WebElement estimatedTimeline = driver.findElement(By.xpath("//div[@class='row'][2]/div[@class='col'][2]/h5"));
        String getestimatedTimeline = estimatedTimeline.getText();
        WebElement projectName = driver.findElement(By.xpath("//div[@class='row'][3]/div[@class='col'][1]/h5"));
        String getprojectName = projectName.getText();
        WebElement numberOfDatabases = driver.findElement(By.xpath("//div[@class='row'][3]/div[@class='col'][2]/h5"));
        String getnumberOfDatabases = numberOfDatabases.getText();
        WebElement totalSizeOfDatabase = driver.findElement(By.xpath("//div[@class='row'][3]/div[@class='col'][3]/h5"));
        String gettotalSizeOfDatabase = totalSizeOfDatabase.getText();

        System.out.println("Client Name : "+getClientName);
        System.out.println("OverAll Complexity : "+getOverallComplexity);
        System.out.println("Estimated Timeline : "+getestimatedTimeline);
        System.out.println("Project Name : "+getprojectName);
        System.out.println("Number of Databases : "+getnumberOfDatabases);
        System.out.println("Total Size of Databases : "+gettotalSizeOfDatabase);


        Thread.sleep(1000);
        driver.close();

    }           // User should see (complexity,projectName,no Of Db,estimated time and total size) inside Aggregate View


    @Test
    public void aggregateDbReport6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User after selecting client and project and Aggregate view,can download the pdf");
        System.out.println("Expected Result : After clicking on PDF , it should be downloaded");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H1");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        WebElement downloadPdf = driver.findElement(By.id("printPDF"));
        downloadPdf.click();



        Thread.sleep(2000);
        driver.close();

    }           // User clicks on Pdf and it should be downloaded


    @Test
    public void aggregateDbReport7() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Aggregate Db Report");
        System.out.println("Test Description : User after selecting client and project and Aggregate view,can download the pdf");
        System.out.println("Expected Result : After clicking on PDF , it should be downloaded");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Monty");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("Hussain2");
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport.click();
        Thread.sleep(2000);

        WebElement numberOfDatabases = driver.findElement(By.xpath("//div[@class='row'][3]/div[@class='col'][2]/h5"));
        String getnumberOfDatabases = numberOfDatabases.getText();
        System.out.println("1 :"+getnumberOfDatabases);

        WebElement backBtn = driver.findElement(By.id("Add_Project_Back"));
        backBtn.click();
        Thread.sleep(1000);

        List<WebElement> databasesList = driver.findElements(By.id("tblDelete"));
        databasesList.get(0).click();           // deleting first database item
        Thread.sleep(2000);
        driver.findElement(By.linkText("Yes")).click();

        WebElement viewAggregateReport1 = driver.findElement(By.xpath("//*[contains(text(),'View Aggregated')]"));
        viewAggregateReport1.click();
        Thread.sleep(2000);

        WebElement numberOfDatabases1 = driver.findElement(By.xpath("//div[@class='row'][3]/div[@class='col'][2]/h5"));
        String getnumberOfDatabases1 = numberOfDatabases1.getText();
        System.out.println("2 :"+getnumberOfDatabases1);

        if(getnumberOfDatabases.equals(getnumberOfDatabases1)) {
            System.out.println("Counts before and after delete are same, Before Delete DB : "+getnumberOfDatabases+ " and After Delete DB : "+getnumberOfDatabases1);
        }
        else {
            System.out.println("Counts before and after delete are different, Before Delete DB : " +getnumberOfDatabases+ " and After Delete DB :" +getnumberOfDatabases1);
        }

        Thread.sleep(2000);
        driver.close();

    }           // Delete 1 database from the project screen and verify no of Databases from View Aggregate Report


    // --------------------------------- DB Connection Cases -------------------------------- //


    @Test
    public void dbConnection1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : DB Connection");
        System.out.println("Test Description : User after selecting client and project can see the project name.");
        System.out.println("Expected Result : User can see the project name after get into Project Screen ");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H1");
        Thread.sleep(2000);


        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        WebElement projectNameOnHomeScreen = driver.findElement(By.xpath("//h5"));
        String a = projectNameOnHomeScreen.getText();

        String[] projectNameFromHomPage = a.split(" ");
        String projectNameFromHomePage = projectNameFromHomPage[3];

        if(projectNameFromHomePage == "") {
            System.out.println("Project name is null");
        }
        else {
            System.out.println("Project Name : " + projectNameFromHomePage);
        }

        Thread.sleep(1000);
        driver.close();

    }               // Admin can see Project name on Home Screen


    @Test
    public void dbConnection2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : DB Connection");
        System.out.println("Test Description : User after selecting client and project can see the all the details ");
        System.out.println("Expected Result : When the admin get into Home screen then (User Managment,Switch Project, DB Extraction Info,Logout and View Aggregate Report) buttons should be viewable to him");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        Select selectClientFromDropDown = new Select(driver.findElement(By.xpath("//select[@name='client']")));
        selectClientFromDropDown.selectByVisibleText("Hanzala");
        Thread.sleep(1000);

        WebElement selectClientBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClientBtn.click();
        Thread.sleep(1000);

        Select selectProjectFromDropDown = new Select(driver.findElement(By.name("project")));
        selectProjectFromDropDown.selectByVisibleText("H1");
        Thread.sleep(2000);


        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();
        Thread.sleep(1000);

        WebElement userManagementText = driver.findElement(By.xpath("//*[contains(text(),'User Managment')]"));
        if (userManagementText.isDisplayed()) {                       // asserting if User Management btn is displaying or not
            System.out.println("- User Managment Button is displayed");
        } else {
            System.out.println("- User Managment Button is not displayed");
        }

        WebElement switchProject = driver.findElement(By.xpath("//*[contains(text(),'Switch Project')]"));
        if (switchProject.isDisplayed()) {                       // asserting if Swtich Project btn is displaying or not
            System.out.println("- Switch Project Button is displayed");
        } else {
            System.out.println("- Switch Project Button is not displayed");
        }

        WebElement extractionDBInfo = driver.findElement(By.xpath("//input[@value='Extract Database Information']"));
        if (extractionDBInfo.isDisplayed()) {                       // asserting if Extraction DB Info btn is displaying or not
            System.out.println("- Extraction DB Info Button is displayed");
        } else {
            System.out.println("- Extraction DB Info Button is not displayed");
        }

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregate')]"));
        if (viewAggregateReport.isDisplayed()) {                       // asserting if View Aggregate Report btn is displaying or not
            System.out.println("- View Aggregate Report Button is displayed");
        } else {
            System.out.println("- View Aggregate Report Button is not displayed");
        }

        WebElement logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        if (logout.isDisplayed()) {                        // asserting if Logout btn is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }

        Thread.sleep(1000);
        driver.close();

    }               // Admin can see (User Managment, Switch Project, Extract DB Info, Logout and View Aggregate Report) buttons


    @Test
    public void dbConnection3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : DB Connection");
        System.out.println("Test Description : Creator after selecting project can not see User Managment button");
        System.out.println("Expected Result : When the creator get into Home screen then User Managment button should not be viewable to him");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("creator");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();

        WebElement switchProject = driver.findElement(By.xpath("//*[contains(text(),'Switch Project')]"));
        if (switchProject.isDisplayed()) {                       // asserting if Swtich Project btn is displaying or not
            System.out.println("- Switch Project Button is displayed");
        } else {
            System.out.println("- Switch Project Button is not displayed");
        }

        WebElement extractionDBInfo = driver.findElement(By.xpath("//input[@value='Extract Database Information']"));
        if (extractionDBInfo.isDisplayed()) {                       // asserting if Extraction DB Info btn is displaying or not
            System.out.println("- Extraction DB Info Button is displayed");
        } else {
            System.out.println("- Extraction DB Info Button is not displayed");
        }

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregate')]"));
        if (viewAggregateReport.isDisplayed()) {                       // asserting if View Aggregate Report btn is displaying or not
            System.out.println("- View Aggregate Report Button is displayed");
        } else {
            System.out.println("- View Aggregate Report Button is not displayed");
        }

        WebElement logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        if (logout.isDisplayed()) {                        // asserting if Logout btn is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }

        Thread.sleep(1000);
        driver.close();

    }               // Creator can not see User Managment on Home screen


    @Test
    public void dbConnection4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : DB Connection");
        System.out.println("Test Description : Viewer after selecting project can not see User Managment button");
        System.out.println("Expected Result : When the viewer get into Home screen then User Managment button should not be viewable to him");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("viewer");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();

        WebElement switchProject = driver.findElement(By.xpath("//*[contains(text(),'Switch Project')]"));
        if (switchProject.isDisplayed()) {                       // asserting if Swtich Project btn is displaying or not
            System.out.println("- Switch Project Button is displayed");
        } else {
            System.out.println("- Switch Project Button is not displayed");
        }

        WebElement extractionDBInfo = driver.findElement(By.xpath("//input[@value='Extract Database Information']"));
        if (!extractionDBInfo.isEnabled()) {                       // asserting if Extraction DB Info btn is disabled or not
            System.out.println("- Extraction DB Info Button is disabled");
        } else {
            System.out.println("- Extraction DB Info Button is enabled");
        }

        WebElement viewAggregateReport = driver.findElement(By.xpath("//*[contains(text(),'View Aggregate')]"));
        if (viewAggregateReport.isDisplayed()) {                       // asserting if View Aggregate Report btn is displaying or not
            System.out.println("- View Aggregate Report Button is displayed");
        } else {
            System.out.println("- View Aggregate Report Button is not displayed");
        }

        WebElement logout = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        if (logout.isDisplayed()) {                        // asserting if Logout btn is displaying or not
            System.out.println("- Logout Button is displayed");
        } else {
            System.out.println("- Logout Button is not displayed");
        }

        Thread.sleep(1000);
        driver.close();

    }               // Viewer can not see User Managment on Home screen


    @Test
    public void dbConnection5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : DB Connection");
        System.out.println("Test Description : Viewer after selecting project can not click Extraction DB Info and Re-upload buttons as they are disabled");
        System.out.println("Expected Result : When the viewer at home screen clicks Extraction DB Info and Re-upload buttons, they should not be clicked and should be disabled");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("viewer");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement selectProjectBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        selectProjectBtn.click();


        WebElement extractionDBInfo = driver.findElement(By.xpath("//input[@value='Extract Database Information']"));
        if (!extractionDBInfo.isEnabled()) {                       // asserting if Extraction DB Info btn is disabled or not
            System.out.println("- Extraction DB Info Button is disabled");
        } else {
            System.out.println("- Extraction DB Info Button is enabled");
        }

       WebElement reUpload = driver.findElement(By.xpath("//input[@value='Re-Upload']"));
        if(!reUpload.isEnabled()){
            System.out.println("- Re-upload button is disabled");
        }
        else {
            System.out.println("- Re-upload button is enabled");
        }

        Thread.sleep(1000);
        driver.close();

    }               // Extraction DB Info and Re-upload buttons should be disabled for Viewer



    // --------------------------------- CLient List Cases -------------------------------- //

    @Test
    public void clientList1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Client List");
        System.out.println("Test Description : Check if the no of clients are same as in client dropdown on the dashboard");
        System.out.println("Expected Result : The no. of clients should be equal to the no in Select Client dropdown");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        List<WebElement> clientDropDown = driver.findElements(By.xpath("//select[@name='client']/option"));
        int countOfClientsFromDropDownClients = clientDropDown.size();

        WebElement clientList = driver.findElement(By.xpath("//div/a[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        List<WebElement> clientFromClientlist = driver.findElements(By.xpath("//tbody/tr[@style='font-weight:100;']"));
        int countOfClientFromClientList = clientFromClientlist.size();

        Assert.assertEquals(countOfClientsFromDropDownClients,countOfClientFromClientList,"Assertion - Count of Clients are not same, Count from Dropdown : "+countOfClientsFromDropDownClients+ " and Count from Client List : " +countOfClientFromClientList);
        System.out.println("Assertion - Count of Clients are same, Count from Dropdown : "+countOfClientsFromDropDownClients+ " and Count from Client List : " +countOfClientFromClientList);






        Thread.sleep(1000);
        driver.close();

    }               // Counts of Clients from dropdown and Client list should be equal


    @Test
    public void clientList2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Client List");
        System.out.println("Test Description : When User clicks on Logout button from the  Client List screen, he should get logout");
        System.out.println("Expected Result : User should get logout once he click on Logout button from Client List screen.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement clientList = driver.findElement(By.xpath("//div/a[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        WebElement logoutBtn = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
        logoutBtn.click();
        Thread.sleep(1000);








        Thread.sleep(1000);
        driver.close();

    }              // After clicking logout button from the Client List screen, user should get logged out




    @Test
    public void clientList3() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Client List");
        System.out.println("Test Description : When User clicks on Back button from the Client list screen,then he should get back to the select client screen.");
        System.out.println("Expected Result : User should redirect to the select client screen once he clicks on Back button from Client List screen.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement clientList = driver.findElement(By.xpath("//div/a[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        WebElement backBtn = driver.findElement(By.xpath("//*[contains(text(),'Back')]"));
        backBtn.click();
        Thread.sleep(1000);








        Thread.sleep(1000);
        driver.close();

    }              // After clicking back button from the Client List screen, user should be redirected to Select Client Screen


    @Test
    public void clientList4() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Client List");
        System.out.println("Test Description : When user edit any client's name, it should get updated");
        System.out.println("Expected Result : The client's name should get updated on Client list and also on select client dropdown");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement clientList = driver.findElement(By.xpath("//div/a[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        List<WebElement> editClient = driver.findElements(By.xpath("//tr[@style='font-weight:100;']/td/a[contains(text(),'Edit')]"));
        editClient.get(0).click();              // clicking edit button of first client
        Thread.sleep(2000);

        int min = 0 , max = 1000;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);


      //  WebElement enterClientName = driver.findElement(By.id("c_name-98"));
        Actions act = new Actions(driver);

        WebElement enterClientName = driver.findElement(By.id("c_name-98"));
        act.doubleClick(enterClientName).perform();
        enterClientName.sendKeys(Keys.CLEAR);
        enterClientName.sendKeys("client"+randomNum);
        Thread.sleep(1000);

        WebElement updateClient = driver.findElement(By.id("add_client-98"));
        updateClient.click();
        Thread.sleep(1000);
        driver.close();

    }           // Edit client from Client List page and update Client's name


    @Test
    public void clientList5() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Client List");
        System.out.println("Test Description : When user delete any client it should not get deleted if it's used in Project/Users");
        System.out.println("Expected Result : The client should not get deleted if it is used in any Project.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement clientList = driver.findElement(By.xpath("//div/a[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        List<WebElement> deleteClient = driver.findElements(By.xpath("//tr[@style='font-weight:100;']/td/a[contains(text(),'Delete')]"));
        deleteClient.get(0).click();              // clicking delete button of first client
        Thread.sleep(2000);

        driver.findElement(By.linkText("Yes")).click();




        Thread.sleep(1000);
        driver.close();

    }           // The client should not get deleted if it is used in any Project.


    @Test
    public void clientList6() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Client List");
        System.out.println("Test Description : When user delete any client and if the client is not associated with any project then it should get deleted");
        System.out.println("Expected Result : TThe client should get deleted successfully.");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement clientList = driver.findElement(By.xpath("//div/a[contains(text(),'Client List')]"));
        clientList.click();
        Thread.sleep(2000);

        List<WebElement> deleteClient = driver.findElements(By.xpath("//tr[@style='font-weight:100;']/td/a[contains(text(),'Delete')]"));
        deleteClient.get(0).click();              // clicking delete button of first client
        Thread.sleep(2000);

        driver.findElement(By.linkText("Yes")).click();




        Thread.sleep(1000);
        driver.close();

    }           // The client should get deleted if client is not associated with any project.



            // --------------------------------- Project List Cases -------------------------------- //


    @Test
    public void projectList1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Maven Project\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("Test Scenario : Project List");
        System.out.println("Test Description : Check if the no of projects are same as in project dropdown on the dashboard");
        System.out.println("Expected Result : The no of projects should be equal to the no in Select Project dropdown");
        System.out.println("\n");

        driver.get("https://starm-assessment-dev.mlogica.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ankur1234");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement signInBtn = driver.findElement(By.xpath("//b[contains(text(),'Sign')]"));
        signInBtn.click();
        Thread.sleep(2000);

        WebElement selectClient = driver.findElement(By.xpath("//button[@type='submit']"));
        selectClient.click();
        Thread.sleep(1000);

        List<WebElement> projectDropDown = driver.findElements(By.xpath("//select[@name='project']/option"));
        int countOfProjectsFromDropDownProjects = projectDropDown.size();

        WebElement projectList = driver.findElement(By.xpath("//div/a[contains(text(),'Project List')]"));
        projectList.click();
        Thread.sleep(2000);

        List<WebElement> projectFromProjectList = driver.findElements(By.xpath("//tbody/tr[@style='font-weight:100;']"));
        int countOfProjectsFromProjectList = projectFromProjectList.size();

        Assert.assertEquals(countOfProjectsFromProjectList,countOfProjectsFromDropDownProjects,"Assertion - Count of Projects are not same, Count from Dropdown : "+countOfProjectsFromDropDownProjects+ " and Count from Client List : " +countOfProjectsFromProjectList);
        System.out.println("Assertion - Count of Projects are same, Count from Dropdown : "+countOfProjectsFromDropDownProjects+ " and Count from Project List : " +countOfProjectsFromProjectList);

        Thread.sleep(1000);
        driver.close();

    }               // Counts of Project from dropdown and Project list should be equal







}



