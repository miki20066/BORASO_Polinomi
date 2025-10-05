//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                retta r = new retta(3.0, -6.0);
                r.soluzioni();

                System.out.println("Coefficienti: " + r.stampaCoeficenti());
                System.out.println("Soluzione: " + r.stampaSoluzioni());

                parabola p = new parabola(1.0, -5.0, 6.0);
                p.soluzioni();

                System.out.println("Coefficienti: " + p.stampaCoeficenti());
                System.out.println("Soluzioni: " + p.stampaSoluzioni());


            }
        }