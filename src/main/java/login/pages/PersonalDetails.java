package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PersonalDetails extends CommonMethods {


    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoOpt;
    @FindBy(xpath = "//a[contains(text(), 'Personal Details')]")
    private WebElement personalDetails;
    @FindBy(xpath = "//h6[normalize-space()='Personal Details']")
    private WebElement persDetailsText;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement nameTxt;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement middleNametxt;
    @FindBy(xpath = "//div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
    private WebElement driverLicenseTxt;
    @FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement licenseExp;
    @FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
    private WebElement calendarTodaybtn;
    @FindBy(xpath = "//form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement nationality;
    @FindBy(xpath = "//form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]//div")
    private List<WebElement> nationalityList;
    @FindBy(xpath = "//form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElement maritalStatus;
    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[1]/div[2]//div")
    private List<WebElement> maritalStatusList;
    @FindBy(xpath = "//div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
    private WebElement genderMale;
    @FindBy(xpath = "//label[normalize-space()='Female']")
    private WebElement genderFemale;
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    private WebElement smokerCheck;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
    private WebElement savePersDetails;
    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//button[@type='submit'][normalize-space()='Save']")
    private WebElement saveCustField;
    @FindBy(xpath = "//div[@role = 'listbox']//div")
    private List<WebElement> bloodTypeList;
    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//form[@class='oxd-form']//div[1]//div[1]//div//div[1]//div//div[1]//div[1]//div[1]")
    private WebElement bloodType;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addBtn;
    @FindBy(xpath = "//input[@type = 'file']")
    private WebElement browseDoc;
    @FindBy(xpath = "//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']")
    private WebElement saveBtnAttach;
    @FindBy(xpath = "//div[3]//button[@type = 'submit']")
    private WebElement saveBtnEdit;
    @FindBy(xpath = "//div[@class='orangehrm-container']//button[1]")
    private WebElement editBtn;
    @FindBy(xpath = "//div[@class='orangehrm-container']//button[3]")
    private WebElement downloadBtn;
    @FindBy(xpath = "//div[@class='orangehrm-container']//button[2]")
    private WebElement deleteBtn;
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    private WebElement yesDeleteBtn;

    public void goToPage() {
        click(myInfoOpt);
    }

    public void name(String name) {
        clear(nameTxt);
        addText(name, nameTxt);
    }

    public void middleName(String middleName) {
        clear(middleNametxt);
        addText(middleName, middleNametxt);
    }

    public void driverLicense(String license) {
        clear(driverLicenseTxt);
        addText(license, driverLicenseTxt);
    }

    public void licenseDate() {
        click(licenseExp);
        click(calendarTodaybtn);
    }

    public void nationality(String nationalityText) {
        click(nationality);
        click(returnElementFromList(nationalityList, nationalityText));
    }

    public void maritalStatus(String maritalstatus) {
        click(maritalStatus);
        click(returnElementFromList(maritalStatusList, maritalstatus));
    }

    public void dateofBirth() {
        click(dateOfBirth);
        click(calendarTodaybtn);
    }

    public void gender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            click(genderMale);
        } else {
            click(genderMale);
        }
    }

    public void smoker() {
        click(smokerCheck);
    }

    public void save() {
        click(savePersDetails);
    }

    public void bloodType(String bloodType) {
        moveElement();
        click(this.bloodType);
        click(returnElementFromList(bloodTypeList, bloodType));
    }

    public void saveCustField() {
        click(saveCustField);
    }


    public void deleteFile() {
        click(deleteBtn);
        click(yesDeleteBtn);
    }

    public void downloadFile() {
        click(downloadBtn);
    }
}
