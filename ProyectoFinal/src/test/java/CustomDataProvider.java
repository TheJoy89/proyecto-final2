import org.testng.annotations.DataProvider;

public class CustomDataProvider {


    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){

        Object[][] data ={{"Usuario: prueba1", "Password: prueba1"},{"Usuario: prueba2", "Password: prueba2"},
                {"Usuario: prueba3","Password: prueba3\n"}};

        return data;
    }


}
