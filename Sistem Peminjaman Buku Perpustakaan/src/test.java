
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hilman Fauzi Rijal
 */
public class test {

    public void main(String[] args) {
        
        Date a= new Date(),b = new Date();
        b.setTime(a.getTime()+86400000);
        System.out.println(b.getMonth());
        System.out.println(a.getMonth());
        Admin adm = new Admin();
        Scanner in = new Scanner(System.in);
        boolean passLogin = false;
        while (!passLogin) {
            System.out.print("id : ");
            String id = in.next();
            System.out.print("pass : ");
            String pass = in.next();

            if (adm.adminLogin(id, pass)) {
                
            }
        }
    }
}
