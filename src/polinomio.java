import java.util.ArrayList;

public abstract class polinomio {

    ArrayList<Double> coeficenti=new ArrayList<Double>();
    ArrayList<Double> soluzioni= new ArrayList<Double>();

    public String stampaCoeficenti(){
        String msg="";

        for(int i=0;i<coeficenti.size();i++){
            msg+=coeficenti.get(i)+" ";

        }
        return msg;
    }
    public String stampaSoluzioni(){
        String msg="";

        for(int i=0;i<soluzioni.size();i++){
            msg+=soluzioni.get(i)+" ";

        }
        return msg;
    }
}

 class retta extends polinomio{



    public retta(Double coeficente1,Double coeficente2){
    coeficenti.add(coeficente1);
    coeficenti.add(coeficente2);
    }

    public void soluzioni(){
        Double ris=(-coeficenti.get(1))/coeficenti.get(0);
        soluzioni.add(ris);
    }

}

class parabola extends polinomio{

   public parabola(Double coeficente1, Double coeficente2, Double coeficente3){
       coeficenti.add(coeficente1);
       coeficenti.add(coeficente2);
       coeficenti.add(coeficente3);

   }

   public void soluzioni() {

       double a=coeficenti.get(0);
       double b=coeficenti.get(1);
       double c=coeficenti.get(2);
        double ris1;
        double ris2;
       double delta= b*b-4*a*c;
       if(delta>0){
           ris1= (-b+Math.sqrt(delta))/(2*a);
           ris2=(-b-Math.sqrt(delta))/(2*a);
           soluzioni.add(ris1);
           soluzioni.add(ris2);

       }else if(delta==0){
        ris1=(-b/(2*a));
        soluzioni.add(ris1);


       }else{System.out.println("Nessuna soluzione reale");}
   }

}
