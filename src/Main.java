import Enums.NameTypes;
import Persons.*;

public class Main {
   public static void main(String args[]){
       FatBoy fatBoy = new FatBoy();
       FrekenBok frekenBok = new FrekenBok();
       Uncle uncle = new Uncle();
       Mother mother = new Mother();

       System.out.print(fatBoy);
       fatBoy.takeItem();
       mother.watering();
       fatBoy.watering();
       uncle.setAnotherName(NameTypes.FIRST);
       System.out.println(uncle);
       uncle.setAnotherName(NameTypes.DEFAULT);
       uncle.help();
       uncle.openEyes();
       frekenBok.help();
       uncle.setAnotherName(NameTypes.SECOND);
       System.out.println(uncle);
       frekenBok.clean();
       uncle.setAnotherName(NameTypes.FIRST);
       System.out.println(uncle);
       frekenBok.lead(uncle);
       frekenBok.speak();
       uncle.setAnotherName(NameTypes.THIRD);
       frekenBok.explain(uncle);
       System.out.println(fatBoy + fatBoy.description);
       frekenBok.explain(uncle);
       fatBoy.thinkUp();
   }
}
