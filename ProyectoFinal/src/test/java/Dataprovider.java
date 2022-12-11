import org.testng.annotations.Test;

public class Dataprovider {


    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String usuario, String passwd){
        System.out.println(usuario+"     "+passwd);
    }

}
