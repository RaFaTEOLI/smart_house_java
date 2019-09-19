import view.FrmPrincipal;
import dao.DaoLogin;
import view.FrmLogin;

public class Login {
    FrmLogin telaLogin = new FrmLogin();
    DaoLogin d = new DaoLogin();
    
    public Login() {
        telaLogin.hideThings();
        telaLogin.setVisible(true);
    }
    
    public static void main(String[] args) {
        Login l = new Login();
    }
}