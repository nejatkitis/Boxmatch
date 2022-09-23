package BoxMatch;

import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;


    Ring(Fighter f1,Fighter f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public void run(){
        Random random = new Random();
        while (f1.healt>0 || f2.healt>0){
            int a1 = random.nextInt(100);
            int a2 = random.nextInt(100);
           // System.out.println("a1:"+a1+" a2:"+a2);
            if (a1>a2){
                double a3 = ((a1*10.0)-(a2*10.0))/300;
                f2.healt -= f1.damage*a3;
                System.out.println(f1.name+" , "+(f1.damage*a3)+" hasar verdi , "+f2.name+" canı "+f2.healt);
            } else if (a2>a1){
                int a4 = (a2-a1)/50;
                f1.healt -= f2.damage*a4;
                System.out.println(f2.name+" , "+(f2.damage*a4)+" hasar verdi , "+f1.name+" canı "+f1.healt);
            } else continue;
        }
        whowin();
    }
    public void whowin(){
        if (f1.healt>f2.healt){
            System.out.println(f1.name+" Kazanmıştır.");
        } else {
            System.out.println(f2.name+" Kazanmıştır.");
        }
    }
}
